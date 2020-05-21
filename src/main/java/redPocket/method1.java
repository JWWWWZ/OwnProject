package redPocket;

/**
 * Title: TRS 内容协作平台（TRS WCM）
 * Description: 法一
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2018/10/11 0011
 * @author jiangwenzhu
 * @version 1.0
 */

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

/**
 * 思路及注意的点：
 * 1、首先没人至少红包中有钱
 * 2、循环分配钱，一直到剩余的钱不再大于1
 * 3、将剩余的钱放到第一个红包中
 */

public class method1 {

	private static final int INIT_MONEY = 1;  // 每个红包初始1角

	private static final int FIRST_POCKET_INDEX = 0;  // 第一个红包

	private static final int MINIFICATION = 100;  // 放大倍数

	public static void main(String[] args){

		int num = 10;
		double money = 100.5;
		int[] redPockets = getRedEnvelope(num, money);
		BigDecimal total = new BigDecimal(0);

		for(int i = 0 ; i < redPockets.length ; i++){
			double itemPocket = ((double)redPockets[i]);
			double eachMoney = itemPocket / MINIFICATION;
			System.out.println("第" + (i + 1) + "个红包中的金额为：" + eachMoney);
			total = total.add(new BigDecimal(eachMoney));
		}

		System.out.println("总金额为:" + total.doubleValue());
	}

	/**
	 * 获取红包数组
	 * @param num：分配的红包个数
	 * @param money：分配的红包金额
	 * @return
	 */
	private static int[] getRedEnvelope(int num, double money){

		int totalMoney = (int) (money * MINIFICATION);
		int remainMoney = totalMoney;

		// 为每个红包设置初始值
		int[] redNum = new int[num];
		Arrays.fill(redNum, INIT_MONEY);
		remainMoney -= (INIT_MONEY * num); // 剩余的钱要减去已经分配的

		// 循环为每个红包分配后续的值
		int count = 0;
		Random random = new Random();
		while(remainMoney > 1){
			int randomMoney = random.nextInt(remainMoney);
			redNum[count++ % num] += randomMoney;
			remainMoney -= randomMoney;
		}

		System.out.println("分配红包总执行次数:" + count);

		if(remainMoney > 0){
			redNum[FIRST_POCKET_INDEX] += remainMoney;
		}

		return redNum;
	}
}

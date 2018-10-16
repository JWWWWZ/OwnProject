package printChineseCharacter;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: TRS 内容协作平台（TRS WCM）
 * Description: 将数字转换成汉字输出
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2018/10/16 0016
 * @author jiangwenzhu
 * @version 1.0
 */

public class method1 {

	private static final String[] MEASUREDESC = {"", "十", "百", "千", "万", "十", "百", "千", "忆", "十", "百", "千"};

	private static final String[] DANWEI = {"", "万", "忆"};

	public static void main(String[] args){

		int testNum = 100000001;
		System.out.println(transferIntoChinese(getEachDigitalPostion(testNum)));
	}

	private static String transferIntoChinese(String[] digitals){

		StringBuilder sb = new StringBuilder();
		Map<String, String> numDesc = initNumDesc();
		boolean preDigtalZero = false;
		boolean existsTailFlag = false;
		int numPosCount = digitals.length - 1;

		for(int pos = 0 ; pos < digitals.length ; pos++){

			String value = digitals[pos];
			if(currPosIsZero(value)){
				if(!preDigtalZero && !endOfEachStage(numPosCount)){
					sb.append(numDesc.get(value));
				}
				preDigtalZero = true;
			}else{
				sb.append(numDesc.get(value)).append(MEASUREDESC[numPosCount]);
				preDigtalZero = false;
				existsTailFlag = true;
			}

			if(endOfEachStage(numPosCount)){

				if(!existsTailFlag){
					sb.append(DANWEI[(numPosCount / 4)]);
				}

//				if(pos + 1 < digitals.length && value.equals("0")){
//					sb.append(initNumDesc().get("0"));
//				}
			}

			numPosCount--;
		}
		return sb.toString();
	}

	private static String[] getEachDigitalPostion(int num){

		String numStr = String.valueOf(num);
		return numStr.split("");
	}

	private static Map<String, String> initNumDesc(){

		Map<String, String> numDesc = new HashMap<>();
		numDesc.put("0", "零");
		numDesc.put("1", "一");
		numDesc.put("2", "二");
		numDesc.put("3", "三");
		numDesc.put("4", "四");
		numDesc.put("5", "五");
		numDesc.put("6", "六");
		numDesc.put("7", "七");
		numDesc.put("8", "八");
		numDesc.put("9", "九");
		return numDesc;
	}

	private static boolean endOfEachStage(int pos){

		boolean result = false;

		if(pos % 4 == 0){
			result = true;
		}
		return result;
	}

	private static boolean currPosIsZero(String value){

		boolean result = false;
		if(value.equals("0")){
			result = true;
		}
		return result;
	}
}

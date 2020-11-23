package Concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/12 0012
 * @author jiangwenzhu
 * @version 1.0
 */

public class AddNum {

	public static void main(String[] args){

		int num = 20;
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < num ; i++){

			list.add(i);
			if(list.size() == 5){
				System.out.println(list.hashCode());
				concurrent(list);
				list = new ArrayList<>();
			}

		}
	}

	private static void concurrent(List<Integer> list){
		System.out.println(list.hashCode());
//		new Thread(){
//
//			@Override
//			public void run() {
//				for(int i : list){
//					System.out.println(i + "[" + this.getId() + "]");
//				}
//			}
//		}.start();
	}

}

package sameStr;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/20 0020
 * @author jiangwenzhu
 * @version 1.0
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 方法二 滑动窗口法
 */
public class method2 {


	private static int maxLength(String s){

		int max = 0;
		if(s.length() == 1){
			max = 1;
		}else{
			for(int i = 0 ; i < s.length() ; i++){
				Set<Character> list = new HashSet<>();
				list.add(s.charAt(i));
				for(int j = i + 1 ; j < s.length() ; j++){
					if(!list.contains(s.charAt(j))){
						max = Math.max(max, j - i + 1);
					}
				}
			}
		}

		return max;
	}

	public static void main(String[] args){
		System.out.println(maxLength(" "));
	}
}

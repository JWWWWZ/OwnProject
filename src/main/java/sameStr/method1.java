package sameStr;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/20 0020
 * @author jiangwenzhu
 * @version 1.0
 */

/**
 * 方法一：暴力法
 * 获取无重复最长字符串
 */
public class method1 {

	public static int lengthOfLongestSubstring(String s) {

		int max = 0;
		for(int i = 0 ; i < s.length(); i++){

			for(int j = i + 1 ; j <= s.length() ; j++){

				if(allUnique(s, i, j)){
					max = Math.max(max, j - i);
				}
			}
		}
		return max;
	}

	private static boolean allUnique(String s, int i, int j){

		Set<Character> set = new HashSet<>();
		boolean result = false;
		for( ; i < j ; i++){
			char temp = s.charAt(i);
			if(set.contains(temp)){
				result = false;
				return result;
			}else{
				set.add(temp);
			}
			result = true;
		}
		return result;
	}

	public static void main(String[] args){
		System.out.println(lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
	}
}

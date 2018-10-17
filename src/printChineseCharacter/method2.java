package printChineseCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Title: TRS 内容协作平台（TRS WCM）
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2018/10/17 0017
 * @author jiangwenzhu
 * @version 1.0
 */

public class method2 {

	private static final String[] MEASUREDESC = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};

	private static final String[] DANWEI = {"", "万", "亿"};

	public static void main(String[] args){
		int num = 11000;

		String numStr = replaceZeroWithAsterrisk(String.valueOf(num));

		String[] eachDigital = numStr.split("");

		System.out.println(transferNumToChinese(eachDigital));
	}

	private static Map<String, String> initNumDesc(){

		Map<String, String> numDesc = new HashMap<>();
		numDesc.put("*", "");
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

	private static String transferNumToChinese(String[] num){

		StringBuilder sb = new StringBuilder();
		int digitalNum = num.length - 1;

		for(int i = 0 ; i < num.length ; i++){

			String value = num[i];
			sb.append(initNumDesc().get(value)).append(MEASUREDESC[digitalNum]);

			if(digitalNum % 4 == 0){
				sb.append(DANWEI[digitalNum / 4]);
			}
			digitalNum--;
		}
		return sb.toString();
	}

	private static String replaceZeroWithAsterrisk(String num){

		String regex = "0{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(num);
		while(matcher.find()){
			String findStr = matcher.group();

			num = num.replace(findStr, replaceChar(findStr));
		}
		return num;
	}

	private static String replaceChar(String findStr){

		int length = findStr.length();
		StringBuilder sb = new StringBuilder();
		sb.append("0");

		for(int i = 0 ; i < length - 1 ; i++){
			sb.append("*");
		}
		return sb.toString();
	}


}

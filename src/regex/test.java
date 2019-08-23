package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/22 0022
 * @author jiangwenzhu
 * @version 1.0
 */

public class test {

	public static void main(String[] args)
	{


		String s = "文件层级： ${wjcj}";
		String pattern = "\\{.*\\}";
		Pattern pattern1 = Pattern.compile(pattern);
		Matcher m = pattern1.matcher(s);
		System.out.print("a");

	}
}

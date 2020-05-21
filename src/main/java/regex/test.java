package regex;

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


//		String s = "文件层级： ${wjcj}";
//		String pattern = "\\{.*\\}";
//		Pattern pattern1 = Pattern.compile(pattern);
//		Matcher m = pattern1.matcher(s);


		String s = "<html>\n"
				+ " <head>\n"
				+ "  <style>p{margin-top:0pt;margin-bottom:1pt;}p.X1{text-align:justified;}span.X1{font-family:'Calibri';font-size:10.0pt;}</style>\n"
				+ " </head>\n"
				+ " <body>\n"
				+ "  <div style=\"width:595.0pt;margin-bottom:72.0pt;margin-top:72.0pt;margin-left:90.0pt;margin-right:90.0pt;\">\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">文件层级：市级</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">所属行业：建筑业</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">发文单位：市政府</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">联合单位：无</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span id=\"_GoBack\"></span><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">发文时间：2019-08-23</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">有效时限：无</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">文件名称：111</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">发文字号：111</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">政策分类：知识产权、综合类</span></p>\n"
				+ "   <p style=\"text-align:left;\"><span style=\"font-family:'方正仿宋_GBK';font-size:16.0pt;\">附件：无</span></p>\n"
				+ "  </div>\n"
				+ " </body>\n"
				+ "</html>";
		String duplicateStyle = "<style>.*</style>";
		s.replaceAll(duplicateStyle, "");
		System.out.print("a");

	}
}

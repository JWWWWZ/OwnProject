/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/09/18 0018
 * @author jiangwenzhu
 * @version 1.0
 */

public class StringTest {

	public static void main(String[] args) {

		String sWCMURL = "http://10.11.2.116:8080/2020/09/28/MjAwOTI4NzkwOTU3MDkz.html";
		sWCMURL = sWCMURL.replaceAll("//", "");
		int pos = sWCMURL.indexOf("/");
		sWCMURL = sWCMURL.substring(pos);
		int nPos = sWCMURL.lastIndexOf('/', sWCMURL.length() - 2);

		System.out.println(sWCMURL.substring(0, nPos));
	}
}

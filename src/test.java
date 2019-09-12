import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/04/03 0003
 * @author jiangwenzhu
 * @version 1.0
 */

public class test {

	public static void main(String[] args) throws IOException {
//		Map<String, String> result = new HashMap<>();
//		result.put(null, "123");
//
//
//		System.out.println("放入");
//
//		System.out.println(result.get(null));


//		double i = -2.9d;
//		System.out.println(Math.round(i));


//		String a = "1_23_45_";
//		int i = a.lastIndexOf('_');
//		if(i + 1 < a.length()){
//			System.out.println(a.substring(i + 1, a.length()));
//		}

//		String licenseCode = "IDS@1.Z5G5QPCK-G6BDHC06-1GA8TPK4-PU4AFZDA-0FCCPCYU-AP4AGWAP";
//		String info = licenseCode.substring(0, licenseCode.indexOf('-'));
//		System.out.println("info：" + info);
//		int nodeAmount = info.charAt(1) - '0';
//		System.out.println("nodeAmount：" + nodeAmount);
//		char licenseType = info.charAt(0);
//		System.out.println("licenseType：" + licenseType);

//		String[] items = new String[]{"a", "b", "c"};
//		List<String> array = new ArrayList<>(Arrays.asList(items));
//		System.out.println(array);
//		List<String> item = Arrays.asList(items);
//		System.out.println(item);
//		item.contains("a");
//		System.out.println(item.contains("a"));
//		String s ="2019-09-12";
//		String[] s1 = s.split("-");
//		System.out.println("a");

        for(int i = 0 ; i < 1 ; i ++){
            test(i);
        }

	}

	private static void test(int i) throws IOException {
//		String path = "http://113.207.112.58:81/gov/opendata.do?recId=151&methodname=getPropertyDataByRecId&serviceId=gov_webdocument&currUserName=admin";
		String path = "http://192.168.200.170/mas/openapi/pages.do?method=exPlay&appKey=gov&id=1741&autoPlay=false";
		URL url = new URL(path);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		PrintWriter writer;
		connection.setRequestProperty("user-agent",
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
        connection.setDoOutput(true);
        connection.setDoInput(true);
		writer = new PrintWriter(connection.getOutputStream());
		writer.flush();
		InputStream inputStream = connection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		String str;
		String result = "";
		while((str = br.readLine()) != null){
			result += str;
		}
		br.close();
		connection.disconnect();
		System.out.println(i + "、" + result);
	}

}

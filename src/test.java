import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/04/03 0003
 * @author jiangwenzhu
 * @version 1.0
 */

public class test {

	public static void main(String[] args){
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

		String[] items = new String[]{"a", "b", "c"};
		List<String> array = new ArrayList<>(Arrays.asList(items));
		System.out.println(array);
		List<String> item = Arrays.asList(items);
		System.out.println(item);
		item.contains("a");
		System.out.println(item.contains("a"));
	}

}

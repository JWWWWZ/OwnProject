package String;

import java.text.ParseException;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/28 0028
 * @author jiangwenzhu
 * @version 1.0
 */

public class test {

	public static void main(String[] args) throws ParseException {

//		String fieldValue = "金融服务`2~税收优惠`5~知识产权`1~司法公正`11~人力资源`4~社会保障`6~奖励补贴`7";
//
//		String[] fieldItems = fieldValue.split("~");
//
//		Map<Integer, String> items = new HashMap<>();
//		List<Integer> idList = new ArrayList<>();
//
//		for(int i = 0 ; i < fieldItems.length ; i++){
//			String fieldItem = fieldItems[i];
//			String[] itemMapping = fieldItem.split("`");
//			if(itemMapping.length > 1){
//				int key = Integer.parseInt(itemMapping[1]);
//				String value = itemMapping[0];
//				idList.add(key);
//				items.put(key, value);
//			}
//		}
//		Collections.sort(idList);
//
//		StringBuilder sortedFieldValue = new StringBuilder();
//		for(int i = 0 ; i < idList.size() ; i++){
//			int index = idList.get(i);
//			sortedFieldValue.append(items.get(index)).append("`").append(index).append("~");
//		}
//
//		if(sortedFieldValue.length() > 0){
//			sortedFieldValue.deleteCharAt(sortedFieldValue.length() - 1);
//		}
//
//		System.out.print("A");
		// 字符串替换
//		String s = "金融服务`2~项目申报`8~创新创业`9~项目申报`12~创新创业`15";
//		System.out.println(s.replaceAll("`.~", ","));

		// 获取当前时间
//		Date date = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(dateFormat.format(date));
//		//时间比大小
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		Date begin = df.parse("2017-07-30");
//		Date end = df.parse("2017-09-30");
//
//		if(begin.before(end)){
//			System.out.println("before在end前");
//		}

//		GregorianCalendar d = new GregorianCalendar();
//
//		System.out.println(d.get(GregorianCalendar.AM_PM));

//		Set<Integer> set = new HashSet<>();
//
//		System.out.println(System.currentTimeMillis());
//
//		for(int i = 0 ; i < 6000 ; i++){
//			set.add(i);
//		}
//
//
//		if(set.contains(1)){
//			System.out.println(true);
//		}
//
//		System.out.println(System.currentTimeMillis());

//
//		Set<String> set = new HashSet<>();
//		Iterator<String> it = set.iterator();
//
//		while (it.hasNext()){
//			String str = it.next();
//		}
//
//		String generateTable = "WCMMETATABLEGOVINFO*";
//		String table = "WCMMETATABLEGOVINFO_CITY7";
//
//		if(table.toUpperCase()
//				.startsWith(generateTable.substring(0, generateTable.length() - 1)
//						.toUpperCase())){
//
//		}

		String json = "[\n"
				+ "            {\n"
				+ "                \"ROLETYPE\":\"0\",\n"
				+ "                \"SYSDEFINED\":\"0\",\n"
				+ "                \"CRTIME\":\"2019-11-13 09:58:22\",\n"
				+ "                \"ROLERANGE\":\"0\",\n"
				+ "                \"ROLEORDER\":\"7\",\n"
				+ "                \"OBJID\":\"3\",\n"
				+ "                \"ROLENAME\":\"金牛区[3]-网站-站点管理员\",\n"
				+ "                \"VIEWABLE\":\"1\",\n"
				+ "                \"RIGHTTEMPLATEID\":\"1\",\n"
				+ "                \"REMOVEABLE\":\"1\",\n"
				+ "                \"OBJTYPE\":\"103\",\n"
				+ "                \"CRUSER\":\"dev\",\n"
				+ "                \"RIGHTVALUE\":\"0\",\n"
				+ "                \"ROLEID\":\"8\"\n"
				+ "            }\n"
				+ "        ]";

	}
}

package freeMarker;

import java.io.IOException;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/08/12 0012
 * @author jiangwenzhu
 * @version 1.0
 */

public class Test {

	/**
	 * pom中引入
	 * <dependency>
	 <groupId>org.freemarker</groupId>
	 <artifactId>freemarker</artifactId>
	 <version>2.3.23</version>
	 </dependency>
	 即可
	 * @throws IOException
	 */
	private static void in() throws IOException{
//		Configuration configuration = new Configuration();
//		/** 设置编码 **/
//		configuration.setDefaultEncoding("utf-8");
//		/** ftl文件**/
//		String fileDirectory = "E://";
//		/** 加载文件 **/
//		configuration.setDirectoryForTemplateLoading(new File(fileDirectory));
//		/** 加载模板 **/
//		Template template = configuration.getTemplate("abc.ftl");
//		/** 准备数据 **/
////            Map<String,List<WordOne>> dataMap = new HashMap<>();
//		Map<String,Object> dataMap = new HashMap<>();
//
//		String content = "";
//		content = "$号称是航天界“奥林匹克”的国际比赛中,中国参赛队伍首次夺冠，一举打破了欧美参赛队对该赛事冠军的垄断。";
//		dataMap.put("content", content);
//		dataMap.put("contentontent1", "hello");
//
//		/** 指定输出word文件的路径 **/
//		File f = new File("E://test");
//		if(!f.exists())
//			f.mkdir();
//
//
//
//		String outFilePath = f.getCanonicalPath() + "//test.doc";
//		File docFile = new File(outFilePath);
//		FileOutputStream fos = new FileOutputStream(docFile);
//		Writer out = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"),10240);
//		template.process(dataMap,out);
//
//		if(out != null){
//			out.close();
//		}
	}

	public static void main(String[] args){
		try {
			in();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

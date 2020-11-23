import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sdt.sccs.crypto.hl.ISDTHLCipher;
import com.sdt.sccs.crypto.hl.SDTHLCipher;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.UUID;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.util.DigestUtils;


/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/04/03 0003
 * @author jiangwenzhu
 * @version 1.0
 */

public class test {

	//接口公钥
	public final static String PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCDyp62JdGVub6Hj/TdcCLm5yAv3QG9Ajlmbb15bKFBOHVgY3WJVUSfF8lwZADcEU17aBsQWJdE/OfagX6/MK9U8ROIq1i/bRuMmDBb4nSXN6qW5fC1BXeVkPJXOc6/kh+u3q1ak6Vq1briF/xtj8YzRxyTGkF2T+MgHeWc5UwhwQIDAQAB";
	//接口私钥
	public final static String PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKiJFFsJDVa/44MM60tHaQnZaG33gCUur2k8SorLRVUWt+XvunlgxUKzyhP0XW3j3ZISOTxWjwFc0kETXB95utcrj80qTqFYmJQNRxD8F+vXaYbBIhkmW7Ti57G3ML9/rsCKhC8av3ChHut1yaSuff+8R7JsvpXea0+u7L4zd8AVAgMBAAECgYBHU3xh6rrSc/N9iwIpodc6a+Beadi548Ao8XM6ujxlfm/lyEdLB0F0sVJcj5ba4wzqvPusJZXwJbB2ChN63rHLnm4dth0zP+fi9YLjcIcxpx1FJ0Qm0XZflxZTtrJ4BxigaVFGdlF7VmRGHH7hF0XozSEyRK3mO8P0ydwgQtvzAQJBANw3J4G05b54jodJOqs/DoXisjyTaB2p5IkoTIuOmIb7yBHCxLbRhOoYS43oPdsM3rqb9BdI4DpXxGWQE0WGuT0CQQDD7BDCkKNV8VQvnqZc28xG+kZo2w8NmAjJfD/owIMIyjwEONC8KuWDfWPeFnC8yFUI9mZ8JmEnV4t0U+9jO5+5AkEAz2xcF/5uUGR5y9AcJOT2JwIK5Kfr79Tw4IhG4UTlQm+yWZhddd4QFffgYsAYU1XiDV+MIMqR+iJlaUy1+k0V+QJAS+ETpKcr+08aEc9aE0C1Xw/zUQz2SYeGb7KFdfmJRlA86k2u2hGrDj/z+8GpLBRSisQTcSXUHs6THhyb7EzdUQJAMJkJtYMqAbAAail6oqGZXmTAypj1MoUIVdFljQ7a9UTmCrjVmh3jp74u867Rg8INWDQuElz3Qho18Ev1F51VFw==";

//	public static void main(String[] args){

//		String s = "<div class=\"view TRS_UEDITOR trs_paper_default trs_web\"><p align=\"\" style=\";padding: 0px;font-size: 16px;white-space: normal;text-align: justify\">各省、自治区、直辖市人民政府，国务院各部委、各直属机构：</p><p align=\"\" style=\";padding: 0px;font-size: 16px;white-space: normal;text-indent: 2em;text-align: justify\">为加强社会信用体系建设，深入推进“放管服”改革，进一步发挥信用在创新监管机制、提高监管能力和水平方面的基础性作用，更好激发市场主体活力，推动高质量发展，经国务院同意，现提出如下意见。</p><p><br/></p></div>";
//		String s = "<p style=\"margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em\">\n"
//				+ "    国务院总理李克强8月22日上午在人民大会堂会见来华出席中日韩外长会的韩国外长康京和、日本外相河野太郎。\n"
//				+ "</p>\n"
//				+ "<p style=\"text-align:center;margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255)\">\n"
//				+ "    <img src=\"http://www.gov.cn/premier/2019-08/22/5423504/images/be25c3eb8ba3465596ea17d4ce6a9cbd.jpg\" border=\"0\" style=\"border: none;padding: 0px\"/><br/>\n"
//				+ "</p>\n"
//				+ "<p style=\"margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em\">\n"
//				+ "    李克强祝贺中日韩外长会成功举行。他表示，今年是中日韩合作启动20周年。三国地缘相近，人文相通，经济互补性强，合作潜力巨大。在当前世界经济不稳定不确定性继续上升、全球经济贸易下行压力增大背景下，中日韩加强合作不仅有利于自身发展，也将为地区和世界经济发挥“稳定器”和“推进器”作用。中方高度重视中日韩合作，愿同韩方、日方一道，推动三国合作向更高层次迈进。\n"
//				+ "</p>\n"
//				+ "<p style=\"text-align:center;margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255)\">\n"
//				+ "    <img src=\"http://www.gov.cn/premier/2019-08/22/5423504/images/841682cdc5874dedbbd4c6359f79d28c.jpg\" border=\"0\" style=\"border: none;padding: 0px\"/><br/>\n"
//				+ "</p>\n"
//				+ "<p style=\"margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em\">\n"
//				+ "    李克强指出，中日韩合作取得很大发展，重要性和必要性还将进一步凸显。三国应当维护以规则为基础、以世贸组织为核心的多边贸易体制，争取早日达成全面、高水平的中日韩自贸协定，促进贸易和投资自由化便利化。共同推动科技创新，共享发展机遇和创新成果。共同促进发展繁荣，推进东亚合作。共同维护地区和平稳定，为政治解决朝鲜半岛问题、实现半岛无核化和地区持久和平作出积极贡献。密切人员往来，增进人民之间相互了解，夯实三国合作的民意基础。\n"
//				+ "</p>\n"
//				+ "<p style=\"text-align:center;margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255)\">\n"
//				+ "    <img src=\"http://www.gov.cn/premier/2019-08/22/5423504/images/793a5bc661db4f5ab31194c94e55b08c.jpg\" border=\"0\" style=\"border: none;padding: 0px\"/><br/>\n"
//				+ "</p>\n"
//				+ "<p style=\"margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em\">\n"
//				+ "    康京和表示，此次韩中日三国外长会取得积极成果，对三方下一步合作进行规划。韩方期待年内在华举行的三国领导人会议取得成功，为地区和平稳定与发展作出贡献。韩中关系发展良好，韩方对韩中未来合作充满信心。\n"
//				+ "</p>\n"
//				+ "<p>\n"
//				+ "    <br/>\n"
//				+ "</p>";
//		String transfer = "各省、自治区、直辖市人民政府，国务院各部委、各直属机构：为加强社会信用体系建设，深入推进“放管服”改革，进一步发挥信用在创新监管机制、提高监管能力和水平方面的基础性作用，更好激发市场主体活力，推动高质量发展，经国务院同意，现提出如下意见。";
//		Pattern pattern = Pattern.compile("<p(.|\\r|\\n)+?<\\/p>");
//		Matcher matcher = pattern.matcher(s);
//
//		while(matcher.find()){
//			System.out.println(matcher.group());
//		}
//		System.out.println(s.replaceAll("<p[^>]{1,}>{1}",""));
//		System.out.println(s.replaceAll("<p{1}[^>]{1,}>{1}.*</p>{1}",""));
//	}


	public static void main(String[] args) throws UnsupportedEncodingException {

		// json数组转map
//		String json = "[{\"name\":\"张三\",\"sex\":\"男\" },{\"name\":\"李四\",\"sex\":\"男\"}]";
//		List<Map> result = JSONArray.parseArray(json, Map.class);
//		System.out.println("hello");

		//2
//		List<Map>  array1 = new ArrayList<>();
//
//		Map map1 = new HashMap();
//		map1.put("name", "张三");
//		map1.put("sex", "男");
//
//		Map map2 = new HashMap();
//		map2.put("name", "李四");
//		map2.put("sex", "男");
//		array1.add(map1);
//		array1.add(map2);
//		String text = JSON.toJSONString(array1);
//		System.out.println(text);

//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append("?,");
//		System.out.println(stringBuilder.toString());
//		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//		System.out.println(stringBuilder.toString());

//
//		String params = sortParams();
//		String result = putEncrypInf(params);
//		System.out.println(result);

//		generateUUID();

//		sortInt();

//		String s = "其他`19";
//		String[] a = s.split("~");
//		System.out.println("hello");

//		verify();
//		testToJson();

//		Map<String, String> map = new HashMap<>();
//		map.put("info", ("752,习近平在湖北省考察新冠肺炎疫情防控工作,,<div class=\"view TRS_UEDITOR trs_paper_default trs_web\"><p>北省考察新</p></div>,,123,,,,"));
//		map.put("signValue", "MmReXnUGpwoh40jwS672Z+LUgaRaCcTP7IG4xdvBn12KbCRTEPGVK3MjwK7m5pJLx0H5iAA7kJSv\nFWBjTkqWqQ==");
//		List list = new ArrayList();
//		list.add(map);
//		sendRawPost("http://192.168.200.136:8083/cryptutils/verify", JSON.toJSONString(list));

//		List<String> ids = new ArrayList<>();
//		ids.add("3");
//		ids.add("2");
//		ids.add("5");
//		System.out.println(String.valueOf(ids));

//		String s = "这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天这是一个天1";
//		System.out.println("hello");

		test();
	}

	private static void test(){

//		List<Integer> lists = new ArrayList<>();
//		lists.add(1);
//		lists.add(2);
//		lists.add(3);
//		lists.add(4);
//
//		Iterator<Integer> integerIterator = lists.iterator();
//		while (integerIterator.hasNext()){
//
//			int i = integerIterator.next();
//			if(i == 2){
//				integerIterator.remove();
//				continue;
//			}
//			System.out.println(i);
//		}

//		String s= null;
//		switch (s){
//			case "1":
//				break;
//				default:break;
//		}
//		System.out.println("hello");
		System.out.println("123456%n" );
		System.out.printf("%n");
		System.out.printf("%n");
		System.out.println("a");
	}

	/**
	 * 发送HttpPost请求，参数为raw
	 * @param url :
	 * @param rawText :
	 * @return :
	 */
	public static String sendRawPost(String url, String rawText) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		StringEntity stringEntity = new StringEntity(rawText, "utf-8");
		HttpPost httppost = new HttpPost(url);
		httppost.setEntity(stringEntity);
		httppost.setHeader("Content-type", "application/json");
		CloseableHttpResponse response = null;
		try {
			response = httpclient.execute(httppost);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "";
	}

	private static void testToJson(){

		String[] strArr = new String[1];
		strArr[0] = "123";
		System.out.println(JSON.toJSON(strArr));

		List<String> list = new ArrayList<>();
		list.add("123");
		System.out.println(list.toString());
	}

//	public CcbRequestBuilder putDefaultCommComs() {
//		Map<String, Object> commCom = Maps.newHashMap();
//		//这几个写死
//		commCom.put("tRecInPage","10");
//		commCom.put("tPageJump","1");
//		commCom.put("tStsTraceId","110567890");
//		commCom.put("txnIttChnlId","99990001000000000000000");
//		commCom.put("txnIttChnlCgyCode","99999999");
//		if (!CollectionUtils.isEmpty(commCom)) {
//			this.txnCommCom.putAll(commCom);
//		}
//		return this;
//	}

	private static String sortParams(){

		JSONObject params = new JSONObject(true);
		params.put("pshScoIdr", "1");
		JSONObject urlParams = new JSONObject();
		urlParams.put("url","http://policy.cqliving.com:82/#/?id=1223");
		params.put("mesg", urlParams.toString());
		params.put("mesgTitle", "1725Title");
		params.put("msgType", "08");
		params.put("groupInfo", "0");
		String jsonString = SplicingUtil.createSign(params.toString());
		System.out.println(jsonString);
		jsonObjectURLEncoder(params);
		return params.toString();
	}

	private static String sortInt(){
		String ids = "148,150,149,152,151";
		String[] arr = ids.split(",");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		StringJoiner joiner = new StringJoiner(",");
		for(int i = 0 ; i < arr.length ; i++){
			joiner.add(arr[i]);
		}
		System.out.println(joiner.toString());
		return ids;
	}

	private static void jsonObjectURLEncoder(JSONObject json){
		json.forEach((key,value) -> {
			try {
				json.put(key, URLEncoder.encode((String) value,"utf-8"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	private static String encrypt(String publicKey, String sortParams){
		String result = "";
		try {
			result = RSAutil.encrypt(sortParams, RSAutil.getPublicKey(publicKey));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public static String putEncrypInf(String jsonStr) {
		JSONObject params = new JSONObject();
		try {
			String signStr = SplicingUtil.createSign(jsonStr);
			String value = RSAutil.encrypt(signStr, RSAutil.getPublicKey(PUBLIC_KEY));
			params.put("ENCRYP_INF",value);//公钥生成的加密串
			String timeStemp = String.valueOf(System.currentTimeMillis());
			String sortParamToMd5 = DigestUtils.md5DigestAsHex((signStr + timeStemp).getBytes());
			String signInfo = RSAutil.sign(sortParamToMd5, RSAutil.getPrivateKey(PRIVATE_KEY));
			params.put("SIGN_INF",signInfo);//签名串
			params.put("TIME_STEMP",timeStemp);//日期
		} catch (Exception e) {
			e.printStackTrace();
		}
		return params.toString();
	}

	private static String plainTextAndStampToMd5(String plaintext, String timeStamp){
		String result = DigestUtils.md5DigestAsHex((plaintext + timeStamp).getBytes());
		System.out.println("MD5加密明文后的内容：" + result);
		return result;
	}

	private static String privateSign(String privateRSA, String sortAddTimeStamp){
		String signInf = "";
		try {
			signInf = RSAutil.sign(sortAddTimeStamp, RSAutil.getPrivateKey(privateRSA));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("私钥对排序加时间戳做MD5加密后的签名字符串" + signInf);
		return signInf;
	}

	private static void generateUUID(){
		System.out.println(UUID.randomUUID());
	}

	private static void verify(){

		String originMsg = "1426,,3,3604,zdz测试专用组织1,2019-06-06 15:26:27.0,5,计算机,<p>计算机</p>,1";
		String encryptedMsg = "123";
		ISDTHLCipher sdthlCipher = new SDTHLCipher();
		boolean result = sdthlCipher.doVerify(1, originMsg, encryptedMsg);
		System.out.println(result);
	}

	private static void hashStr(){

		String s= "825,encryptedB8LO9EYkJB7o7/gMZ3jjzA==,3,,,2018-06-01 16:16:21.0,3,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,1";
		s.hashCode();
	}
}
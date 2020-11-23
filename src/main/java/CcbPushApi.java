/**
 *
 * Title:推送接口
 * <p>Description:</p>
 * Copyright (c) CQLIVING 2016
 * @author dengqi on 2020年1月7日
 */
public abstract class CcbPushApi {
	/** 全部推送 */
	public final static String PSHSCOIDR_1 = "1";
	/** 指定推送 */
	public final static String PSHSCOIDR_2 = "2";
	/** 用户id */
	public final static String GROUPTYPE_01 = "01";
	/** 用户手机号码 */
	public final static String GROUPTYPE_02 = "02";
	/** 用户区域 */
	public final static String GROUPTYPE_03 = "03";

	/** 新闻分组限制 0:无限制 */
	public final static String GROUPINFO_0 = "0";
	/** 新闻分组限制 1:有限制 */
	public final static String GROUPINFO_1 = "1";
	/**
	 *
	 * Title:获取区划列表
	 * <p>Description:</p>
	 * @return
	 */
//	public static List<CcbRegionCodeDto> getCcbRegionCodeList(String regionCode,RestTemplate restTemplate) {
//		JSONObject json = new JSONObject(true);
//		json.put("regionCode", regionCode);
//
//		CcbResponse<List<CcbRegionCodeDto>> response = pushRequest(CcbConstant.GSP_PUSH_REGION_UC50025,json.toString(),null, null,"获取ccb区域列表",restTemplate,new TypeReference<List<CcbRegionCodeDto>>(){});
//		if (isSuccess(response)) {
//			return response.getData();
//		}
//		return Collections.EMPTY_LIST;
//	}
//
//
//	/**
//	 * @Description 获取ccb用户分组
//	 **/
//	public static List<CcbUserGroupDto> getCcbRUserGroupList(RestTemplate restTemplate){
//
//		JSONObject json = new JSONObject(true);
//		json.put("groupType", "uc50004");
//
//		CcbResponse<JSONObject> response = pushRequest(CcbConstant.GSP_PUSH_USER_GROUP_UC50004,json.toString(),null,null,"获取ccb用户分组",restTemplate,new TypeReference<JSONObject>(){});
//		if (!isSuccess(response)) {
//			return Collections.EMPTY_LIST;
//		}
//		return response.getData().getObject("ucGroupDoList",new TypeReference<List<CcbUserGroupDto>>(){});
//	}
//
//
//	/**
//	 * @Description ccb消息推送
//	 * @Param token
//	 * @Param pshScoIdr 推送范围标识{1-全部推送,2-指定用户推送}
//	 * @Param id InfoClassify Id
//	 * @Param mesgTitle 消息标题
//	 * @Param groupType 用户组别类型 {如果全部发送，可为空 01:用户id，02:用户手机号，03:用户区域}
//	 * @Param list 特定用户数据列表
//	 * @Param msgType 消息类型{07:新闻推送，08:行业推荐}
//	 * @Param listGroup 新闻分组IdList
//	 * @Param groupInfo 新闻分组限制{0:无限制,1:有限制}
//	 **/
//	public static boolean messagesPush(String pshScoIdr,String mesg, String url, String mesgTitle, String groupType
//			, String msgType, List<MessagesPushDto> list , List<InformationGroupPushDto> listGroup, String groupInfo
//			, RestTemplate restTemplate){
//		JSONObject json = new JSONObject(true);
//		json.put("pshScoIdr", pshScoIdr);
//		json.put("mesg",mesg);//消息体
//		json.put("url", url);
//		json.put("mesgTitle", mesgTitle);
//		json.put("groupType", groupType);
//		json.put("msgType", msgType);
//		//新闻分组限制
//		json.put("groupInfo", groupInfo);
//
//		jsonObjectURLEncoder(json);
//
//		CcbResponse<String> response = pushRequest(CcbConstant.GSP_PUSH_MESSAGE_FSX06035, json.toString(), list, listGroup, "ccb消息推送",restTemplate,new TypeReference<String>(){});
//		return isSuccess(response);
//	}
//
//	/**
//	 * JSON Encoder编码
//	 * @param json
//	 */
//	private static void jsonObjectURLEncoder(JSONObject json){
//		json.forEach((key,value) -> {
//			try {
//				json.put(key, URLEncoder.encode((String) value,"utf-8"));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
//	}
//
//	private static <T> boolean isSuccess(CcbResponse<T> response) {
//		return CcbResponse.SUCCESS.equals(response.getcAPIStatus());
//	}
//
//	private static <T> CcbResponse<T> pushRequest(String url,String paramJsonString,List<MessagesPushDto> list,List<InformationGroupPushDto> listGroup, String funcName,RestTemplate restTemplate,TypeReference<T> typeReference) {
//		url = CommonUtils.paseUrl(PropertiesConfig.getString(PropertyKey.CCB_URL_PREFIX)) + url;
//		return CcbRequest.from(url,funcName)
//				.addBusinessIdHeader(System.currentTimeMillis() + "")
//				.addTenancyIdHeader("500000000000")
//				.addAppIdHeader(CcbApi.C_APP_ID)
//				.addRefererHeader(CcbConstant.CCB_HEADER_REFER)
//				.addContentTypeHeader(MediaType.APPLICATION_JSON_UTF8_VALUE)
//				.putBodyCom("LIST", CollectionUtils.isNotEmpty(list) ? list.toArray() : "")
//				.putBodyCom("LISTGROP", CollectionUtils.isNotEmpty(listGroup) ? listGroup.toArray() : "")
//				.putEncrypInf(paramJsonString).create().postRequest(typeReference,restTemplate);
//	}
//
//	public CcbRequestBuilder putEncrypInf(String jsonStr) {
//		try {
//			String signStr = SplicingUtil.createSign(jsonStr);
//			String value = RSAutil.encrypt(signStr, RSAutil.getPublicKey(CcbConstant.PUBLIC_KEY));
//			this.txnBodyCom.put("ENCRYP_INF",value);//公钥生成的加密串
//			String timeStemp = String.valueOf(System.currentTimeMillis());
//			String sortParamToMd5 = DigestUtils.md5DigestAsHex((signStr + timeStemp).getBytes());
//			String signInfo = RSAutil.sign(sortParamToMd5, RSAutil.getPrivateKey(CcbConstant.PRIVATE_KEY));
//			this.txnBodyCom.put("SIGN_INF",signInfo);//签名串
//			this.txnBodyCom.put("TIME_STEMP",timeStemp);//日期
//			return this;
//		} catch (Exception e) {
//			throw new BusinessException("公私钥生成的加密失败,json:" + jsonStr + ",错误信息:" + e.getMessage());
//		}
//	}

}
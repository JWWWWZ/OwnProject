package rpc;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2020/10/14 0014
 * @author jiangwenzhu
 * @version 1.0
 */

public class Client {
	public static void main(String[] args) {
		sendMsg("aaa");
		sendMsg("bbb");
		sendMsg("ccc");
	}

	@Path(ipAndPort = "127.0.0.1:6060")
	private static void sendMsg(String msg){
		ServerService clientService = (ServerService) ClientServiceProxyFactory.getClientService(ServerService.class);
		System.out.println("key:" + msg + ",value:" + clientService.get(msg));
	}
}

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

/**
 * @Classname WsClient
 * @Description TODO
 * @Date 2020/5/18 下午6:16
 * @Created by JWZ
 */
public class WsClient {

//    private Call call = null;
//    private Service service = new Service();
//    private String endpoint;
//    private String remoteMethod;
//
//    public WsClient(String endpoint, String remoteMethod) throws Exception {
//        this.endpoint = endpoint;
//        this.remoteMethod = remoteMethod;
//        this.call = new Call(this.service);
//        this.call.setTargetEndpointAddress(endpoint);
//        this.call.setOperationName(remoteMethod);
//        this.call.setUseSOAPAction(true);
//    }
//
//    public void addParam(String paramName, QName paramType) {
//        this.call.addParameter(paramName, paramType, ParameterMode.IN);
//    }
//
//    public void setReturnType(QName type) {
//        this.call.setReturnType(type);
//    }
//
//    public Object remoteCall(Object[] params) throws Exception {
//        try {
//            return this.call.invoke(params);
//
//        } catch (RemoteException e) {
//            throw e;
//        }
//
//    }
//
//
//    public static String proFileContent(String remoteUrl) throws Exception
//    {
//        StringBuffer document = new StringBuffer();
//        URL url = new URL(remoteUrl);
//        URLConnection conn = url.openConnection();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        String line = null;
//        while ((line = reader.readLine()) != null) {
//            document.append(line);
//        }
//        reader.close();
//        return document.toString();
//    }
//    public static void main(String[] args)
//    {
//        //获取更新记录
//        String serviceUrl="http://59.215.223.22/orgcenterplat/services/OrgDataService?wsdl";
//        try {
//            WsClient client = new WsClient(serviceUrl, "getOrgData");
//            client.addParam("user", "string");
//            client.addParam("pwd", "zysjtl123456");
//            client.addParam("sysid", XMLType.XSD_STRING);
//            client.addParam("accountlastchangedatetime", XMLType.XSD_STRING);
//            client.addParam("deptlastchangedatetime", XMLType.XSD_STRING);
//            client.addParam("userlastchangedatetime", XMLType.XSD_STRING);
//            client.addParam("userlastchangedatetime", XMLType.XSD_STRING);
//            client.addParam("datatype", XMLType.XSD_STRING);
//            client.addParam("fromorgid", XMLType.XSD_STRING);
//            client.addParam("fromdeptid", XMLType.XSD_STRING);
//            client.addParam("fromuserid", XMLType.XSD_STRING);
//            client.addParam("viewId", XMLType.XSD_STRING);
//            client.addParam("methodType", XMLType.XSD_STRING);
//            client.setReturnType(XMLType.XSD_STRING);
//            Object[] params = new Object[13];
//            params[0] = ""; //用户名
//            params[1] = "";//密码
//            params[2] = "";
//            params[3] = "2011-10-19 00:00:00";
//            params[4] = "2011-10-19 00:00:00";
//            params[5] = "2011-10-19 00:00:00";
//            params[6] = "2011-10-19 00:00:00";
//            params[7] = ""; //类型 datatype 不能使用0
//            params[8] = "";
//            params[9] = "";
//            params[10] = "";
//            params[11] = "";//视图ID
//            params[12] = "1";
//            String rtn = (String) client.remoteCall(params);
//            System.out.println(rtn);
//            //String rtn = "<?xml version=\"1.0\" encoding=\"utf-8\"?><result><return code=\"0\">获取数据成功</return><changeAccountFile>/webwervice/admin/account/2015-01-01/accountdata.json</changeAccountFile><changeDepartmentFile>/webwervice/admin/department/2015-01-01/departmentdata.json</changeDepartmentFile><changeUserFile>/webwervice/admin/user/2015-01-01/userdata.json</changeUserFile><changeUserIdentityFile>/webwervice/admin/useridentity/2015-01-01/useridentitydata.json</changeUserIdentityFile></result>";
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    public static void main(String[] args) {

        try {
            String endpoint = "http://59.215.223.22/orgcenterplat/services/OrgDataService?wsdl";
            // 直接引用远程的wsdl文件
            // 以下都是套路
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);
            call.setOperationName("getOrgData");// WSDL里面描述的接口名称
            call.addParameter("user", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("pwd", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("sysid", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("accountlastchangedatetime", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("deptlastchangedatetime", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("userlastchangedatetime", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("identitylastchangedatetime", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("datatype", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("fromorgid", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("fromdeptid", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("fromuserid", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("viewId", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.addParameter("methodType", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);// 接口的参数
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);// 设置返回类型
            String result = (String) call.invoke(new Object[]{"zysjtlUser", "zysjtl123456", "",
            "2000-10-19 00:00:00", "2000-10-19 00:00:00", "2000-10-19 00:00:00", "2000-10-19 00:00:00",
            "2", "", "", "", "-8645945798856392566", "1"});
            // 给方法传递参数，并且调用方法
            System.out.println("result is " + result);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}

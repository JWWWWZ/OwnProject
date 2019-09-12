package interfaceTest;
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

        for(int i = 0 ; i < 1 ; i ++){
            test(i);
        }

    }

    private static void test(int i) throws IOException {
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

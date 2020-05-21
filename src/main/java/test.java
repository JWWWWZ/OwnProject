import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:
 * Copyright: Copyright (c) 2004-2017 TRS信息技术有限公司
 * Company: TRS信息技术有限公司(www.trs.com.cn)
 * CreateDate:  2019/04/03 0003
 *
 * @author jiangwenzhu
 * @version 1.0
 */

public class test {

    public static void main(String[] args) {

//		String s = "<div class=\"view TRS_UEDITOR trs_paper_default trs_web\"><p align=\"\" style=\";padding: 0px;font-size: 16px;white-space: normal;text-align: justify\">各省、自治区、直辖市人民政府，国务院各部委、各直属机构：</p><p align=\"\" style=\";padding: 0px;font-size: 16px;white-space: normal;text-indent: 2em;text-align: justify\">为加强社会信用体系建设，深入推进“放管服”改革，进一步发挥信用在创新监管机制、提高监管能力和水平方面的基础性作用，更好激发市场主体活力，推动高质量发展，经国务院同意，现提出如下意见。</p><p><br/></p></div>";
        String s = "<p style=\"margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em\">\n"
                + "    国务院总理李克强8月22日上午在人民大会堂会见来华出席中日韩外长会的韩国外长康京和、日本外相河野太郎。\n"
                + "</p>\n"
                + "<p style=\"text-align:center;margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255)\">\n"
                + "    <img src=\"http://www.gov.cn/premier/2019-08/22/5423504/images/be25c3eb8ba3465596ea17d4ce6a9cbd.jpg\" border=\"0\" style=\"border: none;padding: 0px\"/><br/>\n"
                + "</p>\n"
                + "<p style=\"margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em\">\n"
                + "    李克强祝贺中日韩外长会成功举行。他表示，今年是中日韩合作启动20周年。三国地缘相近，人文相通，经济互补性强，合作潜力巨大。在当前世界经济不稳定不确定性继续上升、全球经济贸易下行压力增大背景下，中日韩加强合作不仅有利于自身发展，也将为地区和世界经济发挥“稳定器”和“推进器”作用。中方高度重视中日韩合作，愿同韩方、日方一道，推动三国合作向更高层次迈进。\n"
                + "</p>\n"
                + "<p style=\"text-align:center;margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255)\">\n"
                + "    <img src=\"http://www.gov.cn/premier/2019-08/22/5423504/images/841682cdc5874dedbbd4c6359f79d28c.jpg\" border=\"0\" style=\"border: none;padding: 0px\"/><br/>\n"
                + "</p>\n"
                + "<p style=\"margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em\">\n"
                + "    李克强指出，中日韩合作取得很大发展，重要性和必要性还将进一步凸显。三国应当维护以规则为基础、以世贸组织为核心的多边贸易体制，争取早日达成全面、高水平的中日韩自贸协定，促进贸易和投资自由化便利化。共同推动科技创新，共享发展机遇和创新成果。共同促进发展繁荣，推进东亚合作。共同维护地区和平稳定，为政治解决朝鲜半岛问题、实现半岛无核化和地区持久和平作出积极贡献。密切人员往来，增进人民之间相互了解，夯实三国合作的民意基础。\n"
                + "</p>\n"
                + "<p style=\"text-align:center;margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255)\">\n"
                + "    <img src=\"http://www.gov.cn/premier/2019-08/22/5423504/images/793a5bc661db4f5ab31194c94e55b08c.jpg\" border=\"0\" style=\"border: none;padding: 0px\"/><br/>\n"
                + "</p>\n"
                + "<p style=\"margin: 15px 0px 0px;padding: 0px;list-style: none;color: rgb(51, 51, 51);font-family: 宋体;font-size: 16px;white-space: normal;background-color: rgb(255, 255, 255);text-indent: 2em\">\n"
                + "    康京和表示，此次韩中日三国外长会取得积极成果，对三方下一步合作进行规划。韩方期待年内在华举行的三国领导人会议取得成功，为地区和平稳定与发展作出贡献。韩中关系发展良好，韩方对韩中未来合作充满信心。\n"
                + "</p>\n"
                + "<p>\n"
                + "    <br/>\n"
                + "</p>";
//		String transfer = "各省、自治区、直辖市人民政府，国务院各部委、各直属机构：为加强社会信用体系建设，深入推进“放管服”改革，进一步发挥信用在创新监管机制、提高监管能力和水平方面的基础性作用，更好激发市场主体活力，推动高质量发展，经国务院同意，现提出如下意见。";
//		Pattern pattern = Pattern.compile("<p(.|\\r|\\n)+?<\\/p>");
//		Matcher matcher = pattern.matcher(s);
//
//		while(matcher.find()){
//			System.out.println(matcher.group());
//		}
//		System.out.println(s.replaceAll("<p[^>]{1,}>{1}",""));
//		System.out.println(s.replaceAll("<p{1}[^>]{1,}>{1}.*</p>{1}",""));
//

//        testString();
//        testMap();

        System.out.println(reverse(123));
    }

    private static void testString() {
        String deptInfo = "发文单位~市级单位~市委~";
        String[] depts = deptInfo.split("~");

        if(depts != null && depts.length > 0) {
            int deptsNum = depts.length;
            String groupName = depts[deptsNum - 1];
        }
        System.out.println("hello");
    }

    private static void testSplit(){
        String s = "123*encMes*dsdsd";
        String[] array = s.split("/*encMes/*");
        System.out.println("hello");
    }

    private static void testEmpty(){

        Map<String, Object> result = new HashMap<>();
        System.out.println(result.isEmpty());
    }

    private static void testCal(){

        int i = 4348393;
        int j = 4348394;
//        double f1 = new BigDecimal((float)i/j).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

        int result = (int) Math.floor((i*100)/j);

        System.out.println("hello");
    }

    private static void testMap(){

        Map result = new HashMap();
        result.put("abc", "123");
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private void test2(){

        Thread thread = new Thread();
        synchronized (this){
            
        }
    }

    public static int reverse(int x) {

        int minVlaue = (int) -Math.pow(2, 31);
        int maxValue = (int) (Math.pow(2, 31) - 1);
        if(x < minVlaue || x > maxValue || x == 0){
            return 0;
        }

        boolean greaterThanZero = true;

        if(x < 0){
            greaterThanZero = false;
        }

        x = Math.abs(x);

        int digital = 1;

        if(x / 10 < 0){

            if(greaterThanZero){
                return x;
            }else{
                return -x;
            }
        }

        while(x / 10 > 0){
            digital ++;
            x = x / 10;
        }

        List<Integer> eachDigitalNum = new ArrayList<Integer>();

        int divisor = 1;
        while(digital > 0){
            divisor = (divisor - 1) * 10;
            digital --;
        }

        int tempDivisor = divisor;

        int merchant = 0;
        while(divisor > 0){
            merchant = x / divisor;
            divisor = divisor / 10;
            eachDigitalNum.add(merchant);
        }
        eachDigitalNum.add(merchant);

        int result = 0;
        for(int i = 0 ; i < eachDigitalNum.size() ; i++){
            result = eachDigitalNum.get(i) * tempDivisor;
            tempDivisor = tempDivisor / 10;
        }

        if(greaterThanZero){
            return result;
        }else{
            return -result;
        }
    }
}

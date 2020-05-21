package xmlTest;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;


/**
 * @Classname saxTest
 * @Description TODO
 * @Date 2020/5/20 下午4:37
 * @Created by JWZ
 */
public class saxTest {

    public static void main(String[] args){

        // 1、获取saxParserFactory实例
        SAXParserFactory factory = SAXParserFactory.newInstance();

        // 2、获取SaxParser实例
        try {
            SAXParser saxParser = factory.newSAXParser();

            // 创建Handel对象
            SAXDemoHandel handler = new SAXDemoHandel();
            saxParser.parse("/Users/jwz/Desktop/user.xml", handler);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class SAXDemoHandel extends DefaultHandler{

        @Override
        public void startDocument() throws SAXException {
            super.startDocument();
            System.out.println("解析开始");
        }

        @Override
        public void endDocument() throws SAXException {
            super.endDocument();
            System.out.println("解析结束");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            super.startElement(uri, localName, qName, attributes);
            if(qName.equalsIgnoreCase("user")){
                System.out.println("--开始遍历user--");
            }else if(!qName.equalsIgnoreCase("user")
            && !qName.equalsIgnoreCase("userinfo")){
                System.out.println("节点名称" + qName);
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            super.endElement(uri, localName, qName);
            if(qName.equalsIgnoreCase("user")){
                System.out.println(qName + "遍历结束");
                System.out.println("--结束遍历user--");
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            super.characters(ch, start, length);
            String value = new String(ch, start, length).trim();
            if(!value.equalsIgnoreCase("")){
                System.out.println(value);
            }
        }
    }
}

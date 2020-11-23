package xmlTest;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname dom4jTest
 * @Description TODO
 * @Date 2020/5/21 上午10:46
 * @Created by JWZ
 */
public class dom4jTest {

    public static void main(String[] args){

        // 1、创建Reader对象
        SAXReader reader = new SAXReader();

        // 2、加载xml
        try {
            Document document = reader.read(new File("/Users/jwz/Desktop/user.xml"));

            // 3、获取根节点
            Element rootElement = document.getRootElement();
            Iterator iterator = rootElement.elementIterator();
            while(iterator.hasNext()){
                Element user = (Element) iterator.next();
                List<Attribute> attributeList = user.attributes();
                System.out.println("--获取属性值--");
                for(Attribute attribute : attributeList){
                    System.out.println(attribute.getName() + ":" + attribute.getValue());
                }

                System.out.println("--遍历子节点--");
                Iterator childIterator = user.elementIterator();
                while(childIterator.hasNext()){
                    Element userItem = (Element) childIterator.next();
                    System.out.println("子节点名：" + userItem.getName() + ":" + userItem.getStringValue());
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

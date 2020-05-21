package xmlTest;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.*;
import java.util.List;

/**
 * @Classname jdomTest
 * @Description TODO
 * @Date 2020/5/21 上午10:31
 * @Created by JWZ
 */
public class jdomTest {

    public static void main(String[] args){

        // 1、创建SAXBuilder对象
        SAXBuilder saxBuilder = new SAXBuilder();

        // 2、创建输入流
        try {
            InputStream inputStream = new FileInputStream(new File(("/Users/jwz/Desktop/user.xml")));

            // 3、将输入流加载到build中
            Document document = saxBuilder.build(inputStream);

            // 4、获取根节点
            Element rootElement = document.getRootElement();

            // 5、获取子节点
            List<Element> children = rootElement.getChildren();

            for(Element child : children){

                List<Attribute> attributes = child.getAttributes();
                for(Attribute attribute : attributes){
                    System.out.println("------" + attribute.getName() + ":" + attribute.getValue());
                }

                List<Element> childrenList = child.getChildren();
                System.out.println("--获取子节点start--");
                for(Element o : childrenList){
                    System.out.println("节点名：" + o.getName() + "--" + "节点值：" + o.getValue());
                }
                System.out.println("获取子节点end");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


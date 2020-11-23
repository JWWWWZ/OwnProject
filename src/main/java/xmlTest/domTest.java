package xmlTest;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @Classname domTest
 * @Description TODO
 * @Date 2020/5/20 下午2:58
 * @Created by JWZ
 */
public class domTest {

    public static void main(String[] args){

        // 1、创建DocumentBuilderFactory对象
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // 2、创建DocumentBuilder对象
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            File file = new File("/Users/jwz/Desktop/user.xml");
            Document document = builder.parse(file);
            NodeList list = document.getElementsByTagName("user");
            node(list);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void node(NodeList list){

        for(int i = 0 ; i < list.getLength() ; i++){
            Node node = list.item(i);
            NodeList childerens = node.getChildNodes();

            for(int j = 0 ; j < childerens.getLength() ; j ++){

                Node childNode = childerens.item(j);

                if(childNode != null && childNode.getNodeType() == Node.ELEMENT_NODE){
                    System.out.print(childNode.getNodeName() + "----");

                    if(childNode.getFirstChild() != null){
                        System.out.println(childNode.getFirstChild().getNodeValue());
                    }
                }
            }
        }
    }
}

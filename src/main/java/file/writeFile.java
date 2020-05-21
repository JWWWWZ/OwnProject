package file;

import java.io.*;

/**
 * @Classname writeFile
 * @Description TODO
 * @Date 2020/5/9 下午5:57
 * @Created by JWZ
 */
public class writeFile {

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/jwz/test.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("hello world11111");
        fileWriter.close();
    }
}

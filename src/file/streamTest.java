package file;

import java.io.*;

/**
 * @Classname streamTest
 * @Description TODO
 * @Date 2019/9/10 15:22
 * @Created by JWZ
 */
public class streamTest {

    public static void main(String[] args) throws IOException {
        String fromPath = "/Users/jwz/a.txt";
        String toPath = "/Users/jwz/b.txt";


//      createFile(path);

//        try {
//            writeFile(fromPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        writeFromAToB(fromPath, toPath);
    }

    // 创建文件
    private static void createFile(String path) {

        File file = new File(path);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 往文件中写东西
    private static void writeFile(String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("hello world\n this is my first code");
        fileWriter.close();
    }

    // 从一个文件往另外一个文件写东西
    private static void writeFromAToB(String fromPath, String toPath) throws IOException {
        File fromFile = new File(fromPath);
        File toFile = new File(toPath);

        if(!toFile.exists()){
            toFile.createNewFile();
        }

        FileReader fileReader = new FileReader(fromFile);
        FileWriter fileWriter = new FileWriter(toFile);
        int c = 0;
        while((c = fileReader.read()) != -1){
           fileWriter.write(c);
        }

        fileReader.close();
        fileWriter.close();
    }
}

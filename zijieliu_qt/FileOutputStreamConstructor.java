package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: untitled2
 * @description:
 * @author:qintao
 * @create: 2021-11-16 22:32
 **/
public class FileOutputStreamConstructor {
    public static void main(String[] args) throws IOException {
        // 使用File对象创建流对象
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);

        // 使用文件名称创建流对象
        //FileOutputStream fos = new FileOutputStream("b.txt");
    }
}
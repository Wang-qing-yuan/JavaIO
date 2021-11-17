package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program: untitled2
 * @description:
 * @author:qintao
 * @create: 2021-11-16 23:07
 **/
public class FileInputStreamConstructor {
    public static void main(String[] args) throws IOException {
        // 使用File对象创建流对象,文件如不存在会报异常
         File file=new File("read.txt");
         FileInputStream fos=new FileInputStream(file);
         // 使用文件名称创建流对象
         FileInputStream fos1 = new FileInputStream("read.txt");
    }
}


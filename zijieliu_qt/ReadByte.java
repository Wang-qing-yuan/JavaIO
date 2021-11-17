package IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program: untitled2
 * @description:
 * @author:qintao
 * @create: 2021-11-17 08:35
 **/
public class ReadByte {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis=new FileInputStream("read.txt");
        // 读取数据，返回一个字节
        int read=fis.read();
        System.out.println((char) read);
        read=fis.read();
        System.out.println((char) read);
        read=fis.read();
        System.out.println((char) read);
        read=fis.read();
        System.out.println((char) read);
        read=fis.read();
        System.out.println((char) read);
        // 读取到末尾,返回-1
        read=fis.read();
        System.out.println(read);
        // 关闭资源
        fis.close();

    }
}

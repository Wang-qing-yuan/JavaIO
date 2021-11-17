package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: untitled2
 * @description:
 * @author:qintao
 * @create: 2021-11-16 22:41
 **/
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos=new FileOutputStream("fos.txt");
        // 写出数据
        // 写出第1个字节（ASCII码）
        fos.write(97);
        // 写出第2个字节
        fos.write(98);
        // 写出第3个字节
        fos.write(99);
        fos.write(100);
        // 关闭资源
        fos.close();

    }
}

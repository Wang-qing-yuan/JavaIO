package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: untitled2
 * @description:
 * @author:qintao
 * @create: 2021-11-16 22:47
 **/
public class FileOutputStreamDemo2 {
    public  static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos=new FileOutputStream("fos1.txt");
        // 字符串转换为字节数组
        byte[] b="写入创建文本的文字".getBytes();
        // 写出字节数组数据
        fos.write(b);
        // 关闭资源
        fos.close();

    }
}

package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: untitled2
 * @description:
 * @author:qintao
 * @create: 2021-11-16 23:03
 **/
public class DataAppend {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象                          true表示追加数据，false表示清空原有数据
        FileOutputStream fos=new FileOutputStream("fos2.txt",true);
        // 字符串转换为字节数组
        byte[] b="abcde".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b, 2, 2);
        // 关闭资源
        fos.close();
    }
}

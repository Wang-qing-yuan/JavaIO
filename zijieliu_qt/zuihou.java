package IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program: untitled2
 * @description:
 * @author:qintao
 * @create: 2021-11-17 08:57
 **/
public class zuihou {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileInputStream fis=new FileInputStream("read.txt");
        // 定义变量，作为有效个数
        int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] b=new byte[4+];
         //循环读取
        while ((len=fis.read(b)) !=-1) {
            // 每次读取后,把数组的有效字节部分，变成字符串打印
        //  len 每次读取的有效字节个数
        System.out.println(new String(b, 0, len));
         }
         // 关闭资源
        fis.close();
        }
    }


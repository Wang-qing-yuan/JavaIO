package top.zs.filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program:javademo02
 * @description:
 * @author:zs
 * @create:2021-11-17 16:45
 **/
//基本流
public class myDemo1 {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long start=System.currentTimeMillis();
        // 创建流对象
        FileInputStream fis=new FileInputStream("C:/Users/zs/Desktop/asd.docx");
        FileOutputStream fos=new FileOutputStream("C:/Users/zs/Desktop/aaa.docx");
        // 读写数据
        int b=0;
        while ((b=fis.read()) !=-1) {
            fos.write(b);
        }// 记录结束时间
        long end=System.currentTimeMillis();
        System.out.println("基本流复制时间:"+(end-start)+" 毫秒");
    }
}


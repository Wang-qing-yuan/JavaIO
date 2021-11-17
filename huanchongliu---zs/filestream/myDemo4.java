package top.zs.filestream;

import java.io.*;

/**
 * @program:javademo02
 * @description:
 * @author:zs
 * @create:2021-11-17 17:08
 **/
public class myDemo4 {
    public static void main(String[] args) throws IOException {
        // 记录开始时间
        long start=System.currentTimeMillis();
        // 创建流对象
        FileInputStream fis=new FileInputStream("C:/Users/zs/Desktop/qpjt.docx");
        FileOutputStream fos=new FileOutputStream("C:/Users/zs/Desktop/aaa.docx");
        // 读写数据
        int b=0;
        while ((b=fis.read()) !=-1) {
            fos.write(b);
        }// 记录结束时间
        long end=System.currentTimeMillis();
        System.out.println("基本流复制时间:"+(end-start)+" 毫秒");

        //**************************************************************
        long l = System.currentTimeMillis();
        FileInputStream fis1 = new FileInputStream("C:/Users/zs/Desktop/qpjt.docx");
        FileOutputStream fos1 = new FileOutputStream("C:/Users/zs/Desktop/bbb.docx");

        //字节缓冲输入流
        BufferedInputStream bis1 = new BufferedInputStream(fis1);
        //字节缓冲输出流
        BufferedOutputStream bos1 = new BufferedOutputStream(fos1);

        int i;

        while((i=bis1.read())!=-1){
            bos1.write(i);
        }

        bos1.close();
        bis1.close();

        fos1.close();
        fis1.close();

        long e = System.currentTimeMillis();

        System.out.println("缓冲流复制时间:"+(e-l)+" 毫秒");

        //*********************************************************
        long l1 = System.currentTimeMillis();
        FileInputStream fis2 = new FileInputStream("C:/Users/zs/Desktop/qpjt.docx");
        FileOutputStream fos2 = new FileOutputStream("C:/Users/zs/Desktop/ccc.docx");

        //字节缓冲输入流
        BufferedInputStream bis2 = new BufferedInputStream(fis2);
        //字节缓冲输出流
        BufferedOutputStream bos2 = new BufferedOutputStream(fos2);

        int i1;

        byte[] len=new byte[1024*1024];

        while((i=bis2.read(len))!=-1){
            bos2.write(len,0,i);
        }

        fos2.close();
        fis2.close();

        long e1 = System.currentTimeMillis();//154

        System.out.println("缓冲流使用数组复制时间:"+(e1-l1)+" 毫秒");
    }
}

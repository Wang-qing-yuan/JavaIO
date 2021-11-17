package top.zs.filestream;

/**
 * @program:javademo02
 * @description:
 * @author:zs
 * @create:2021-11-17 16:54
 **/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用字节缓存流完成大文件的拷贝操作
 */
public class myDemo2 {

    public static void main(String[] args) throws Exception {

        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:/Users/zs/Desktop/asd.docx");
        FileOutputStream fos = new FileOutputStream("C:/Users/zs/Desktop/bbb.docx");

        //字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(fis);
        //字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int i;

        while((i=bis.read())!=-1){
            bos.write(i);
        }

        bos.close();
        bis.close();

        fos.close();
        fis.close();

        long e = System.currentTimeMillis();

        System.out.println("缓冲流复制时间:"+(e-l)+" 毫秒");
    }
}


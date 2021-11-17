package top.zs.filestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program:javademo02
 * @description:
 * @author:zs
 * @create:2021-11-17 16:10
 **/
public class BufferdInput {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("C:/Users/zs/Desktop/a.txt"));
        byte[] ch = new byte[1024];
        int len = 0;
        while ((len = bi.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        bi.close();
    }
}


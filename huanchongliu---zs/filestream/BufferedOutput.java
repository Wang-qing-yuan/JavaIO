package top.zs.filestream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program:javademo02
 * @description:
 * @author:zs
 * @create:2021-11-17 16:23
 **/
public class BufferedOutput {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("C:/Users/zs/Desktop/b.txt"));
        for (int i = 0; i < 10; i++) {
            bo.write(100);
            bo.flush();
        }
        bo.close();
    }
}


package top.zs.filestream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program:javademo02
 * @description:
 * @author:zs
 * @create:2021-11-17 16:39
 **/
public class BufferedWrite {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/zs/Desktop/d.txt"));
        for (int i = 0; i < 5; i++) {
            bw.write("拒绝内卷！");
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}


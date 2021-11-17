package top.zs.filestream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program:javademo02
 * @description:
 * @author:zs
 * @create:2021-11-17 16:27
 **/
public class BufferedRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/zs/Desktop/c.txt"));
        char[] ch = new char[1024];
        int len = 0;
        while ((len=br.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        br.close();
    }
}


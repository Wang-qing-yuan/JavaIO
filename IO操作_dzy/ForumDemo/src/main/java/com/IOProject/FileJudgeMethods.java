package com.IOProject;

import java.io.File;

public class FileJudgeMethods {
    public static void main(String[] args) {
        File f = new File("D:/Users/Administrator/Desktop/TestDir/abc.txt");
        File f2 = new File("D:/Users/Administrator/Desktop/TestDir");
        // 判断是否存在
        System.out.println("D:/Users/Administrator/Desktop/TestDir/abc.txt 是否存在:" + f.exists());
        System.out.println("D:/Users/Administrator/Desktop/TestDir/abc.txt 是否存在" + f2.exists());
        // 判断是文件还是目录
        System.out.println("D:/Users/Administrator/Desktop/TestDir 是文件?:" + f2.isFile());
        System.out.println("D:/Users/Administrator/Desktop/TestDir 是目录?:" + f2.isDirectory());
    }
}

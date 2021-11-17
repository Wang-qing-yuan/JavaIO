package com.IOProject;

import java.io.File;

public class FilePath {
    public static void main(String[] args) {
        // 桌面的hello.txt文件
        File f = new File("D:/Users/Administrator/Desktop/TestDir/abc.txt");
        System.out.println(f.getAbsolutePath());
        // 项目下的bbb.java文件
        File f2 = new File("FilePath.java");
        System.out.println(f2.getAbsolutePath());
    }
}

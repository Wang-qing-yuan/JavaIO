package com.IOProject;

import java.io.*;


public class FileGetMethods {
    public static void main(String[] args) {
        File f = new File("D:/Users/Administrator/Desktop/TestDir/123");
        System.out.println("文件绝对路径:" + f.getAbsolutePath());
        System.out.println("文件构造路径:" + f.getPath());
        System.out.println("文件名称:" + f.getName());
        System.out.println("文件⻓度:" + f.length() + "字节");
        System.out.println("文件路径的父路径" + f.getParentFile());

        File f2 = new File("D:/Users/Administrator/Desktop/TestDir");
        System.out.println("目录绝对路径:" + f2.getAbsolutePath());
        System.out.println("目录构造路径:" + f2.getPath());
        System.out.println("目录名称:" + f2.getName());
        System.out.println("目录⻓度:" + f2.length());
        System.out.println("目录父路径" + f2.getParentFile());
    }

}

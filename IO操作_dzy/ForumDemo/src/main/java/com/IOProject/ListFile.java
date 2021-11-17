package com.IOProject;

import java.io.File;
import java.util.Objects;

public class ListFile {
    public static void main(String[] args) {
        File dir = new File("D:/Users/Administrator/Desktop/TestDir");
        //获取当前目录下的文件以及文件夹对象，通过文件对象可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : Objects.requireNonNull(files)){
            System.out.println(file.getName());
        }
    }
}

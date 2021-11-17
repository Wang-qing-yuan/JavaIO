package top.wqy.java.basic.recursive;

import java.io.File;
import java.util.Objects;

/**
 * @program: IntelliJ IDEA
 * @description: 目录遍历
 * @author: wqy
 * @create: 2021-11-16 19:31
 **/

public class MLBL {
    public static void main(String[] args) {
        //创建File对象
        File dir = new File("E:/guge");
        //调用打印方式
        printDir(dir);
    }
    public static void printDir(File dir){

        System.out.println(dir);
//        File[] files = dir.listFiles();
        //获得子文件和目录
        File[] files = dir.listFiles(pathname ->{
            if(pathname.isDirectory())
                return true;
            return pathname.getName().toLowerCase().endsWith("java");
        });
        //循环打印
        for(File file : Objects.requireNonNull(files)){
            if(file.isFile()){
                System.out.println(file);
            }else{
                //是目录，继续遍历，形成递归
                printDir(file);

            }
        }
    }
}


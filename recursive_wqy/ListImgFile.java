package top.wqy.java.basic.recursive;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @program: IntelliJ IDEA
 * @description: 目录遍历搜索图片
 * @author: wqy
 * @create: 2021-11-16 20:06
 **/
public class ListImgFile {
    private static List<File> fileList = new ArrayList<>();
    private static long size;
    private static final double UNIT = 1024.0;

    public static void main(String[] args) {
        //创建File对象
        File dir = new File("E:/picture");
        //调用遍历目录的方法，得到返回集合
        fileList = listFolder(dir);
        //遍历集合
        fileList.forEach(System.out::println);
        System.out.println("一共有：" + fileList.size() + "张图片");
        System.out.println("总大小：" + fileSize(size));
    }
    private static List<File> listFolder(File dir){
        File[] files = dir.listFiles(file ->{
            if(file.isDirectory()){
                return true;
            }
            return isImage(file);
        });
        for (File file : Objects.requireNonNull(files)){
            if(file.isFile()){
                size += file.length();
                fileList.add(file);
            }else{
                listFolder(file);
            }
        }
        return fileList;
    }
    private static boolean isImage(File file){
        String fileName = file.getName().toLowerCase();
        return fileName.endsWith("jpg") ||fileName.endsWith("jpeg")
                ||fileName.endsWith("png") ||fileName.endsWith("gif")
                ||fileName.endsWith("bmp") ||fileName.endsWith("webp");
    }
    private static String fileSize(long length) {
        DecimalFormat df = new DecimalFormat("#.00");
        double res = length / UNIT;
        if (res<1) {
            return length + "字节";
        } else if (res < UNIT) {
            return df.format(res) + "K";
        } else if (res < UNIT * UNIT) {
            return df.format(res /UNIT) + "M";
        } else {
            return df.format(res / UNIT / UNIT) +"G";
        }
    }
}

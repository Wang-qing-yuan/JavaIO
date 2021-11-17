package com.Collections;

import java.util.*;

public class MapNestMap {
    public static void main(String[] args) {
        //创建基础班集合
        Map<String, String> javase = new HashMap<>(8);
        javase.put("001", "邓振宇");
        javase.put("002", "刘瑜");
        //创建就业班集合
        Map<String, String> javaee = new HashMap<>(8);
        javaee.put("001", "王庆媛");
        javaee.put("002", "钟盛");
        Map<String, Map<String, String>> map = new HashMap<>(8);
        //将班级集合添加到集合
        map.put("基础班", javase);
        map.put("就业班", javaee);
        //keySet0(map);
        entrySet0(map);
    }

    /***
     * 定义方法，实现迭代Map集合嵌套，entrySet
     */
    public static void entrySet0(Map<String, Map<String, String>> map) {
        Set<Map.Entry<String, Map<String, String>>> set = map.entrySet();
        Iterator<Map.Entry<String, Map<String, String>>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Map<String, String>> entryClassName = it.next();

            String className = entryClassName.getKey();
            Map<String, String> classMap = entryClassName.getValue();

            Set<Map.Entry<String, String>> setClass = classMap.entrySet();
            Iterator<Map.Entry<String, String>> itClass = setClass.iterator();
            while (itClass.hasNext()) {
                Map.Entry<String, String> entryClass = itClass.next();
                String number = entryClass.getKey();
                String name = entryClass.getValue();
                System.out.println(className + ":" + number + ":" + name);
            }
        }
    }

    /***
     * 定义方法，实现迭代Map嵌套集合，keySet
     */
    public static void keySet0(HashMap<String, HashMap<String, String>> map) {
        Set<String> setClassName = map.keySet();
        Iterator<String> itClassName = setClassName.iterator();
        while (itClassName.hasNext()) {
            String className = itClassName.next();
            HashMap<String, String> classMap = map.get(className);
            Set<String> setNumber = classMap.keySet();
            Iterator<String> itNumber = setNumber.iterator();
            while (itNumber.hasNext()) {
                String number = itNumber.next();
                String name = classMap.get(number);
                System.out.println(className + ".." + number + ".." + name);
            }
        }
    }

}
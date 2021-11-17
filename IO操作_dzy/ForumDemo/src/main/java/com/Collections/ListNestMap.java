package com.Collections;

import java.util.*;

public class ListNestMap {
    public static void main(String[] args) {
        //List大集合
        List<Map<String, String>> bigList = new ArrayList<>();
        //Map存储学生信息小集合
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        //存储学生信息
        map1.put("001", "邓振宇");
        map1.put("002", "刘瑜");
        map2.put("001", "王庆媛");
        map2.put("002", "钟盛");
        map2.put("003", "秦涛");
        map2.put("004", "加油");
        //map存储到List集合
        bigList.add(map1);
        bigList.add(map2);
        //遍历List集合
        Iterator<Map<String, String>> iterator = bigList.iterator();
        while (iterator.hasNext()) {
            Map<String, String> map = iterator.next();
            //遍历Map集合
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Iterator<Map.Entry<String, String>> iteratorSet = entrySet.iterator();
            while (iteratorSet.hasNext()) {
                Map.Entry<String, String> entry = iteratorSet.next();
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}

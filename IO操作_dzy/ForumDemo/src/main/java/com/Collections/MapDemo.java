package com.Collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //创建 map对象
        Map<String, String> map = new HashMap<>(8);
        //添加元素到集合
        map.put("江苏", "南京");
        map.put("贵州", "贵阳");
        map.put("湖南", "⻓沙");
        System.out.println(map);
        map.remove("江苏");
        System.out.println("删除后："+map);
        // 根据key查值
        System.out.println(map.get("贵州"));
        System.out.println(map.get("湖南"));
        Collection<String> coll = map.values();
        for (String value:coll){
            System.out.println(value);
        }
    }
}

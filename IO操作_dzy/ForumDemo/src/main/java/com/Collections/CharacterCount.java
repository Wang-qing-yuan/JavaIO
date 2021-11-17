package com.Collections;

import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
        System.out.println("输入一个字符串:");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }

    private static void findChar(String line) {
        Map<Character, Integer> map = new HashMap<>(16);

        for (int i = 0, len = line.length(); i < len; i++) {
            char c = line.charAt(i);
            //判断该字符是否在键的集合中
            if (!map.containsKey(c)) {
                //如果没出现过，就给这个字符出现的次数置为1
                map.put(c, 1);
            } else {
                //如果是出现过的字符，就获取之前的次数
                Integer count = map.get(c);
                map.put(c, ++count);
            }
        }
        System.out.println(map);
    }
}


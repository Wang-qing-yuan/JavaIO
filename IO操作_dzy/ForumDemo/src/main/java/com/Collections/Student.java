package com.Collections;

import java.util.*;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();

        map.put(new Student("张三", 28), "上海");
        map.put(new Student("张三丰", 22), "北京");
        map.put(new Student("张无忌", 23), "南京");
        //3 取出元素 键找值方式
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.toString() + "..." + value);
        }

        Map<String, String> map1 = new LinkedHashMap<>();
        map1.put("江苏", "南京");
        map1.put("浙江", "杭州");
        map1.put("湖南", "⻓沙");
        Set<Map.Entry<String, String>> entrySet = map1.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

}

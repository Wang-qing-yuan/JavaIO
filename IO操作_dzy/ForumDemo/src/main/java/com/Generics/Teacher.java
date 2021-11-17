package com.Generics;

public class Teacher implements Comparable<Teacher>{
    private String id;
    private String name;
    private Integer age;

    public Teacher() {
    }

    public Teacher(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "老师信息{" +
                "编号：'" + id + '\'' +
                ", 姓名：'" + name + '\'' +
                ", 年龄：" + age +
                '}';
    }

    @Override
    public int compareTo(Teacher teacher) {
        return this.id.compareTo(teacher.getId());
    }
}

package com.Generics;


import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();//初始化

        Teacher teacher = new Teacher();//根据年龄查询
        teacher.setAge(21);
        teacherDao.select(teacher);

        teacher = new Teacher();//根据Id查询
        teacher.setId("002");
        teacherDao.select(teacher);

        teacher = new Teacher();//根据姓名查询
        teacher.setName("邓振宇");
        teacherDao.select(teacher);

        System.out.println("获取所有数据");
        Set<Teacher> teacherSet = teacherDao.select(null);//查询所有数据
        Iterator<Teacher> iterator = teacherSet.iterator();
        Teacher teacher3 = new Teacher();
        while (iterator.hasNext()) {
            Teacher teacher2 = iterator.next();
            if ("001".equals(teacher2.getId())){
                teacher3 = teacher2;
                teacher3.setAge(25);
            }

        }//循环内拿到id001的对象并修改年龄为25
        teacherDao.update(teacher3);//更新数据
        teacherDao.select(null);//查询所有数据
        teacherDao.delete(teacher3);//删除所有数据
        teacherDao.select(null);




    }
}

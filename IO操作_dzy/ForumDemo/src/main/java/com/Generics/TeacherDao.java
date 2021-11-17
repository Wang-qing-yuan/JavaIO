package com.Generics;

import java.util.Iterator;
import java.util.Set;

public class TeacherDao extends BaseDao {
    DataBase dataBase = DataBase.instance;

    @Override
    public void add(Object o) {
        super.add(o);
        dataBase.insert((Teacher) o);
        System.out.println("添加信息后：");
        dataBase.select(null);
    }

    @Override
    public void delete(Object o) {
        super.delete(o);
        dataBase.delete((Teacher) o);
        System.out.println("删除信息后：");
        dataBase.select(null);
    }

    public Set<Teacher> select(Object o) {
        Set<Teacher> teacherSet = dataBase.select((Teacher) o);
        Iterator<Teacher> iterator = teacherSet.iterator();
        if (teacherSet!=null){
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
        }else {
            System.out.println("无数据");
        }
        return teacherSet;

    }

    public void update(Object o) {
        super.update(o);
        dataBase.update((Teacher) o);
        System.out.println("修改信息后：");
        dataBase.select(null);
    }

}

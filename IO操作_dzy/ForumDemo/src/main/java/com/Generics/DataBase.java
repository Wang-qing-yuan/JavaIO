package com.Generics;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DataBase {
    private Set<Teacher> daoList;
    public static DataBase instance = new DataBase();

    public DataBase() {
        daoList = new TreeSet<>();
        Teacher teacher0 = new Teacher("001","邓振宇",20);
        Teacher teacher1 = new Teacher("002","刘瑜",21);
        Teacher teacher2 = new Teacher("003","王庆媛",20);
        Teacher teacher3 = new Teacher("004","钟盛",21);
        Teacher teacher4 = new Teacher("005","秦涛",21);
        daoList.add(teacher0);
        daoList.add(teacher1);
        daoList.add(teacher2);
        daoList.add(teacher3);
        daoList.add(teacher4);
    }

    /**
     * 从数据库中通过id删除数据
     * @param teacher
     * @return
     */
    public boolean delete(Teacher teacher) {
        if (daoList == null) {
            return false;
        }
        Teacher t = null;
        Iterator<Teacher> iter = daoList.iterator();
        boolean flag = false;
        if (iter.hasNext()) {
            t = iter.next();
            if (t.getId().equals(teacher.getId())) {
                flag = true;
            }
        }
        if (flag) {
            daoList.remove(t);
            return true;
        }
        return false;
    }


    /**
     * 将数据插入数据库
     * @param teacher
     * @return
     */
    public boolean insert(Teacher teacher) {
        Iterator<Teacher> iter = daoList.iterator();
        boolean flag = false;
        Teacher t = null;
        if (iter.hasNext()) {
            t = iter.next();
            if (t.getId().equals(teacher.getId())) {
                flag = true;
            }
        }
        if (!flag) {
            this.daoList.add(teacher);
            return true;
        }
        return false;
    }

    /**
     * 修改数据库中的数据
     * @param teacher
     * @return
     */
    public boolean update(Teacher teacher) {
        Iterator<Teacher> iter = daoList.iterator();
        boolean flag = false;
        Teacher t = null;
        if (iter.hasNext()) {
            t = iter.next();
            if (t.getId().equals(teacher.getId())) {
                flag = true;
            }
        }
        if (flag) {
            this.daoList.remove(t);
            this.daoList.add(teacher);
            return true;
        }
        return false;
    }

    /**
     * 根据条件获取整个表
     * @return
     */
    public Set<Teacher> select(Teacher teacher){
        Set<Teacher> resultList = new TreeSet<>();
        Iterator<Teacher> iter = daoList.iterator();
        Teacher t = null;
        if (null == teacher)
            while (iter.hasNext()) resultList.add(iter.next());
        else if (null!=teacher.getId()){
            System.out.println("根据Id查询：");
            while (iter.hasNext()) {
                t = iter.next();
                if (t.getId().equals(teacher.getId())){
                    resultList.add(t);
                }
            }
        }else if (null!=teacher.getAge()){
            System.out.println("根据年龄查询：");
            while (iter.hasNext()) {
                t = iter.next();
                if (t.getAge()==teacher.getAge()){
                    resultList.add(t);
                }
            }
        }else if (null!=teacher.getName()){
            System.out.println("根据姓名查询：");
            while (iter.hasNext()) {
                t = iter.next();
                if (t.getName().equals(teacher.getName())){
                    resultList.add(t);
                }
            }
        }
        return resultList;
    }
}

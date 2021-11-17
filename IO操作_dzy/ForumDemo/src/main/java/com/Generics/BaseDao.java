package com.Generics;

import javax.jms.Session;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseDao<T> {

    private Session session;
    private Class clazz;

    /**
     * 重要：取得那个子类在调用
     */
    public BaseDao() {
        Class clazz = this.getClass();
        Type type = this.getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();
            clazz = (Class) pt.getActualTypeArguments()[0];
            System.out.println(clazz);
        }

    }

    public void add(T t) {
    }

    public T find(T t) {
        return null;
    }

    public void update(T t) {
    }

    public void delete(T t) {
    }
}


package com.Generics;

public class Generic<T> {
    /**
     * key的类型必须由外部指定
     */
    private T key;

    /**
     * 构造方法的形参必须也是T
     * @param key
     */
    public Generic(T key) {
        this.key = key;
    }

    /**
     * 成员方法：返回值的类型必须也是T
     * @return
     */
    public T getKey() {
        return key;
    }

    public static void main(String[] args) {
        //传入Integer给T
        Generic<Integer> genericInteger = new Generic<>(123);
        //传入String给T
        Generic<String> genericString = new Generic<>("Java");
        System.out.println("泛型测试："+ genericInteger.getKey());
        System.out.println("泛型测试："+ genericString.getKey());
    }
}

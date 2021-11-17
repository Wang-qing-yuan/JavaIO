package com.Generics;

public class WorkerDao extends BaseDao{
    public static WorkerDao instance = new WorkerDao();

    @Override
    public void add(Object o) {
        super.add(o);
    }

    public static void main(String[] args) {
        Worker worker =new Worker("5555","刘瑜");
        WorkerDao.instance.add(worker);
    }
}


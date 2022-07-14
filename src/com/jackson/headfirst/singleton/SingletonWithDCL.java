package com.jackson.headfirst.singleton;
// Double Checked Locking
public class SingletonWithDCL {

    private volatile static SingletonWithDCL uniqueInstance;

    private SingletonWithDCL(){}

    public static SingletonWithDCL getInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonWithDCL.class){
                if(uniqueInstance == null) uniqueInstance = new SingletonWithDCL();
            }
        }
        return uniqueInstance;
    }
}

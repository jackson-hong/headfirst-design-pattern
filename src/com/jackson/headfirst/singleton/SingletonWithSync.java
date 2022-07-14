package com.jackson.headfirst.singleton;

public class SingletonWithSync {
    private static SingletonWithSync uniqueInstance;

    private SingletonWithSync(){};

    public static synchronized SingletonWithSync getInstance(){
        if(uniqueInstance == null) return new SingletonWithSync();
        return uniqueInstance;
    }
}

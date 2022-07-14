package com.jackson.headfirst.singleton;

public class SingletonWithInit {
    private static SingletonWithInit uniqueInstance = new SingletonWithInit();

    public SingletonWithInit() {
    }

    public static SingletonWithInit getInstance(){
        return uniqueInstance;
    }
}

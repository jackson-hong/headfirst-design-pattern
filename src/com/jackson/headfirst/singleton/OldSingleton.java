package com.jackson.headfirst.singleton;

// 고전적인 싱글턴 패턴
public class OldSingleton {

    private static OldSingleton uniqueInstance;

    private OldSingleton(){};

    public static OldSingleton getInstance(){
        if(uniqueInstance == null) return new OldSingleton();
        return uniqueInstance;
    }

}

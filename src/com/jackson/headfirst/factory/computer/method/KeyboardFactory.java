package com.jackson.headfirst.factory.computer.method;

public class KeyboardFactory {

    public Keyboard createKeyboard(String type){

        switch (type){
            case "LG" : return new LGKeyboard();
            case "Samsung" : return new SamsungKeyboard();
        }

        return null;
    }

}

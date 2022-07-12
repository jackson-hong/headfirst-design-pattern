package com.jackson.headfirst.factory.computer.method;

public class MouseFactory {

    public Mouse createMouse(String type){

        switch (type){
            case "LG" : return new LGMouse();
            case "Samsung" : return new SamsungMouse();
        }

        return null;
    }

}

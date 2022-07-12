package com.jackson.headfirst.factory.computer.method;

public class ComputerFactory {

    public void createComputer(String type){
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        MouseFactory mouseFactory = new MouseFactory();


        keyboardFactory.createKeyboard(type);
        mouseFactory.createMouse(type);

        System.out.println(" Complete ");
    }
}

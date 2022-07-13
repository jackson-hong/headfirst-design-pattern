package com.jackson.headfirst.factory.computer.abs;

public class FactoryOfComputerFactory {
    public void createComputer(String type){

        ComputerFactory computerFactory = null;

        switch (type){
            case "LG":  computerFactory = new LGComputerFactory(); break;
            case "Samsung":  computerFactory = new SamsungComputerFactory(); break;
        }

        if(computerFactory == null) return;

        computerFactory.createKeyboard();
        computerFactory.createMouse();

    }
}

package com.jackson.headfirst.factory.computer.abs;

public class Client {
    public static void main(String[] args) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("LG");
    }


}

package com.jackson.headfirst.factory.computer.method;

public class Client {
    public static void main(String[] args) {

        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer("Samsung");

    }
}

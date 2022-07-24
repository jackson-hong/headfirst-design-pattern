package com.jackson.headfirst.iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(dinerMenu, pancakeMenu);

        waitress.printMenu();
    }
}

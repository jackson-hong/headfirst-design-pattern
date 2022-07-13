package com.jackson.headfirst.factory.computer.abs;


import com.jackson.headfirst.factory.computer.method.Keyboard;
import com.jackson.headfirst.factory.computer.method.Mouse;
import com.jackson.headfirst.factory.computer.method.SamsungKeyboard;
import com.jackson.headfirst.factory.computer.method.SamsungMouse;

public class SamsungComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}

package com.jackson.headfirst.factory.computer.abs;

import com.jackson.headfirst.factory.computer.method.Keyboard;
import com.jackson.headfirst.factory.computer.method.LGKeyboard;
import com.jackson.headfirst.factory.computer.method.LGMouse;
import com.jackson.headfirst.factory.computer.method.Mouse;

public class LGComputerFactory implements ComputerFactory{
    @Override
    public Keyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}

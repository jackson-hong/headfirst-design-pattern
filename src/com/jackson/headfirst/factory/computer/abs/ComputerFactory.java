package com.jackson.headfirst.factory.computer.abs;

import com.jackson.headfirst.factory.computer.method.Keyboard;
import com.jackson.headfirst.factory.computer.method.Mouse;

public interface ComputerFactory {
    Keyboard createKeyboard();
    Mouse createMouse();
}

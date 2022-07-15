package com.jackson.headfirst.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setSlot(lightOn);
        remoteControl.buttonWasPressed();
        remoteControl.setSlot(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();
    }
}

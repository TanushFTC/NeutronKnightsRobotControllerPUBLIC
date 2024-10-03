package org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad.buttonPressedEvent;

import java.util.EventObject;

public class ButtonPressedEvent extends EventObject {

    private int buttonPressed;

    public ButtonPressedEvent(Object source, int buttonPressed) {
        super(source);
        this.buttonPressed = buttonPressed;
    }
    public int getButtonPressed(){
        return buttonPressed;
    }
}

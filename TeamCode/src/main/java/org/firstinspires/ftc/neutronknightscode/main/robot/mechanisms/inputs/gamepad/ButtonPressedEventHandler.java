package org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad;

import org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad.buttonPressedEvent.ButtonPressedEvent;
import org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad.buttonPressedEvent.ButtonPressedEventListener;
import org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad.gamepadPresets.GamepadPreset;

public class ButtonPressedEventHandler implements ButtonPressedEventListener {

    public boolean slow;
    public boolean turningMode;

    private final int slowButton;
    private final int turningModeButton;

    public ButtonPressedEventHandler(GamepadPreset preset){
        this.slowButton = preset.slowButton;
        this.turningModeButton = preset.turningModeButton;
    }
    @Override
    public void handleButtonPressed(ButtonPressedEvent buttonPressedEvent) {
        int buttonPressed = buttonPressedEvent.getButtonPressed();
        if(buttonPressed == slowButton) {
            this.slow = true;
        } else if(buttonPressed == turningModeButton){
            this.turningMode = true;
        }
    }
}

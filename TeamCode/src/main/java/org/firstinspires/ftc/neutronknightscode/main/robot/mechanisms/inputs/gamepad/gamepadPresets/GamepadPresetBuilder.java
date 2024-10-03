package org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad.gamepadPresets;

public class GamepadPresetBuilder {
    public int slowButton;
    public int turningModeButton;

    public GamepadPresetBuilder setSlowButton(int slowButton){
        this.slowButton = slowButton;
        return this;
    }
    public GamepadPresetBuilder setTurningModeButton(int turningModeButton){
        this.turningModeButton = turningModeButton;
        return this;
    }
}

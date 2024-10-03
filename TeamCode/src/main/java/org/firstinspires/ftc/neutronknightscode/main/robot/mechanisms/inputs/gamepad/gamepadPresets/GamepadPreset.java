package org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad.gamepadPresets;

public class GamepadPreset {
    public int slowButton;
    public int turningModeButton;

    public GamepadPreset(GamepadPresetBuilder builder){
        slowButton = builder.slowButton;
        turningModeButton = builder.turningModeButton;
    }
}

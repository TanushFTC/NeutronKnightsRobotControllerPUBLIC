package org.firstinspires.ftc.neutronknightscode.main.robot.mechanisms.inputs.gamepad.gamepadPresets;

public enum GamepadPresets {
    DEFAULT(new GamepadPreset(new GamepadPresetBuilder().setSlowButton(14).setTurningModeButton(13)));
    private GamepadPreset preset;
    private GamepadPresets(GamepadPreset preset){
        this.preset = preset;
    };
    public GamepadPreset getPreset(){
        return this.preset;
    }
}

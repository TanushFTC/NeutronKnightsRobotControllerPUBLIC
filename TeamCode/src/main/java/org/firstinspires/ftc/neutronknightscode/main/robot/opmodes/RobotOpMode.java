package org.firstinspires.ftc.neutronknightscode.main.robot.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.neutronknightscode.main.robot.Robot;


public abstract class RobotOpMode extends OpMode {

    public Robot robot;

    @Override
    public void init() {
        robot = Robot.init(hardwareMap);
    }
}

package org.firstinspires.ftc.neutronknightscode.main.robot.opmodes;

import static org.firstinspires.ftc.neutronknightscode.main.robot.Robot.drivetrain;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.neutronknightscode.main.robot.Robot;

@TeleOp
public class RobotTeleOp extends RobotOpMode {
    @Override
    public void loop() {
        double positivePower = gamepad1.right_stick_y+gamepad1.right_stick_x;
        double negativePower = gamepad1.right_stick_y-gamepad1.right_stick_x;
        drivetrain.setPower(positivePower, positivePower, negativePower, negativePower);
    }
}

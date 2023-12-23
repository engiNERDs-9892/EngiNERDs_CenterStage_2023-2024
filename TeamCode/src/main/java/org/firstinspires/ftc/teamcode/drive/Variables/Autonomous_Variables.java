package org.firstinspires.ftc.teamcode.drive.Variables;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@Disabled
public class Autonomous_Variables {
    public static DcMotor motorLiftyLift;
    public static DcMotor motorRiseyRise;
    public static Servo FlippyFlip;
    public static Servo FlooppyFloop;
    public static Servo GearServo;
    public static Servo LeftClaw;
    public static Servo RightClaw;
    public static Servo AirplaneServo;
    public static Servo HookL;
    public static Servo HookR;

    public static double ClawR_Open = 0.77;
    public static double ClawR_Close = 1;
    public static double ClawL_Open = 0.33;
    public static double ClawL_Close = 0;
    }

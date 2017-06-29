package org.firstinspires.ftc.teamcode;

import android.graphics.Path;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by The Saminator on 11-12-2016.
 */
public class Constants {
    public static final double RIGHT_POWER_FACTOR_2016 = 1.0;

    public static final double SERVO_MIN_2016 = 0.2;
    public static final double SERVO_INIT_2016 = 0.5;
    public static final double SERVO_MAX_2016 = 0.65;

    public static final DcMotor.Direction L_MTR_DIR_2016 = DcMotor.Direction.FORWARD;
    public static final DcMotor.Direction R_MTR_DIR_2016 = DcMotor.Direction.REVERSE;

    public static final double ENCODER_MULT = 0.8;

    public static final int ENCODER_DIR_2016 = -1;

    public static final double SRV2_MAX_2016 = 0.2;
    public static final double SRV2_MIN_2016 = 0;

    public static final double BLUE_THRESHOLD_2016 = 1.3;

    public static final double SQUARE_POWER_2016 = 0.115;

    public static final double WAIT_TIME_2016 = 10000; // DONE: MAKE THIS 10000 MS AT COMPETITION.

    public static final double POW_TO_BEACON_2016 = -0.15;

    public static final double BALL_LAUNCHER_DIR_2016 = 1;

    //////////////////////
    // Start 2017-2018 //
    ////////////////////


    public static final DcMotor.Direction LEFT_FORE_DIR = DcMotor.Direction.FORWARD;
    public static final DcMotor.Direction LEFT_REAR_DIR = DcMotor.Direction.FORWARD;
    public static final DcMotor.Direction RIGHT_FORE_DIR = DcMotor.Direction.REVERSE;
    public static final DcMotor.Direction RIGHT_REAR_DIR = DcMotor.Direction.REVERSE;

    public static final double LEFT_FORE_SPEED = 1.0; // Always positive and between 0 and 1.
    public static final double LEFT_REAR_SPEED = 1.0; // Always positive and between 0 and 1.
    public static final double RIGHT_FORE_SPEED = 1.0; // Always positive and between 0 and 1.
    public static final double RIGHT_REAR_SPEED = 1.0; // Always positive and between 0 and 1.
}
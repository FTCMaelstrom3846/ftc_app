package org.firstinspires.ftc.teamcode.control;

/**
 * Created by Ramsey on 10/23/2017.
 */

public interface Constants {

    double NANOSECONDS_PER_MINUTE = 6e+10;
    int NEVEREST_20_MAX_RPM = 320;
    double NEVEREST_20_COUNTS_PER_REV = 1440;
    double E4T_COUNTS_PER_REV = 537.6;
    double WHEEL_DIAMETER = 4;

    double ANGLE_TOLERANCE = 1.5;
    double DISTANCE_TOLERANCE = /*50*/100;
    double ULTRASONIC_DISTANCE_TOLERANCE = 0.3;

    double OPTOSENSOR_DETECT_CRYPTOBOX_THRESHOLD = 1.395;
    int TIME_BETWEEN_OPTOSENSOR_DETECTIONS = 1200;

    double TELEOP_TURNING_SPEED_MULTIPLIER = 0.55;
    double TELEOP_SPEED_MULTIPLIER = 1;
    double AUTONOMOUS_GLOBAL_SPEED_MULTIPLIER = 1;

    double RELIC_EXTENDER_POWER = -1;
    double RELIC_RETRACT_POWER = 1;

    double RELIC_GRABBER_OPEN = .02;
    double RELIC_GRABBER_CLOSED = 0.85;

    double RELIC_WRIST_RESET = 1;
    double RELIC_WRIST_UP = 0.5;
    double RELIC_WRIST_DROP = 0.225;
    double RELIC_WRIST_PICKUP = /*0.02*/0;

    double JEWEL_ARM_LOWER = 0.2;
    double JEWEL_ARM_RAISE = 0.64;
    double JEWEL_ARM_RAISE_AUTO = 0.8;
    double JEWEL_WRIST_RIGHT = 0.9;
    double JEWEL_WRIST_LEFT = 0.3;
    double JEWEL_WRIST_CENTER = 0.585;
    double JEWEL_WRIST_RESET = .82;

    double INTAKESYSTEM_INTAKE_POWER = .8;
    double INTAKESYSTEM_OUTAKE_POWER = -1;

    double DROPPER_EXTEND_POWER = -1;
    double DROPPER_RETRACT_POWER = 1;

    double LIFT_RAISE_POWER = 0.73;
    double LIFT_LOWER_POWER = -0.73;

    double PAN_RAISE = 0.66;
    double PAN_LOWER = .255;
    /*double PAN_LOWER_AUTO = .05;*/
    double PAN_CENTER = 0.31;

    double PAN_GRIP = .7;
    double PAN_OPEN = 1;

    double frontLeftKP = 20;
    double frontLeftKI = 0;
    double frontLeftKD = 0/*1.92426108e-6*/;
    double frontLeftMaxI = 1;

    double frontRightKP = 20;
    double frontRightKI = 0;
    double frontRightKD = 0;
    double frontRightMaxI = 1;

    double backLeftKP = 20;
    double backLeftKI = 0;
    double backLeftKD = 0;
    double backLeftMaxI = 1;

    double backRightKP = 20;
    double backRightKI = 0;
    double backRightKD = 0;
    double backRightMaxI = 1;

    double leftLiftKP = 2000000000;
    double leftLiftKI = 0;
    double leftLiftKD = 0;
    double leftLiftMaxI = 1;

    double rightLiftKP = 2000000000;
    double rightLiftKI = 0;
    double rightLiftKD = 0;
    double rightLiftMaxI = 1;

    double relicExtenderKP = 0.008;
    double relicExtenderKI = 0;
    double relicExtenderKD = 0;
    double relicExtenderMaxI = 1;

    double angleCorrectionKP = -0.032;
    double angleCorrectionKI = 0;
    double angleCorrectionKD = 0;
    double angleCorrectionMaxI = 0;

    double distanceKP = /*0.001*/0.001/5;
    double distanceKI = 0/*0.09*/;
    double distanceKD = 0.0000025;
    double distanceMaxI = 0;

/*    double ultrasonicDistanceKP = 0.035;
    double ultrasonicDistanceKI = 0.0001;
    double ultrasonicDistanceKD = 0.00000;
    double ultrasonicDistanceMaxI = 0;*/

    double shortDistanceKP = /*0.0027*/0.0027/5;
    double shortDistanceKI = 0/*0.3*/;
    double shortDistanceKD = 0.0000025;
    double shortDistanceMaxI = 0;

    double angleTurnKP = -0.0135;
    double angleTurnKI = -0.65;
    double angleTurnKD = 0;
    double angleTurnMaxI = 0;

    double smallAngleTurnKP = -0.019;
    double smallAngleTurnKI = -1.25;
    double smallAngleTurnKD = 0;
    double smallAngleTurnMaxI = 0;
}

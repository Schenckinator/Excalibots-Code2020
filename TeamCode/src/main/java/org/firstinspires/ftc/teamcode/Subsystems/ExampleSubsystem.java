package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;

import ftclib.subsystems.Subsystem;

public class ExampleSubsystem extends Subsystem {

    private DcMotor motor;

    public ExampleSubsystem(HardwareMap ahwMap){
        hwMap = ahwMap;
        //Add actuators and sensors here

        motor = hwMap.dcMotor.get(ActuatorMap.sampleMotor);

    }

    public void init(){

        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    }

    public void turnMotor() {

        motor.setPower(1);

    }

    public double getPower(){
        return motor.getPower();
    }

    public void stop(){

        motor.setPower(0);
    }

}

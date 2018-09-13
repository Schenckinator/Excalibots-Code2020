package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.Subsystems.ExampleSubsystem;

public class Robot {

    //Subsystems
    public static ExampleSubsystem exampleSubsystem;

    //Actuators and globals
    public Robot(HardwareMap ahwMap){
        exampleSubsystem = new ExampleSubsystem(ahwMap);
    }

    //Start
    public void init() {
        exampleSubsystem.init();
    }

    //Stop
    public void stop(){
        exampleSubsystem.stop();
    }

}


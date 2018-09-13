package org.firstinspires.ftc.teamcode.OpModes.Autonomous.Commands;

import org.firstinspires.ftc.teamcode.Robot;
import org.firstinspires.ftc.teamcode.Subsystems.ExampleSubsystem;

import ftclib.commandSystem.Command;

public class SampleCommand extends Command {

    @Override
    public void start() {
        //Put code here that you you want to run as soon as you execute your command
        Robot.exampleSubsystem.init();
    }

    @Override
    public void execute() {
        //Put code here that you want to loop while your command is running
        Robot.exampleSubsystem.turnMotor();
    }

    @Override
    public boolean finished() {
        //Make this return true when your command is finished.
        //If it is based on time, ignore this and enter your timeout when you run the command.

        //This example will finish after the motors power gets above 90%
        return Robot.exampleSubsystem.getPower() > .9;
    }

    @Override
    public void stop() {
        //Put code here that you want to run when your command is instructed to stop
        Robot.exampleSubsystem.stop();
    }

}

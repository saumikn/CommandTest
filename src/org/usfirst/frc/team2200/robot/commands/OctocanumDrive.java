package org.usfirst.frc.team2200.robot.commands;

import org.usfirst.frc.team2200.robot.Constants;
import org.usfirst.frc.team2200.robot.OI;
import org.usfirst.frc.team2200.robot.Robot;
import org.usfirst.frc.team2200.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OctocanumDrive extends Command
{
	Drivetrain dt = new Drivetrain();
	OI oi = new OI();
	

    public OctocanumDrive()
    {    	
		requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
    	boolean isToggleButtonPressed = oi.octoSwitch.get();
    	dt.togglePiston(isToggleButtonPressed);
    	
    	if(dt.left.get())
    	{
    		double lr = oi.leftRightDrive;
        	double fb = oi.frontBackDrive;
        	
        	double magnitude = Math.sqrt(lr*lr + fb*fb);
            double direction = Math.atan(fb / lr);
        	double rotation = oi.rotationDrive;
        	
    		dt.mecanumDrive_Polar(magnitude, direction, rotation);
    	}
    	else
    	{
    		double leftSpeed = oi.leftDrive;
    		double rightSpeed = oi.rightDrive;
    		boolean squaredInputs = Constants.IS_DRIVETRAIN_SQUARED;
    		dt.tankDrive(leftSpeed, rightSpeed, squaredInputs);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end()
    {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
    {
    	
    }
}

package org.usfirst.frc.team2200.robot.subsystems;

import org.usfirst.frc.team2200.robot.Constants;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Talon frontLeft = new Talon(Constants.FRONT_LEFT_MOTOR_PORT);
	Talon backLeft = new Talon(Constants.BACK_LEFT_MOTOR_PORT);
	Talon frontRight = new Talon(Constants.FRONT_RIGHT_MOTOR_PORT);
	Talon backRight = new Talon(Constants.BACK_RIGHT_MOTOR_PORT);
	
	public Solenoid left = new Solenoid(1, Constants.DRIVETRAIN_PISTON_EXTEND_PORT);
	public Solenoid right = new Solenoid(1, Constants.DRIVETRAIN_PISTON_RETRACT_PORT);
	
	RobotDrive robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed, boolean squaredInputs)
    {
    	robotDrive.tankDrive(leftSpeed, rightSpeed, squaredInputs);
    }
    
    public void mecanumDrive_Polar(double magnitude, double direction, double rotation)
    {
    	robotDrive.mecanumDrive_Polar(magnitude, direction, rotation);
    }
    
    
    public void togglePiston(boolean isToggleButtonPressed)
    {
    	boolean isExtended = left.get();
    	if(isToggleButtonPressed)
    	{	    	
	    	if(isExtended)
	    	{
	    		isExtended = false;
	    		left.set(isExtended);
	    		right.set(!isExtended);
	       	}
	    	else
	    	{
	    		isExtended = true;
	    		left.set(!isExtended);
	    		right.set(isExtended);
	    		
	    	}
    	}
    }
}


package org.usfirst.frc.team2220.robot.controller;


import edu.wpi.first.wpilibj.buttons.Button;

public interface IController
{
	// Drivetrain parameters
	public double getLeftWheelFrontBack();
	public double getRightWheelFrontBack();
	public double getDriveLeftRight();
	public double getDriveFrontBack();
	public double getDriveRotate();
	public Button getOctoSwitch();
	
	
	
	// Manipulator parameters
}

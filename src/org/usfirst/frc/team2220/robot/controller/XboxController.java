package org.usfirst.frc.team2220.robot.controller;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XboxController implements IController
{
	Joystick xbox;
	public XboxController(int port)
	{
		xbox = new Joystick(port);
	}
	
	public final Button A_BUTTON = new JoystickButton(xbox,1);
	public final Button B_BUTTON = new JoystickButton(xbox,2);
	public final Button X_BUTTON = new JoystickButton(xbox,3);
	public final Button Y_BUTTON = new JoystickButton(xbox,4);
	public final Button LEFT_BUMPER_BUTTON = new JoystickButton(xbox,5);
	public final Button RIGHT_BUMPER_BUTTON = new JoystickButton(xbox,6);
	public final Button BACK_BUTTON = new JoystickButton(xbox,7);
	public final Button START_BUTTON = new JoystickButton(xbox,8);
	public final Button LEFT_STICK_BUTTON = new JoystickButton(xbox,9);
	public final Button RIGHT_STICK_BUTTON = new JoystickButton(xbox,10);
	
	public final int LEFT_STICK_X_AXIS = 1;
	public final int LEFT_STICK_Y_AXIS = 2;
	public final int LEFT_TRIGGER = 3;
	public final int RIGHT_TRIGGER = 4;
	public final int RIGHT_STICK_X_AXIS = 5;
	public final int RIGHT_STICK_Y_AXIS = 6;


	@Override
	public double getLeftWheelFrontBack()
	{
		return LEFT_STICK_Y_AXIS;
	}

	@Override
	public double getRightWheelFrontBack()
	{
		return RIGHT_STICK_Y_AXIS;
	}

	@Override
	public double getDriveLeftRight()
	{
		return LEFT_STICK_X_AXIS;
	}

	@Override
	public double getDriveFrontBack()
	{
		return LEFT_STICK_Y_AXIS;
	}

	@Override
	public double getDriveRotate()
	{
		return RIGHT_STICK_X_AXIS;
	}

	@Override
	public Button getOctoSwitch()
	{
		return A_BUTTON;
	}

}

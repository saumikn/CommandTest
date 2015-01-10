package org.usfirst.frc.team2220.robot.controller;

import org.usfirst.frc.team2200.robot.Constants;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
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

	private AxisType axis;
	
	public double hi = xbox.getAxis(axis);
	
	public final int LEFT_STICK_LEFT_RIGHT = 1;
	public final int LEFT_STICK_UP_DOWN = 2;
	public final int RIGHT_STICK_LEFT_RIGHT = 3;
	public final int RIGHT_STICK_UP_DOWN = 4;
	public final int TRIGGER = 5;


	@Override
	public double getLeftWheelFrontBack()
	{
		return LEFT_STICK_UP_DOWN;
	}

	@Override
	public double getRightWheelFrontBack()
	{
		return RIGHT_STICK_UP_DOWN;
	}

	@Override
	public double getDriveLeftRight()
	{
		return LEFT_STICK_LEFT_RIGHT;
	}

	@Override
	public double getDriveFrontBack()
	{
		return LEFT_STICK_UP_DOWN;
	}

	@Override
	public double getDriveRotate()
	{
		return RIGHT_STICK_LEFT_RIGHT;
	}

	@Override
	public Button getOctoSwitch()
	{
		return A_BUTTON;
	}

}

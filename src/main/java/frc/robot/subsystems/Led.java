// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

 import com.ctre.phoenix.led.*;
import com.ctre.phoenix.led.CANdle.LEDStripType;
import com.ctre.phoenix.led.CANdle.VBatOutputMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Constants;
import java.awt.Color;

public class Led extends SubsystemBase {
    private static int NUM_LEDS = 110;
    private CANdle candle = new CANdle(Constants.LEDConstants.candleID1);
 // private static ShooterSubsystem shooter;
 //  private static IntakeSubsystem intake;

    private static Animation tempAnimation = new RainbowAnimation(1.0,0.6, NUM_LEDS);

    }

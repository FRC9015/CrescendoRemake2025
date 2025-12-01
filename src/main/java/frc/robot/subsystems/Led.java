// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.led.*;
import com.ctre.phoenix.led.CANdle.LEDStripType;
import com.ctre.phoenix.led.CANdle.VBatOutputMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.generated.TunerConstants;
import frc.robot.generated.TunerConstants;
import java.awt.Color;

public class Led extends SubsystemBase {
    private static int NUM_LEDS = 110;
    private CANdle candle = new CANdle(TunerConstants.LEDConstants.candleID1);
  //private static Shooter shooter;
   //private static Intake intake;

    private static Animation tempAnimation = new RainbowAnimation(1.0,0.6, NUM_LEDS);{

  

  // public Led(IntakeSubsystem intake, ShooterSubsystem shooter) {
   //this.shooter = shooter;
   // this.intake = intake;
   CANdleConfiguration candleConfiguration = new CANdleConfiguration();
   candleConfiguration.disableWhenLOS = false;
   candleConfiguration.stripType = LEDStripType.RGB;
   candleConfiguration.brightnessScalar = 1.0;
   candleConfiguration.vBatOutputMode = VBatOutputMode.Modulated;
   candle.configAllSettings(candleConfiguration, 250);
   candle.clearAnimation(0);
   }
    public static void colorSet(Color color){  tempAnimation = new StrobeAnimation( color.getRed(),color.getGreen(), color.getBlue(), 0, 1, NUM_LEDS );
    }

    public static void StrobeAnimation(Color color){
   tempAnimation = new StrobeAnimation(color.getRed(),color.getGreen(),color.getBlue(),0,1,NUM_LEDS);
    }

    public static void startedNote(){
   //   if (shooter.getShooterSensor()&& intake.getHandoffStatus()){
         colorSet(Color.MAGENTA);
      }
    //  else if(intake.getHandoffStatus()) {
  //       colorSet(Color.CYAN);
   //  }
     // if (shooter.getShooterSensor()) {
    //     colorSet(Color.ORANGE);  
//     }
 

 public static void indicateShooter(){
  //   if (shooter.shooterIsReady()){
      colorSet(Color.RED);
     }
 //}
 //}
    }
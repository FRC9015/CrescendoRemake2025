package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ShooterSubsystem extends SubsystemBase {

    private SparkMax speakerMotorTop = new SparkMax(54, MotorType.kBrushless);
    private SparkMax speakerMotorBottom = new SparkMax(51, MotorType.kBrushless);


    public ShooterSubsystem(){
    SparkMaxConfig config = new SparkMaxConfig();

    config
    // current limit: max40 amps (protects motor and battery)
        .smartCurrentLimit(40)

    // idle mode: Brake (resists spinning when motor is off)
        .idleMode(IdleMode.kBrake);
    
    // applies configurations
    speakerMotorTop.configure(
        config, 
        // resets safe parameters before applying
        ResetMode.kResetSafeParameters, 
        // does NOT save config to motor's flash
        PersistMode.kNoPersistParameters);
    
    speakerMotorBottom.configure(
        config, 
        ResetMode.kResetSafeParameters, 
        PersistMode.kNoPersistParameters);
    }

    // Spins both shooter motors
    public void runShooter(double percent){
        speakerMotorTop.set(percent);
        speakerMotorBottom.set(percent);
    }

    public void stop(){
        speakerMotorTop.stopMotor();
        speakerMotorBottom.stopMotor();

    }


}

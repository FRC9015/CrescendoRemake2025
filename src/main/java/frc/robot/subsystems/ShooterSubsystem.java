package frc.robot.subsystems;

import frc.robot.Constants.ShooterConstants;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase; // Recommended for FRC subsystems

public class ShooterSubsystem extends SubsystemBase {
    public SparkFlex vortexMotorTop;
    public SparkFlex vortexMotorBottom;

    public ShooterSubsystem() {
        vortexMotorTop = new SparkFlex(ShooterConstants.speakerShooterMotorTopID, MotorType.kBrushless);   
        vortexMotorBottom = new SparkFlex(ShooterConstants.speakerShooterMotor2ID, MotorType.kBrushless);
    }
    

    public void runShooterForward() {
        vortexMotorTop.set(0.5);
        vortexMotorBottom.set(0.5);
    }

    public void runShooterBackward() {
        vortexMotorTop.set(-0.5);
        vortexMotorBottom.set(-0.5);
    }
    
    public void stopShooter() {
        vortexMotorTop.stopMotor();
        vortexMotorBottom.stopMotor();
    }

    public Command runShooterOut() {
        return this.runOnce(() -> runShooterForward());
    }

    public Command runShooterIn() {
        return this.runOnce(() -> runShooterBackward());
    }

    public Command stopShooterTopMotor() {
        return this.runOnce(() -> stopShooter());
    }

    @Override
    public void periodic() {
        // called every 20ms
    }
}
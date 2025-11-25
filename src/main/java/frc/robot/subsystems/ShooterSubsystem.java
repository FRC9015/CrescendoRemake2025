package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.constants.Constants;

public class ShooterSubsystem extends SubsystemBase {
    private final SparkFlex motor1;
    private final SparkFlex motor2;

    public ShooterSubsystem() {
        motor1 = new SparkFlex(Constants.speakerShooterMotorTopID, MotorType.kBrushless);
        motor2 = new SparkFlex(Constants.speakerShooterMotor2ID, MotorType.kBrushless);
    }

    public void shootTopForward() {
        motor1.set(0.5);
        motor2.set(0.5);
    }

    public void stopShooter() {
        motor1.stopMotor();
        motor2.stopMotor();
    }

    public Command shootForwardCommand() {
        return runOnce(() -> shootTopForward());
    }

    public Command shotStooper() {
        return runOnce(() -> stopShooter());
    }
}

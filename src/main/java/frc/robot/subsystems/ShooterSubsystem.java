package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{
    
    TalonFX left;
    TalonFX right;

    public ShooterSubsystem(){
        left = new TalonFX(0);
        right = new TalonFX(0);
    }

    public void setShooter(ShooterSpeed speed){
        switch (speed) {
            case kOff:
                left.set(0);
                right.set(0);
                break;
            case kOn:
                left.set(1);
                right.set(0.75);
                break;
            default:
                break;
        }
    }

    public enum ShooterSpeed{
        kOff,
        kOn
    }

}

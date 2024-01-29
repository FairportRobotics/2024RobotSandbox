package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{
    
    private final TalonFX left;
    private final TalonFX right;

    private final DigitalInput shooterNoteSensor;

    public ShooterSubsystem(){
        left = new TalonFX(0);
        right = new TalonFX(0);

        shooterNoteSensor = new DigitalInput(0);
    }

    public void shooterOn(){

        left.set(1.0);
        right.set(0.75);

    }

    public void shooterOff(){
        left.set(0);
        right.set(0);
    }

    public boolean isNoteInShooter(){
        return shooterNoteSensor.get();
    }

}

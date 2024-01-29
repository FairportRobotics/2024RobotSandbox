package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase{
    
    private final TalonFX intakeMotor;

    private final DigitalInput intakeNoteSensor;

    public IntakeSubsystem(){
        
      intakeMotor = new TalonFX(0);

      intakeNoteSensor = new DigitalInput(0);

    }

  public void intakeIn(){
    intakeMotor.set(0.5);
  }

  public void intakeOff(){
    intakeMotor.set(0);
  }

  public boolean isNoteInIntake(){
    return intakeNoteSensor.get();
  }

}

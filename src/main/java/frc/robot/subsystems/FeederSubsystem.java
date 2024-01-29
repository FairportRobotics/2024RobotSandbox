package frc.robot.subsystems;


import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class FeederSubsystem extends SubsystemBase{
    
  private final TalonFX elevatorMotor1;
  private final TalonFX elevatorMotor2;

  private final DigitalInput elevatorTopSwitch;
  private final DigitalInput elevatorBotSwitch;

  private final TalonFX feederMotor;

  private final DigitalInput feederNoteSensor;

  public FeederSubsystem(){
    elevatorMotor1 = new TalonFX(0);
    elevatorMotor2 = new TalonFX(0);

    elevatorTopSwitch = new DigitalInput(0);
    elevatorBotSwitch = new DigitalInput(0);
    
    feederMotor = new TalonFX(0);

    feederNoteSensor = new DigitalInput(0);
  }

  @Override
  public void periodic() {

  }

  public void feedToAmp(){
    feederMotor.set(-0.5);
  }

  public void feedToShooter(){
    feederMotor.set(0.5);
  }

  public void stopFeeder(){
    feederMotor.set(0);
  }

  public void sendElevatorToHome(){
    elevatorMotor1.set(-0.5);
    elevatorMotor2.set(-0.5);
  }

  public void sendElevatorToAmp(){
    elevatorMotor1.set(0.5);
    elevatorMotor2.set(0.5);
  }

  public void stopElevator(){
    elevatorMotor1.set(0);
    elevatorMotor2.set(0);
  }

  public boolean isElevatorAtHome(){
    return elevatorBotSwitch.get();
  }

  public boolean isElevatorAtAmp(){
    return elevatorTopSwitch.get();
  }

  public boolean isNoteInFeeder(){
    return feederNoteSensor.get();
  }

}

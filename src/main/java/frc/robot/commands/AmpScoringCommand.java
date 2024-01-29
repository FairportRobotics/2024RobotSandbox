package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.FeederSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class AmpScoringCommand extends SequentialCommandGroup{

  private final IntakeSubsystem intakeSubsystem;
  private final FeederSubsystem feederSubsystem;

  public AmpScoringCommand(IntakeSubsystem intakeSubsystem, FeederSubsystem feederSubsystem){
    this.intakeSubsystem = intakeSubsystem;
    this.feederSubsystem = feederSubsystem;

    addCommands(null);

  }
}

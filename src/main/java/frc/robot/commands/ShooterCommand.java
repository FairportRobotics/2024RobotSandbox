package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ShooterSubsystem.ShooterSpeed;

public class ShooterCommand extends Command{
    
    private ShooterSpeed speed;

    public ShooterCommand(ShooterSpeed speed){
        this.speed = speed;
    }

    @Override
    public void initialize() {
        RobotContainer.SHOOTER_SUBSYSTEM.setShooter(speed);
    }

}

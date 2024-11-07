package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Subsystems.SwerveDriveSubsystem;

public class Teleop extends Command {
    SwerveDriveSubsystem swerveDriveSubsystem;
    CommandXboxController commandXboxController;

    public Teleop(SwerveDriveSubsystem sDriveSubsystem, CommandXboxController cXboxController) {
        swerveDriveSubsystem = sDriveSubsystem;
        commandXboxController = cXboxController;
    }

    @Override
    public void initialize() {
        // Runs only once when command is run
    }

    @Override
    public boolean isFinished() {
        // Runs every cycle
        return false;
    }

    @Override
    public void execute() {
        swerveDriveSubsystem.differentialDrive.arcadeDrive(commandXboxController.getLeftY(), commandXboxController.getLeftX());
    }
    
}

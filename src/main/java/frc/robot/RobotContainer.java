// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Commands.Teleop;
import frc.robot.Subsystems.SwerveDriveSubsystem;

public class RobotContainer {
  public CommandXboxController commandXboxController = new CommandXboxController(0);
  public SwerveDriveSubsystem swerveDriveSubsystem = new SwerveDriveSubsystem();
  public Teleop teleop = new Teleop(swerveDriveSubsystem, commandXboxController);

  public RobotContainer() {
    swerveDriveSubsystem.setDefaultCommand(teleop);
    configureBindings();

  }

  private void configureBindings() {
  
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
  
}

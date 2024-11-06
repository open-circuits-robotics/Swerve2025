package frc.robot.Subsystems;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;

public class SwerveDriveSubsystem extends SubsystemBase {
    // Motors/things to control
    SwerveDriveKinematics kinematics;

    // Constructor
    public SwerveDriveSubsystem() {

        kinematics = new SwerveDriveKinematics(
            new Translation2d(Constants.swerveOffsets[0], Constants.swerveOffsets[1]),
            new Translation2d(Constants.swerveOffsets[2], Constants.swerveOffsets[3]),
            new Translation2d(Constants.swerveOffsets[4], Constants.swerveOffsets[5]),
            new Translation2d(Constants.swerveOffsets[6], Constants.swerveOffsets[7])
        );

    }
    public void periodic() {

        

    }
}

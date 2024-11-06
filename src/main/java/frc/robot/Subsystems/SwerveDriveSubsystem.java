package frc.robot.Subsystems;

import java.io.File;
import java.io.IOException;

import javax.management.RuntimeErrorException;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Filesystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;
import swervelib.SwerveDrive;
import swervelib.math.SwerveMath;
import swervelib.parser.SwerveParser;
import swervelib.telemetry.SwerveDriveTelemetry;
import swervelib.telemetry.SwerveDriveTelemetry.TelemetryVerbosity;

public class SwerveDriveSubsystem extends SubsystemBase {
    // Motors/things to control
    SwerveDriveKinematics kinematics;
    double maximumSpeed = Units.feetToMeters(4.5);
    File swerveJsonDirectory = new File(Filesystem.getDeployDirectory(), "swerve");
    SwerveDrive swerveDrive;


    // Constructor
    public SwerveDriveSubsystem() {

        double angleConversionFactor = SwerveMath.calculateDegreesPerSteeringRotation(Constants.rotationGearRatio);
        double driveConversionFactor = SwerveMath.calculateMetersPerRotation(Constants.wheelDiameter,Constants.driveGearRatio);
        SwerveDriveTelemetry.verbosity = TelemetryVerbosity.HIGH;

        try {
            swerveDrive = new SwerveParser(swerveJsonDirectory).createSwerveDrive(maximumSpeed);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        swerveDrive.setHeadingCorrection(false);
        swerveDrive.setCosineCompensator(true);
        swerveDrive.setAngularVelocityCompensation(true, true, 0.1);
        swerveDrive.setModuleEncoderAutoSynchronize(false, 1);
        swerveDrive.pushOffsetsToEncoders();
                

    }
    public void periodic() {

        

    }
}

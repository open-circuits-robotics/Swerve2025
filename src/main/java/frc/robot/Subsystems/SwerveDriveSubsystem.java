package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class SwerveDriveSubsystem extends SubsystemBase {
    // Motors/things to control
    public Spark flDrive = new Spark(0);
    public Spark frDrive = new Spark(1);
    public Spark rlDrive = new Spark(2);
    public Spark rrDrive = new Spark(3);
    public DifferentialDrive differentialDrive = new DifferentialDrive(flDrive, frDrive);

    // Constructor
    public SwerveDriveSubsystem() {

        flDrive.addFollower(rlDrive);
        frDrive.addFollower(rrDrive);

    }
    public void periodic() {

        

    }
}

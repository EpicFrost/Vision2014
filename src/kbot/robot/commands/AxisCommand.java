
package kbot.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.image.ColorImage;
/**
 *
 * @author bradmiller
 */
public class AxisCommand extends CommandBase {
    private ColorImage image;

    public AxisCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(CommandBase.camera);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        image = camera.getImage();
        System.err.println("Image taken");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

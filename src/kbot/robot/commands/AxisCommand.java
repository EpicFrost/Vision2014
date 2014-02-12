
package kbot.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.image.ColorImage;
import org.opencv.core.*;
import org.opencv.highgui.*;
/**
 *
 * @author bradmiller
 */
public class AxisCommand extends CommandBase {
    //private ColorImage img1;
   //private ColorImage img2;
    private Mat procImage1;
    private Mat procImage2;
    private Mat finalImage;

    public AxisCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(CommandBase.camera);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        procImage1 = camera.getImage();
        procImage2 = camera.getImage();
        System.err.println("Two images taken");
        Core.subtract(procImage1,procImage2,finalImage);
        Highgui.imwrite("imgOff.png", procImage1);
        Highgui.imwrite("imgOn.png", procImage2);
        Highgui.imwrite("imgFinal.png", finalImage);
        this.isFinished();
        
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

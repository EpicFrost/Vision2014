
package kbot.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.image.ColorImage;
import kbot.robot.RobotMap;
import kbot.robot.commands.CommandBase;
import org.opencv.core.*;

/**
 *
 */
public class Axis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Mat getImg;

    public void initDefaultCommand() {
        
    }
    
    public Mat getImage() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        try {
            getImg = CommandBase.camera.getImage();
        }catch(Exception e){
            
        }
        return getImg;
    }
}


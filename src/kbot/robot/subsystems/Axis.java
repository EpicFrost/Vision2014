
package kbot.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.image.ColorImage;
import kbot.robot.RobotMap;

/**
 *
 */
public class Axis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    ColorImage getImg;

    public void initDefaultCommand() {
        
    }
    
    public ColorImage getImage() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        try {
            getImg = RobotMap.camera.getImage();
        }catch(Exception e){
            
        }
        return getImg;
    }
}


// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Backround extends Actor
{
    private int speed = 15;
    private int time = 0;

    /**
     * Act - do whatever the Backround wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getY() > 1200) {
            setLocation(getX(), getY() - 1600);
            setLocation(getX(), getY() + speed);
        }
        else {
            setLocation(getX(), getY() + speed);
        }
        
        time = time + 1;
        if (Greenfoot.isKeyDown("h")) {
            speed = speed - 1;
        }
        getWorld().showText("speed" + speed, 54, 200);
        if (Greenfoot.isKeyDown("w")) {
            speed = 20;
        }
    }

    /**
     * 
     */
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }
}

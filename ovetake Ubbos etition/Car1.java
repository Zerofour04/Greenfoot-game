// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Car1 extends Actor
{
    private int speed = 8;

    /**
     * 
     */
    public Car1()
    {
        if (Greenfoot.getRandomNumber(2) == 0) {
            setImage( new  GreenfootImage("car01-n.png"));
        }
    }

    /**
     * Act - do whatever the Car1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if (isTouching(Car1.class)) {
            removeTouching(Car1.class);
        }
        if (Greenfoot.isKeyDown("s")) {
            speed = 0;
        }
        else {
            speed = 8;
        }
        if (Greenfoot.isKeyDown("w")) {
            speed = 17;
        }
    }
}

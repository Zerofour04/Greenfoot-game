// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Car2 extends Actor
{
    private int speed = 10;

    /**
     * 
     */
    public Car2()
    {
        if (Greenfoot.getRandomNumber(2) == 0) {
            setImage( new  GreenfootImage("car02-n.png"));
        }
    }

    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + speed);
        if (isTouching(Car2.class)) {
            removeTouching(Car2.class);
        }
    }
}

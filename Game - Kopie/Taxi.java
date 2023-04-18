import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Taxi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taxi extends Actor
{
    /**
     * Act - do whatever the Taxi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 8;
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        if (Greenfoot.isKeyDown("s"))
        {
            speed = 0;
        }
        else 
        {
            speed = 8;
        }
        
        if (Greenfoot.isKeyDown("w"))
        {
            speed = 17;
        
        }
    }
}

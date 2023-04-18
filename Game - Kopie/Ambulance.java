import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulance extends Actor
{
    /**
     * Act - do whatever the Ambulance wants to do. This method is called whenever
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
        this.checkCollision();
    }
    
    public void checkCollision()
    {
        if (isTouching(Bullet.class))
        {
            getWorld().removeObject(this);
        }
        
        if (isTouching(shield.class))
        {
            getWorld().removeObject(this);
        }

    }
}

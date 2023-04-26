import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int numOfBullets = 0;
    int damage = 0;
    
    public void act() 
    {
        fly();
    }
    
    public void fly()
    {
        int speed = -8;
        setLocation(getX(), getY()+speed);
        
        if(isAtEdge())
        {
           getWorld().removeObject(this); 
        }
    } 
}

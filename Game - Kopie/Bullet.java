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
       
        this.fly();

    }
    
    
    public void fly()
    {
        int speed = -8;
        
     if(getY()>getWorld() .getHeight()-20)
        {
           setLocation(getX(), 0);
        }  
        else setLocation(getX(), getY()+speed);
        
        if(isAtEdge())
        {
        
           getWorld().removeObject(this); 
        
        }
       
    } 
    

}

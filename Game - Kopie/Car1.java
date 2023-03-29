import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car1 extends Actor
{
    /**
     * Act - do whatever the Car1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int XChase = 0;
    
    
    public void act() 
    {
        getXCoords();
        move();
    }
    public int getXCoords()
    {
        return getX();
    }
    public void move()
    {
       if(Greenfoot.isKeyDown("a"))
       {
       setLocation(getX()-5, getY());
    }
    
           if(Greenfoot.isKeyDown("d"))
       setLocation(getX()+5, getY());
       
    }
}

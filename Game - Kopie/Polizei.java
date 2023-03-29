import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Polizei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polizei extends Actor
{
    /**
     * Act - do whatever the Polizei wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int delay;
    private static final int maxDelay = 5;
    
    public void act() 
    {
    int PolizeiX = ((Car1) getWorld().getObjects(Car1.class).get(0)).getXCoords();
        
    if (delay < maxDelay) {
        delay++;
        return;
    } else {
        delay = 0;
    }

        setLocation(PolizeiX, getY());

        
        
    }    
}

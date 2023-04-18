import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shield extends Actor
{
    /**
     * Act - do whatever the shield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         this.location();
         this.collision();
    }
    
    public void location()
    {
       int shieldX = ((Car1) getWorld().getObjects(Car1.class).get(0)).getX();
         
       int shieldY = ((Car1) getWorld().getObjects(Car1.class).get(0)).getY() -50;
         
         setLocation(shieldX, shieldY); 
    }
    
    public void collision()
    {
        if(isTouching(Polizei.class))
        {
            getWorld().removeObject(this);
        }
    }
}

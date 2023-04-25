import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shield_Symbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shield_Symbol extends shield
{
    int speed = 3;
    /**
     * Act - do whatever the shield_Symbol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
       this.pickup(); 
    }
    
        public void pickup()
    {
        if(isTouching(Car1.class))
        {
           getWorld().addObject(new shield(),getX(), getY());
           getWorld().removeObject(this);
        }
        
        
        
    }
}

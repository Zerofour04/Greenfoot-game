import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteSedan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteSedan extends Actor
{
    /**
     * Act - do whatever the WhiteSedan wants to do. This method is called whenever
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
        this.checkCollisionShield();
        checkCollsionBullet();
    }
    
    public void checkCollisionShield()
    {
        if  (isTouching(shield.class))
        {
        shield shieldObj = (shield) getWorld().getObjects(shield.class).get(0);
        getWorld().removeObject(shieldObj);
        
        getWorld().removeObject(this);
        
        }
    }
    
    public void checkCollsionBullet(){
                if (isTouching(Bullet.class))
        {
            getWorld().removeObject(this);
            Car1.Kills++;
        }
    }
}

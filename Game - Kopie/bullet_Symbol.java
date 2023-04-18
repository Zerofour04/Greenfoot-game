import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet_Symbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet_Symbol extends Actor
{
    int speed = 3;
    /**
     * Act - do whatever the bullet_Symbol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.pickup();
        //this.move();
        //this.movement();
       
    }   
    

    
    public void pickup()
    {
        if(isTouching(Car1.class))
        {
           Bullet.numOfBullets --; 
           getWorld().removeObject(this);
        }
        
        
        
    }
    
}

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
    public static int timer = 0;
    public static boolean active = false;
    
    private int count = 0;
    private int removeDelay = 10;
    
    public void act()
    {
        counter();
        location();
        collision();
    }


        public void counter(){
        if (timer < 400){
            location();
        }
        else 
        {
            getWorld().removeObject(this);
        }
    }
    
    public void location()
    {

       int shieldX = ((Car1) getWorld().getObjects(Car1.class).get(0)).getX();
         
       int shieldY = ((Car1) getWorld().getObjects(Car1.class).get(0)).getY() -50;
         
        setLocation(shieldX, shieldY); 
        active = true;
    }

    
    public void collision()
    {
        if (count ==10) {
            count--;
            removeDelay = 0;
            getWorld().removeObject(this);
        }
    }
}

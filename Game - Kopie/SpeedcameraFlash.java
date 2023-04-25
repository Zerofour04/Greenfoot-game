import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedcameraFlash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedcameraFlash extends Actor
{
    /**
     * Act - do whatever the SpeedcameraFlash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        private int speed =15;
    private int time = 0;
    public void act()
   {
        
        if(getY() > 1200)
        {
            setLocation(getX(), getY() -1600);
            setLocation(getX(), getY() + speed);
        } 
        else{
            setLocation(getX(), getY() + speed);
        }
        
        time = time + 1;
        
    } 
    
    public void removeFlash(){
        getWorld().removeObject(this);
    }
    
}

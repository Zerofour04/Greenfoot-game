import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LightBorder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LightBorder extends Actor
{
    /**
     * Act - do whatever the LightBorder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int speed =15;
    private int count = 10;
    private int removeDelay = 15;
        
    private int count2 = 0;
    private int removeDelay2 = 1;
    public void act(){ 
        if(getY() > 1200)
        {
            setLocation(getX(), getY() -1600);
        } 
        else{
            setLocation(getX(), getY() + speed);
        }
        speedTicket();
    }  
    
    public void speedTicket(){
        if (isTouching(Car1.class) && (Car1.speedCar > 200)){
            SpeedcameraFlash flash = new SpeedcameraFlash();
            getWorld().addObject(flash, 790, 130);
            
            if (count ==10) {
                getWorld().removeObject(this);
                Greenfoot.delay(1);
                flash.removeFlash();
            }
        }                 
    }  
}





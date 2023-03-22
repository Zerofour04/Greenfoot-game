import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Backround extends Actor

{
    private int speed =15;
    private int time = 0;
    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

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
}

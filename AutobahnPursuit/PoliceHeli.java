import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PoliceHeli here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PoliceHeli extends Actor
{
    /**
     * Act - do whatever the PoliceHeli wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int delay;
    public int range = 1600;
    private static final int maxDelay = 8;
    
    public void act() 
    {
        int PolizeiX = ((Car1) getWorld().getObjects(Car1.class).get(0)).getXCoords();
        int PolizeiY = ((Car1) getWorld().getObjects(Car1.class).get(0)).getYCoords();
        if (delay < maxDelay) {
            delay++;
            return;
        } else 
        {
        delay = 0;
        }
        setLocation(PolizeiX -400, PolizeiY +190); 
        setBorder();
    }
    
    public void setBorder(){
        if (getX() < 150){
            setLocation(150, getY());
        }
        
        if (getX() >330){
            setLocation(330, getY());
        }
    }
}

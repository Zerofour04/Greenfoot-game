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
    public int range = 1600;
    private static final int maxDelay = 5;
    public static int rangeBetween = 300;
    
    public void act() 
    {
        int PolizeiX = ((Car1) getWorld().getObjects(Car1.class).get(0)).getXCoords();
        int PolizeiY = ((Car1) getWorld().getObjects(Car1.class).get(0)).getYCoords();
        
        if (delay < maxDelay) {
            delay++;
            return;
        } else {
            delay = 0;
        }
        chase();
        setLocation(PolizeiX, PolizeiY + rangeBetween); 
    }
    
    public void chase(){
        if (!getObjectsInRange( range, Car1.class ).isEmpty() )
        {
            Actor pj = getObjectsInRange( range, Car1.class ).get(0);
            turnTowards( pj.getX(), pj.getY());
        }
    }
    
    public void setBorder(){
        if (getX() < 250){
            setLocation(250, getY());
        }
        
        if (getX() >630){
            setLocation(630, getY());
        }
    }
}

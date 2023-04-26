import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Polizei2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polizei2 extends Actor
{
    /**
     * Act - do whatever the Polizei2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int delay;
    public int range = 1600;
    private static final int maxDelay = 8;
    
    public void act() {
        int PolizeiX = ((Car1) getWorld().getObjects(Car1.class).get(0)).getXCoords();
        int PolizeiY = ((Car1) getWorld().getObjects(Car1.class).get(0)).getYCoords();
    
        if (delay < maxDelay) {
            delay++;
            return;
        } else{
            delay = 0;
        }
        chase();
        setLocation(PolizeiX +100, PolizeiY +390); 
        setBorder();
    }
    
    public void chase(){
        if (!getObjectsInRange( range, Car1.class ).isEmpty() )
        {
            Actor pj = getObjectsInRange( range, Car1.class ).get(0);
            turnTowards( pj.getX()+100, pj.getY());
        }
    }
    
    public void setBorder(){
        if (getX() < 150){
            setLocation(150, getY());
        }
        
        if (getX() >630){
            setLocation(630, getY());
        }
    }
}

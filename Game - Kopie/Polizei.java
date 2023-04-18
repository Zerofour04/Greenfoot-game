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
    
    public void act() 
    {
    int PolizeiX = ((Car1) getWorld().getObjects(Car1.class).get(0)).getXCoords();
        
    if (delay < maxDelay) {
        delay++;
        return;
    } else {
        delay = 0;
    }
        test();
        setLocation(PolizeiX, getY());
        
        
    }
    
    public void test(){
        if ( ! getObjectsInRange( range, Car1.class ).isEmpty() ) //Erkennung des Autos 
    {
    Actor pj = getObjectsInRange( range, Car1.class ).get( 0 ); // Defenition des Actors wenn er in die Range kommt
    turnTowards( pj.getX(), pj.getY()); //Drehrichtung zum Verfolger
    
    }
    }
}

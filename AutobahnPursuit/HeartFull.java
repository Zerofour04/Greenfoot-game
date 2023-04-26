import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HeartFull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeartFull extends Actor
{
    /**
     * Act - do whatever the HeartFull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         showHealth();
    }
    
    public void showHealth() {
        if (Car1.damage == 1) {
            setImage(new GreenfootImage("FSpeedometer.png"));
            getWorld().showText("HP: 3", 220, 100);

        } else if (Car1.damage == 2) {
            setImage(new GreenfootImage("HSpeedometer.png"));
            getWorld().showText("HP: 2", 220, 100);
        } else if (Car1.damage == 3) {
            setImage(new GreenfootImage("ESpeedometer.png"));
            getWorld().showText("HP: 1", 220, 100);
        } else if (Car1.damage == 0){
            getWorld().showText("HP: 4", 220, 100);
        }
    }
}

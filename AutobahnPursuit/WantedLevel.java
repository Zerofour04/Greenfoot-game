import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WantedLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WantedLevel extends Actor
{
    /**
     * Act - do whatever the WantedLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int wantedLevel = 1;
    public void act()
    {
        showWantedLevel();
    }
    
    public void showWantedLevel() {
        if (wantedLevel == 1) {
            setImage(new GreenfootImage("WantedLevel1.png"));
        } else if (wantedLevel == 2) {
            setImage(new GreenfootImage("WantedLevel2.png"));
        } else if (wantedLevel == 3) {
            setImage(new GreenfootImage("WantedLevel3.png"));
        }
    }
}

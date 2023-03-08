import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bayern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Bayern extends World
{
 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
     
    GreenfootImage background;
    int currentX;
    int currentY;
     
    public Bayern()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 300, 1, false);
        background = new GreenfootImage("Bayern.jpg");
        getBackground().drawImage(background, 0, 0);
    }
     
    public void act()
    {
        drawBackground();
        checkKeys();
    }
     
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("left")) changeCurrentXY(-1, 0);
        if (Greenfoot.isKeyDown("right")) changeCurrentXY(1, 0);
        if (Greenfoot.isKeyDown("up")) changeCurrentXY(0, 1);
        if (Greenfoot.isKeyDown("down")) changeCurrentXY(0, -1);
    }
     
    public void drawBackground()
    {
        getBackground().drawImage(background, -currentX, -currentY);
    }
     
    public void changeCurrentXY(int changeX, int changeY)
    {
        currentX += changeX;
        currentY -= changeY;
    }
}

// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private Backround backround =  new  Backround();
    private Backround backround2 =  new  Backround();

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 800, 1, false);
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 2) {
            Car1 car =  new  Car1();
            addObject(car, 450, -30);
        }
        if (Greenfoot.getRandomNumber(100) < 1) {
            Car2 car2 =  new  Car2();
            addObject(car2, 353, -30);
            car2.turn(180);
        }
        if (Greenfoot.isKeyDown("s")) {
            backround.setSpeed(8);
            backround2.setSpeed(8);
        }
        else {
            backround.setSpeed(15);
            backround2.setSpeed(15);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(backround, 400, 400);
        addObject(backround2, 400, -400);
        Abulance abulance =  new  Abulance();
        addObject(abulance, 474, 672);
    }
}

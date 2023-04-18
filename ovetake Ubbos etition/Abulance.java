// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Abulance extends Actor
{
    private int Score = 0;

    /**
     * Act - do whatever the Abulance wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 6, getY());
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 6, getY());
        }
        if (getX() < 330) {
            setLocation(330, getY());
        }
        if (getX() > 492) {
            setLocation(492, getY());
        }
        if (getX() < 380) {
            Score = Score + 1;
        }
        if (isTouching(Car1.class)) {
            Gameover();
        }
        if (isTouching(Car2.class)) {
            Gameover();
        }
        getWorld().showText("Score" + Score, 54, 89);
    }

    /**
     * 
     */
    public void Gameover()
    {
        getWorld().showText("Gameover", 400, 400);
        Greenfoot.stop();
    }
}

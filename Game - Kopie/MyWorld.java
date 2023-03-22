import greenfoot.*; 

/**
 * Short demo showing how to animate a background image.
 * 
 * @author polle, mik
 * @version 1.4
 */
public class MyWorld extends World {

    private int scrollSpeed = 5;
    private Backround backround = new Backround();
    private Backround backround2 = new Backround();

    public MyWorld() {
        super(800, 600, 1, false);
        prepare();
        // Füge hier deine Objekte zur Welt hinzu
    }

    public void act() {
        if (Greenfoot.getRandomNumber(100) < 2)
        {
            Car1 car = new Car1();
            addObject(car,450,30);
        }
    }
    
    private void prepare()
    {
        addObject(backround,400,400);
        addObject(backround2,400,-400);
        Car1 car = new Car1();
        addObject(car,474,672);
    }
}
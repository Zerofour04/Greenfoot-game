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
        super( 800, 910, 1, false);
        prepare();
        // Füge hier deine Objekte zur Welt hinzu
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(500) < 2)
        {
            Ambulance AmbuEnemy = new Ambulance();
            addObject(AmbuEnemy, 450, -30);
        }
        
        if (Greenfoot.getRandomNumber(500) < 1)
        {
            Taxi TaxEnemy = new Taxi();
            addObject(TaxEnemy, 350, -30);
        }
        
        if (Greenfoot.getRandomNumber(100) < 2)
        {
            bullet_Symbol b1 = new bullet_Symbol();
            addObject(b1, 450, -30);
            

        }
        
        if (Greenfoot.getRandomNumber(100) < 2)
        {
            
            shield_Symbol s1 = new shield_Symbol();
            addObject(s1, 250, -30);
        }
    }
    
    
    private void prepare()
    {
        addObject(backround,400,400);
        addObject(backround2,400,-400);
        
        Car1 car = new Car1();
        addObject(car,400,600);
        
        Polizei police = new Polizei();
        addObject(police,400,850);
        
        HeartFull heart = new HeartFull();
        addObject(heart, 150, 150);
    }
}

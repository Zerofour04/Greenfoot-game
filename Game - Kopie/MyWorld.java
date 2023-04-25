import greenfoot.*; 

/**
 * Short demo showing how to animate a background image.
 * 
 * @author polle, mik
 * @version 1.4
 */
public class MyWorld extends World {

    private Backround backround = new Backround();
    private Backround backround2 = new Backround();
    private int count = 0;
    private int delay = 50;
    

    public MyWorld() {
        super( 900, 1000, 1, false);
        prepare();
        // Füge hier deine Objekte zur Welt hinzu
    }
    
    public void act()
    {
        checkSpawn();
        spawnRandomlyItem();
    }
    
    private void checkSpawn(){
        if (count == delay) { 
            count = 0; 
            spawnObject(); 
        } else {
            count++; 
        }
    }
    
    private void spawnObject(){
        int r = Greenfoot.getRandomNumber(5);
        switch (r) {
            case 0:
                Ambulance AmbuEnemy = new Ambulance();
                addObject(AmbuEnemy, 600, -30);
                break;
            case 1:
                RedCar RedCarEnemy = new RedCar();
                addObject(RedCarEnemy, 460, -30);
                break;
            case 2:
                Taxi TaxEnemy = new Taxi();
                addObject(TaxEnemy, 340, -30);
                break;
            case 3:
                WhiteCar WhiteCarEnemy = new WhiteCar();
                addObject(WhiteCarEnemy, 180, -30);
                break;
            case 4:
                WhiteSedan WhiteSedanEnemy = new WhiteSedan();
                addObject(WhiteSedanEnemy, 340, -30);
                break;
            default:
                break;
        }
    }
    
    private void spawnRandomlyItem(){
        if (Greenfoot.getRandomNumber(300) < 1)
        {
            bullet_Symbol b1 = new bullet_Symbol();
            int randomX = Greenfoot.getRandomNumber(480) + 150;
            addObject(b1, randomX, -30);
            

        }
        
        if (Greenfoot.getRandomNumber(300) < 1)
        {
            shield_Symbol s1 = new shield_Symbol();
            int randomX = Greenfoot.getRandomNumber(480) + 150;
            addObject(s1, randomX, -30);
        }
    }
    
    private void spawnLocation(){
        int x = Greenfoot.getRandomNumber(700);
        int y = Greenfoot.getRandomNumber(500);
    }
    
    private void prepare()
    {
        addObject(backround,400,400);
        addObject(backround2,400,-400);
        
        LightBorder lightBorder = new LightBorder();
        addObject(lightBorder,400,-400);
        
        Car1 car = new Car1();
        addObject(car,400,600);
        
        Polizei police = new Polizei();
        addObject(police,400,850);
        
        HeartFull heart = new HeartFull();
        addObject(heart, 150, 75);
        
        WantedLevel wantedLevel = new WantedLevel();
        addObject(wantedLevel, 825, 70);
    }
}

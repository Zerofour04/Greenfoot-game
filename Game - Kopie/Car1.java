import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Car1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car1 extends Actor
{
    /**
     * Act - do whatever the Car1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int range = 1600;
    public static int XChase = 0;
    public static int damage = 0;

    int fireDelay;
    
    public void act() 
    {
        getXCoords();
        move();
        test();
        shoot();
        damage();
    }
    public int getXCoords()
    {
        return getX();
    }
    
    public void move()
    {
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-10); 
            setRotation(270);
        }
 
        if(Greenfoot.isKeyDown("A")){
             setLocation(getX()-10, getY()); 
             setRotation(248);
        }
    
        if(Greenfoot.isKeyDown("D")){
             setLocation(getX()+10, getY());
             setRotation(298);
        }

        if(Greenfoot.isKeyDown("S")){
             setLocation(getX(), getY()+10);
             setRotation(270);
        }
        
        if (getX() < 320){
            setLocation(320, getY());
        }
        
                if (getX() > 480){
            setLocation(480, getY());
        }
    }
    
    public void test() {
        if (!getObjectsInRange(range, Polizei.class).isEmpty()) {
            // Erkennt das Polizeiauto
            Actor policeCoords = getObjectsInRange(range, Polizei.class).get(0);
            turnTowards(policeCoords.getX(), policeCoords.getY()); // Dreht das Auto zum Polizeiauto hin
        }
    }
    
    public void shoot()
    {
        if(Greenfoot.isKeyDown("space") && Bullet.numOfBullets <= 0 && fireDelay <= 0){
             
            Bullet.numOfBullets ++;
            getWorld().addObject(new Bullet(),getX(), getY()-70);
            fireDelay = 30;

    }
     --fireDelay;
}
        public void Gameover() {
        getWorld().showText("Gameover", 400, 400);
        Greenfoot.stop();
    }
    
    public void damage() {
        
        if (damage >= 3) {
            Gameover();
            damage = damage -3;
        }
        
        if (isTouching(Ambulance.class) || isTouching(Taxi.class)) 
        {
            damage++;
            setLocation(getX(), getY()+100);
        }
    
                if (isTouching(Polizei.class)) 
        {
            damage++;
            setLocation(getX(), getY()-100);
        }
        
    }
    


    

    

}

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
    public static int speedCar = 180;
    int speedCarDelay = 5;
    int speedCarDelayBack = 125;
    public static int Kills = 0;
     private boolean contacted = false;

    int fireDelay;
    
    public void act() 
    {
        getXCoords();
        move();
        test();
        shoot();
        damage();
        GameWin();
        getWorld().showText("" + speedCar, 80, 100);
        neutralAcc();
    }
    public int getXCoords()
    {
        return getX();
    }
    
    public void resetParameter()
    {
        speedCar = 180;
    }
    
    public void move()
    {
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-10); 
            setRotation(270);
            speedAcc();
            
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
        
        if (getX() < 150){
            setLocation(150, getY());
        }
        
                if (getX() >630){
            setLocation(630, getY());
        }
    }
    
    public void speedAcc(){
        if (speedCar < 210) {
            if (speedCar == speedCarDelay) {
                speedCar = 0;
            } else {
                speedCar++;
            }
        }
    
    }
    
        public void neutralAcc(){
    if (!Greenfoot.isKeyDown("W")) {
        speedCarDelay++;
        if (speedCar > 180) {
            speedCar--;
            speedCarDelay = 0;
        }
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
    
    
    public void GameWin(){
        getWorld().showText("Kills: " + Kills, 100, 400);
        if (Kills == 3){
            getWorld().showText("WiN", 400, 400);
            Greenfoot.stop();
            Kills = 0;
        }
    }
    
    public void damage() {
        
        if (damage >= 4) {
            Gameover();
            damage = damage -4;
        }
        
        if (isTouching(Ambulance.class) || isTouching(RedCar.class) || isTouching(Taxi.class) || isTouching(WhiteCar.class) || isTouching(WhiteSedan.class)) 
        if (!contacted)
        {
            {
            damage++;
            contacted = true;
            }  
        }
        else {
            contacted = false;
        }

    
        if (isTouching(Polizei.class)) 
        {
            damage++;
            setLocation(getX(), getY()-100);
        }
        
    }
    

}

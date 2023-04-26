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
    public static int damage = 0;
    public static int speedCar = 180;
    int speedCarDelay = 5;
    int speedCarDelayBack = 125;
    public static int Kills = 0;
    public int fireDelay;
    
    public void act() 
    {
        getXCoords();
        getYCoords();
        move();
        chase();
        shoot();
        damage();
        GameTask();
        GameWin();
        getWorld().showText("" + speedCar, 80, 100);
        neutralAcc();
    }
    
    public int getXCoords()
    {
        return getX();
    }
    
        public int getYCoords()
    {
        return getY();
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
    public void chase() {
        if (!getObjectsInRange(range, Polizei.class).isEmpty()) {
            Actor policeCoords = getObjectsInRange(range, Polizei.class).get(0);
            turnTowards(policeCoords.getX(), policeCoords.getY());
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
        Greenfoot.stop();  
        BustedScreen busted = new BustedScreen();
        getWorld().addObject(busted,400,400);
    }
    
    public void GameWin(){
        if (Kills == 9){
            PassedScreen passed = new PassedScreen();
            getWorld().addObject(passed,400,400);
            Greenfoot.stop();
        }
    }
    
    
    public void GameTask(){
        getWorld().showText("Flüchte von der Polizei und kill 9 Fahrzeuge.", 520, 30);
        getWorld().showText("Kills: " + Kills, 70, 200);
        if (Kills == 3){
            WantedLevel.wantedLevel = 2;
  
        }
        if (Kills == 6){
            WantedLevel.wantedLevel = 3;
        
        }
    }
    
    public void damage() {
        if (damage >= 4) {
            Gameover();
            damage = damage -4;
        }
        
        if (isTouching(Ambulance.class) || isTouching(RedCar.class) || isTouching(WhiteCar.class) || 
            isTouching(WhiteSedan.class) || isTouching(Taxi.class)){
            Gameover();
        }

        if (isTouching(Polizei.class)) 
        {
            damage++;
            setLocation(getX(), getY()-100);
        }
    }
}

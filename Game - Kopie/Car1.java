import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public int damage = 0;
    public int life = 3;
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
    
        public void test(){
        if ( ! getObjectsInRange( range, Polizei.class ).isEmpty() ) //Erkennung des Autos 
    {
    Actor UwU = getObjectsInRange( range, Polizei.class ).get( 0 ); // Defenition des Actors wenn er in die Range kommt
    turnTowards( UwU.getX(), UwU.getY()); //Drehrichtung zum Verfolger
    
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
    
    
    public void damage()
{
    if (isTouching(Polizei.class) || isTouching(Ambulance.class) || isTouching(Taxi.class))
    {
        Gameover();
    }
}

    public void Gameover()
    {
        getWorld().showText("Gameover", 400, 400);
        Greenfoot.stop();
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
/**
 * Write a description of class TopG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopG extends Actor
{
    /**
     * Act - do whatever the TopG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TopG(){
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(204, 113);
    }
    String[] cars = {"broke.png","slave.png","escape.png","bugatti.png"};
    boolean forward = true;
    long last = System.currentTimeMillis();
    
    private void setCar(int car) {
        GreenfootImage img = new GreenfootImage(cars[car]);
        img.scale(204, 113);
        setImage(img);
        
    }
    public void act() 
    {
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Trash.class)){
            // Gameover
            world.gameOver();
        }
        if(Greenfoot.isKeyDown("up")) { 
            setLocation(getX(),125);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(),275);
        }
        
        if (forward){
           move(Math.abs(world.getSpeed())  / 10);
        } else {
            move(world.getSpeed()  / 10);
        }
        if(System.currentTimeMillis() - last > 1000) {
            last = System.currentTimeMillis();
            forward = !forward;
        }
        int score = world.getScore();
        String rank = "";
        if (score < 20){
            setCar(0);
        } else if (score < 40) {
            setCar(1);
        } else if (score < 80) {
            setCar(2);
        } else {
            setCar(3);
        }
    }    
}

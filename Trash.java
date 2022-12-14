import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
/**
 * Write a description of class Trash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trash extends Actor
{
    /**
     * Act - do whatever the Trash wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Trash(){
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(75, 75);
    }
    public void act()
    {
        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        move(world.getSpeed());
        
        
        if(getX() < 1){
            int num = Greenfoot.getRandomNumber(2);
            int y = 275;
            if(num == 0) {
                y = 125;
            }
            setLocation(getX()+600,y);
            world.increaseScore();
            if(world.getScore() % 10 == 0){
                world.setSpeed(world.getSpeed()-1);
            }
        }
    }
}

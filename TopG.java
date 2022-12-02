import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public void act() 
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
        
        if(Greenfoot.isKeyDown("left")) {
            turn(-6);
        }
        if(Greenfoot.isKeyDown("right")) {
            turn(6);
        }
        move(6);
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author leekycauldron
 * @version 
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        move(3);
    }    
}

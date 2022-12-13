import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line extends Actor
{
    /**
     * Act - do whatever the Line wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Line(){
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(100, 25);
    }
    public void act() 
    {
        // Add your action code here.
        
        
        move(((MyWorld)getWorld()).getSpeed());
        if(getX() < 1) {
            setLocation(getX()+600,getY());
        }
    }    
}

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
    boolean forward = true;
    long last = System.currentTimeMillis();
    public void act() 
    {
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(409, 227);
        if(Greenfoot.isKeyDown("up")) { 
            setLocation(getX(),getY()-10);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(),getY()+10);
        }
        
        if (forward){
           move(1);
        } else {
            move(-1);
        }
        if(System.currentTimeMillis() - last > 1000) {
            last = System.currentTimeMillis();
            forward = !forward;
        }
    }    
}

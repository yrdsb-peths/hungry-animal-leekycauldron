import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    Label titleLabel = new Label("Press space to begin",69);
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage bg = new GreenfootImage("logo.png");
        bg.scale(600, 400);
        super.setBackground(bg);
        addObject(titleLabel,getWidth()/2,getHeight()-(getHeight()/4));
        GreenfootSound music = new GreenfootSound("winter.mp3");
        music.playLoop();
    }

    boolean showing = true;
    long last = System.currentTimeMillis();
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
           
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(showing && System.currentTimeMillis() - last > 250){
            removeObject(titleLabel);
            showing = false;
            last = System.currentTimeMillis(); 
        } else if(!showing && System.currentTimeMillis() - last > 250){
            last = System.currentTimeMillis();
            showing = true;
            addObject(titleLabel,getWidth()/2,getHeight()-(getHeight()/4));
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}

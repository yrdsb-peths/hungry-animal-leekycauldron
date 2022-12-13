import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("GAME OVER",69);
        GreenfootImage bg = new GreenfootImage("logo.png");
        bg.scale(600, 400);
        super.setBackground(bg);
        addObject(titleLabel,getWidth()/2,getHeight()-(getHeight()/4));
    }
}

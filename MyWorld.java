import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        
        GreenfootImage bg = new GreenfootImage("dubai.jpg");
        super.setBackground(bg);
        TopG topG = new TopG();
        addObject(topG,300,300);
        
        
        for(int i = 0; i < 50;i++){
            Food apple = new Food();
            addObject(apple,300,300);
        }
        //GreenfootSound music = new GreenfootSound("theme.mp3");
        //music.playLoop();
    }
}

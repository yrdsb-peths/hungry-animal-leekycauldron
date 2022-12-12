
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
        super(1000, 1000, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        

        for(int i = 0; i < 4;i++){
            for(int j = 0; j < 3;j++){
                Line line = new Line();
                addObject(line,Greenfoot.getRandomNumber(100-50+1)+j*250,250+i*250);
            }
        }
        TopG topG = new TopG();
        addObject(topG,150,300);
        //GreenfootSound music = new GreenfootSound("theme.mp3");
        //music.playLoop();

   
    }
    
    
}

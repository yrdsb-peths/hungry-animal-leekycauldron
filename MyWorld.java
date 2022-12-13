
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
    
    private int speed = -11;
    
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void addTrash() {
        Trash trash = new Trash();
        addObject(trash,getWidth(),Greenfoot.getRandomNumber(getHeight()-1));
    }
    
    public void gameOver() {
        GameOver gameOver = new GameOver();
        Greenfoot.setWorld(gameOver);
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        

        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 5;j++){
                Line line = new Line();
                addObject(line,j*150,50+i*150);
            }
        }
        
        
        
        TopG topG = new TopG();
        addObject(topG,50,getHeight()/2);
        addTrash();
        //GreenfootSound music = new GreenfootSound("theme.mp3");
        //music.playLoop();

   
    }
    
    
}

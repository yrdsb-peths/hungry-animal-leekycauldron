
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
    
    private int speed = -8;
    private int score = 0;
    private Label scoreLabel = new Label(score,69);
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void addTrash(int num) {
        Trash trash = new Trash();
        int y = 275;
        if(num == 0) {
            y = 125;
        }
        addObject(trash,getWidth(),y);
    }
    
    public void gameOver() {
        GameOver gameOver = new GameOver(this.score);
        Greenfoot.setWorld(gameOver);
    }
    
    public void increaseScore(){
        this.score++;
        scoreLabel.setValue(score);
    }
    
    public void increaseScore(int score) {
        this.score += score;
        scoreLabel.setValue(score);
    }
    
    public int getScore() {
        return this.score;
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        
        
        addObject(scoreLabel,getWidth()/2,getHeight()-(getHeight()/4));
        
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 5;j++){
                Line line = new Line();
                addObject(line,j*150,50+i*150);
            }
        }
        
        
        
        TopG topG = new TopG();
        addObject(topG,50,125);
        addTrash(Greenfoot.getRandomNumber(2));
        

   
    }
    
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    int score = 0;
    Label playLabel = new Label("Press space to play again.",33);
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("GAME OVER. Score: " + score,69);
        
        titleLabel.setFillColor(Color.RED);
        GreenfootImage bg = new GreenfootImage("logo.png");
        bg.scale(600, 400);
        super.setBackground(bg);
        addObject(titleLabel,getWidth()/2,getHeight()-(getHeight()/4));
        addObject(playLabel,getWidth()/2,getHeight()-(getHeight()/6));
    }
    
    boolean showing = true;
    long last = System.currentTimeMillis();
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
           
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(showing && System.currentTimeMillis() - last > 250){
            removeObject(playLabel);
            showing = false;
            last = System.currentTimeMillis(); 
        } else if(!showing && System.currentTimeMillis() - last > 250){
            last = System.currentTimeMillis();
            showing = true;
            addObject(playLabel,getWidth()/2,getHeight()-(getHeight()/6));
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Food(){
        GreenfootImage image = getImage();
        image.scale(200, 100);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        
        if(isTouching(TopG.class)) {
            String songs[] = {"breathe-air.mp3","shut-up-bitch.mp3"
                ,"am-i-laughing.mp3"};
            //play song
            Greenfoot.playSound(songs[Greenfoot.getRandomNumber(songs.length)]);
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }    
}

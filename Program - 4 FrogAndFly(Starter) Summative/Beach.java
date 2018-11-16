import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    //variable for the scoreboard
    private Scoreboard score;
    
     /*
     * This is kind of like an act method but for Beach.
     * It adds a Fly object at a random position somewhere in the world,
     * adds 10 Food objects to the world,
     * adds a Frog object at the center of the world,
     * and sets the score to equal what the scoreboard at the top of the screen is
     * 
     * @param There are no parameters
     * @return There is no return type
     */
    public Beach()
    {    
       super(800, 600, 1); 
       
       addFood(10);

       addObject( new Fly(),Greenfoot.getRandomNumber(getWidth() ) ,Greenfoot.getRandomNumber(getWidth() ) );
       
       addFrog();
       
       score = new Scoreboard();
       addObject( score, 75, 25);
       
    }
    
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    
    
    /**
     * Adds a frog in the center of the screen
     */
    public void addFrog(){
        addObject( new Frog(), getWidth() /2 , getHeight() /2 );
        
    }
    
    /*
     * Updates the score
     * 
     * @param There are no parameters
     * @return There is no return type
     */
    public void update()
    {
        score.addToScore();
    }
}

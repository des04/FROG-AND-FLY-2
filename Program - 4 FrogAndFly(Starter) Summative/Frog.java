import greenfoot.*;

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    /**
     * sets the frogs speed to a random number in between 0 and 4
     */
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(4) ;
    }
    
    /**
     * Makes it so the frog turns 35 percent of the time. Half
     * of the time it is turning it turns left, the other
     * half it turns right.
     */
    private void sometimesTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 35 )
        {
            if (Greenfoot.getRandomNumber(100) < 50 )
            {
                turn(15);
            }
            else
            {
                turn(-15);
            }
        }
    }
    
    /**
     * If the frog is at the edge of the world turn seven degrees
     * to the right.
     */
    private void edgeTurn()
    {
       if (atEdgeOfWorld() == true)
        {
            turn(7);
        } 
    }
    
    public void act() 
    {
        move(speed+4);
        sometimesTurn();
        edgeTurn();
        
        //if the frog is touching a fly
        if(isTouching(Fly.class))
        {
            //remove the fly from the game
            removeTouching(Fly.class);
            //then stop the game
            Greenfoot.stop();
        }
    }    
}

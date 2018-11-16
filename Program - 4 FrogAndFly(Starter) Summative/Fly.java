//Allows greenfoot images and classes to be loaded in.
import greenfoot.*;


public class Fly extends Creature
{
    //variable that will keep track of what direction the fly is facing
    int flyDirection;
    
    //variable that will keep track of how much food has been eaten
    int eatenFood = 10;
    /*
     * This method is used once when the program is first run, it makes
     * the fly face a random direction at the start of the game.
     * 
     * @param There are no parameters
     * @return There is no return type
     */
    
    public Fly()
    {
        setRotation(getRandomNumber(0,360) );
    }
    
    /*
     * This method creates something called getRandomNumber which will help
     * us get random numbers for actor placement later on in the code.
     * @param start, end
     * @return int
     */
    public int getRandomNumber(int start, int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    /*
     * This method lets you use the arrow keys to move (up arrow = forward, 
     * down arrow = backward, left and right arrow keys to turn)
     * @param There are no parameters
     * @return There is no return type
     */
    private void keyTurn()
    {
        if (Greenfoot.isKeyDown("left") )
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right") )
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("up") )
        {
            move(4);
        }
        if (Greenfoot.isKeyDown("down") )
        {
            move(-4);
        }
    }
    
    /*
     * This method has code that makes it so when the fly is over food, it
     * will remove the food from the world, giving the illusion that it ate
     * the food
     * @param There are no parameters
     * @return There is no return type
     */
    private void eatFood()
    {
        if (isTouching(Food.class))
        {
            removeTouching(Food.class);
            eatenFood = eatenFood-1;
            ((Beach)getWorld()).update();
        }
        if (eatenFood == 0)
        {
            ((Beach)getWorld()).addFood(10);
            eatenFood = 10;
        }
    }
    
    /*
     * Everything in act() is what happens in the program (you could say
     * act() runs the program)
     * @param There are no parameters
     * @return There are no return types
     */
    public void act() 
    {
        
        
        keyTurn();
        
        eatFood();
        
        
        
    }
    
}

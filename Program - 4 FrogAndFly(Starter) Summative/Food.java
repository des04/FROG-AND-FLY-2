import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Food extends Actor
{
    
    /*
     * Sets the food types to 5 diferent types (images) of fruit
     * 
     * @param There are no parameters
     * @return There is no return type
     */
    public Food()
    {
        
        int foodType = Greenfoot.getRandomNumber(5);
        if( foodType == 0 ) {
            setImage("apple1.png");
        } else if( foodType == 1 ) {
            setImage("bananas.png");
        } else if( foodType == 2 ) {
            setImage("cherries.png");
        } else if( foodType == 3 ) {
            setImage("grapes.png");
        } else {
            setImage("strawberry.png");
        }
    }   
}

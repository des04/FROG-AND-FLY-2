import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    //variable that keeps track of the number of food you have eaten
    private int points;
    
    //uploads a font (that is private so only for the scoreboard) in Comic Sans Ms in a font size of 24
    private Font myFont = new Font("Comic Sans MS", true, false, 24);

    /*
     * Creates a scoreboard in the top left corner of the screen
     * 
     * @param There are no parameters
     * @return There is no return type
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /*
     * A method that adds to the score every time the fly eats a fruit. It 
     * also stops the program and displays "You win" if the fly eats twenty
     * fruits
     * 
     * @param There are no parameters
     * @return There is no return type
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 20 ) {
            img.drawString("Score: " + points, 5,25); 
        } else {
            img.drawString("You win!!!", 5,25);
            Greenfoot.stop();
        }        
    }    
}
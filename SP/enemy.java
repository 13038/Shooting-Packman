import greenfoot.*;

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        // Add your action code here.
=======
       Actor actor = getOneObjectAtOffset( 0, 0, Player.class );
            if( actor != null ){
                move(0);
            }       

>>>>>>> 24cd2c480e544b5dbb79ccb5085dff61c5be058d
    }    
}

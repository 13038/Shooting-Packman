import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(1);
            checkObstacle();
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(180);
            move(1);
            checkObstacle();
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
        checkObstacle();
    }
        // Add your action code here.
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(4);
            checkObstacle();
        }
        // Add your action code here.
    }
    public void checkObstacle()
{
    Actor wall = getOneIntersectingObject(Wall.class);
    if(wall!=null)
    {
        move(-1);
    }
}
}


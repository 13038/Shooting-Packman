import greenfoot.*;

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(1);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(180);
            move(1);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
    }
        // Add your action code here.
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(4);
        }
    }    
}

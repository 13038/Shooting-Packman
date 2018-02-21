import greenfoot.*;

/**
 * Write a description of class enemy_TAMA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_TAMA extends Actor
{
    public enemy_TAMA()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
        enemy enemy = new enemy();
        int key = enemy.flag_key;
        
        int x = getX();
        int y = getY();
        /*left*/
        if(key == 0){
            setLocation( x-50,y );
        }
        /*right*/
        if(key == 1){
            setLocation( x+50,y );
        }
        /*up*/
        if(key == 2){
            setLocation( x,y+50 );
        }
        /*down*/
        if(key == 3){
            setLocation( x,y-50 );
        }
        
        Actor wall = getOneIntersectingObject(Wall.class);
        if(wall!=null){
            getWorld().removeObject( this );
        }
    }    
}

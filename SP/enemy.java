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
    private int flag = 0;
    private int i = 2;
    private int j = 0;
    public void act() 
    {
        Actor wall = getOneIntersectingObject(Wall.class);
        int x = getX();
        int y = getY();
        int rand = Greenfoot.getRandomNumber(360);
        Actor actor = getOneObjectAtOffset( 0, 0, Player.class );
           if( actor != null ){
                move(0);
            }  

           move(400);
            setLocation(x+i,y+j);
        
            checkObstacle1();  
            
        
                
        // Add your action code here.
    }
    public void checkObstacle1()
{
    Actor wall = getOneIntersectingObject(Wall.class);
    if(wall!=null)
    {
        int x = getX();
        int y = getY();
        int rand = Greenfoot.getRandomNumber(360);
        setLocation(x-i,y-j);
         if(rand >= 0 && rand < 90)
        {
            i = -2;
            j = 0;
        } 
        if(rand >= 90 && rand < 180)
        {
            i = 2;
            j = 0;
        } 
        else if(rand >= 180 && rand < 270)
        {
            i = 0;
            j = 2;
        } 
        else if(rand >= 270 && rand < 360)
        {
            i = 0;
            j = -2;
        } 
        
        

    }
} 
}   


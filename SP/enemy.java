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
            move(1);
            checkObstacle();  
        // Add your action code here.
<<<<<<< HEAD
    }
    public void checkObstacle()
{
    Actor wall = getOneIntersectingObject(Wall.class);
    if(wall!=null)
    {
        move(-1);
        int rand = Greenfoot.getRandomNumber(360);
        if(0 <= rand && rand<90){
            setRotation(0);
        }
        else if(90<=rand && rand<180){
            setRotation(90);
        }
        else if(180<=rand && rand<270){
            setRotation(180);
        }
        else if(270<=rand && rand<=360){
            setRotation(270);
        }
        
    }
}// Add your action code here.
}    

=======
           Actor actor = getOneObjectAtOffset( 0, 0, Player.class );
           if( actor != null ){
                move(0);
            }       
    }    
}
>>>>>>> 7f85bc2ff254700c6482d1ff64672dd95c9da1e5

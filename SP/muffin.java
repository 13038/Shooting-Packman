import greenfoot.*;

/**
 * Write a description of class muffin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class muffin extends Actor
{
    private int x,y,i;
    public muffin()
        {
            GreenfootImage myImage= getImage();
            int myNewHeight = (int)myImage.getHeight()/2;
            int myNewWidth = (int)myImage.getWidth()/2;
            myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
         i=0;
         while( i<10){
            i++;
            int xmin = 50;
            int xmax = 550;
             x = xmin + (int)(Math.random()*((xmax-xmin)+1));
            int ymin = 50;
            int ymax = 350;
             y = ymin + (int)(Math.random()*((ymax-ymin)+1));
            
            getWorld().addObject( new muffin(), x, y );
            checkObstacle();
        }
    }
    public void checkObstacle()
   {
    
     Actor wall = getOneIntersectingObject(Wall.class);
        if(wall!=null){
            getWorld().removeObject(this );
            i--;
        }
    }
}

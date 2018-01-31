import greenfoot.*;

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
        public Wall()
        {
            GreenfootImage myImage= getImage();
            int myNewHeight = (int)myImage.getHeight()/6;
            int myNewWidth = (int)myImage.getWidth()/6;
            myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
    }
}

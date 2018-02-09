import greenfoot.*;

/**
 * Write a description of class ClearWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClearWorld extends World
{
    private int item;
    /**
     * Constructor for objects of class ClearWorld.
     * 
     */
    public ClearWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new Player(), 200, 200 );
        addObject( new muffin(), 300, 200 );
    }
}

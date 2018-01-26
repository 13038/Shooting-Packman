import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int item;
    
    public Player()
    {
        item = 0;
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        get();//アイテム獲得カウンタ
    } 
    public void get()
    {
         Actor actor = getOneObjectAtOffset( 0, 0, muffin.class );
            if( actor != null ){
                getWorld().removeObject( actor );
                ++item;
                }
                getWorld().showText( "item="+item, 100, 50 );
    }    
}

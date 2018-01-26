import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
<<<<<<< HEAD
    private int item;
    
    public Player()
    {
        item = 0;
    }
    
=======
>>>>>>> 24cd2c480e544b5dbb79ccb5085dff61c5be058d
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
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
=======
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-1,y );
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+1,y );
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-1 );
        }
        if( Greenfoot.isKeyDown( "down") ){
           setLocation( x,y+1 );
        }
        
        Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
            if( actor != null ){
                move(0);
                //ゲームオーバー画面出力
                Greenfoot.stop();
            }       

>>>>>>> 24cd2c480e544b5dbb79ccb5085dff61c5be058d
    }    
}

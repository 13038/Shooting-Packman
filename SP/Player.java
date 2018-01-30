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
    private int flag_tama = 0;
    public static int flag_key;
    public void act() 
    {

        // Add your action code here.
        get();//アイテム獲得カウンタ
    } 
    public void get()
    {
         Actor actor1 = getOneObjectAtOffset( 0, 0, muffin.class );
            if( actor1 != null ){
                getWorld().removeObject( actor1 );
                ++item;
                }
                getWorld().showText( "item="+item, 100, 50 );
>>>>>>> db6933d853bddd969166d8fd5a5c91f205bca3f3
        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-1,y );
           flag_key = 0;
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+1,y );
           flag_key = 1;
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-1 );
           flag_key = 2;
        }
        if( Greenfoot.isKeyDown( "down") ){
           setLocation( x,y+1 );
           flag_key = 3;
        }
        
        /*弾発射*/
        if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "space" ) ){
            if( flag_tama == 0 ){
                getWorld().addObject( new TAMA(), getX(), getY() );
                flag_tama = 10;
            }
        }
        
        /*当たり判定*/
        Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
            if( actor != null ){
                move(0);
                //ゲームオーバー画面出力
                Greenfoot.stop();
            }       
    }    
>>>>>>> 7f85bc2ff254700c6482d1ff64672dd95c9da1e5
}
}


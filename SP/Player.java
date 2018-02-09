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

        int x = getX();
        int y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( x-1,y );
           checkObstacle1();
           flag_key = 0;
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( x+1,y );
           checkObstacle2();
           flag_key = 1;
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( x,y-1 );
           checkObstacle3();
           flag_key = 2;
        }
        if( Greenfoot.isKeyDown( "down") ){
           setLocation( x,y+1 );
           checkObstacle4();
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
        
        get();//アイテム獲得カウンタ
        
        /*当たり判定*/
        //敵キャラに当たった場合のゲームオーバー画面
        Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
        if( actor != null ){
            move(0);
            getWorld().showText("Game Over・・・", 300, 100);
            Greenfoot.stop();
        }
        
        //敵の弾に当たった場合のゲームオーバー画面ベース
        /*
        Actor actor2 = getOneObjectAtOffset( 0, 0, TAMA.class );
        if( actor2 != null ){
            move(0);
            getWorld().showText("Game Over・・・", 300, 100);
            Greenfoot.stop();
        }
        */
    } 
    public void get()
    {
        Actor actor1 = getOneObjectAtOffset( 0, 0, muffin.class );
        if( actor1 != null ){
            getWorld().removeObject( actor1 );
            ++item;
        }
        getWorld().showText( "item="+item, 100, 50 );
    }
     public void checkObstacle1()
   {
        int x = getX();
        int y = getY();
     Actor wall = getOneIntersectingObject(Wall.class);
        if(wall!=null){
            setLocation( x+1,y );
        }
    }
      public void checkObstacle2()
   {
        int x = getX();
        int y = getY();
     Actor wall = getOneIntersectingObject(Wall.class);
        if(wall!=null){
            setLocation( x-1,y );
        }
    }
      public void checkObstacle3()
   {
        int x = getX();
        int y = getY();
     Actor wall = getOneIntersectingObject(Wall.class);
        if(wall!=null){
            setLocation( x,y+1 );
        }
    }
      public void checkObstacle4()
   {
        int x = getX();
        int y = getY();
     Actor wall = getOneIntersectingObject(Wall.class);
        if(wall!=null){
            setLocation( x,y-1 );
        }
    }
}



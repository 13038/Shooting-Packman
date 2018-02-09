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
        GreenfootImage myImage= getImage();
        int myNewHeight = (int)myImage.getHeight()/27;
        int myNewWidth = (int)myImage.getWidth()/27;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int flag_tama = 0;
    public static int flag_key;
    public int player_x;
    public int player_y;
    public void act() 
    {
        player_x = getX();
        player_y = getY();
        if( Greenfoot.isKeyDown( "left" ) ){
           setLocation( player_x-1,player_y );
           checkObstacle1();
           flag_key = 0;
        }
        if( Greenfoot.isKeyDown( "right" ) ){
           setLocation( player_x+1,player_y );
           checkObstacle2();
           flag_key = 1;
        }
        if( Greenfoot.isKeyDown( "up" ) ){
           setLocation( player_x,player_y-1 );
           checkObstacle3();
           flag_key = 2;
        }
        if( Greenfoot.isKeyDown( "down") ){
           setLocation( player_x,player_y+1 );
           checkObstacle4();
           flag_key = 3;
        }
        
        /*弾発射*/
        if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "space" ) ){
            if( flag_tama == 0 ){
                getWorld().addObject( new TAMA(), getX(), getY() );
                flag_tama = 50;
            }
        }
        
        get();//アイテム獲得カウンタ
        
        /*当たり判定*/
        Actor actor = getOneObjectAtOffset( 0, 0, enemy.class );
        if( actor != null ){
            move(0);
            //ゲームオーバー画面出力
            Greenfoot.stop();
        }       
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



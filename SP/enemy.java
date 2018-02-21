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
    private int flag_tama = 0;
    public static int flag_key = 0;
    private int i = 1;
    private int j = 0;
    public int x;
    public int y;
    public void act() 
    {
        Actor wall = getOneIntersectingObject(Wall.class);
        x = getX();
        y = getY();
        int rand = Greenfoot.getRandomNumber(360);
        Actor actor = getOneObjectAtOffset( 0, 0, Player.class );
           if( actor != null ){
                move(0);
            }  

           move(400);
            setLocation(x+i,y+j);
            
            checkPlayer();
        
            checkObstacle1();  
            
        Actor tama = getOneIntersectingObject(TAMA.class);
        if(tama!=null){
            getWorld().removeObject( this );
        }
                
        // Add your action code here.
    }
    public void checkPlayer(){
        if( flag_tama > 0 ) flag_tama--;
        if( flag_tama == 0 ){
            /*left*/
            if(flag_key == 0){
                if(Player.player_x < x && y-10 < Player.player_y && Player.player_y < y+10 ){
                    getWorld().addObject( new enemy_TAMA(), getX(), getY() );
                    flag_tama = 50;
                }
            }
            /*right*/
            if(flag_key == 1){
                if(Player.player_x > x && y-10 < Player.player_y && Player.player_y < y+10 ){
                    getWorld().addObject( new enemy_TAMA(), getX(), getY() );
                    flag_tama = 50;
                }
            }
            /*down*/
            if(flag_key == 2){
                if(Player.player_y > y && x-20 < Player.player_x && Player.player_x < x+20 ){
                    getWorld().addObject( new enemy_TAMA(), getX(), getY() );
                    flag_tama = 50;
                }
            }
            /*up*/
            if(flag_key == 3){
                if(Player.player_y < y && x-20 < Player.player_x && Player.player_x < x+20){
                    getWorld().addObject( new enemy_TAMA(), getX(), getY() );
                    flag_tama = 50;
                }
            }
        }
        
                
                
        }
    public void checkObstacle1(){
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
            flag_key = 0;
        } 
        if(rand >= 90 && rand < 180)
        {
            i = 2;
            j = 0;
            flag_key = 1;
        } 
        else if(rand >= 180 && rand < 270)
        {
            i = 0;
            j = 2;
	    flag_key = 2;
        } 
        else if(rand >= 270 && rand < 360)
        {
            i = 0;
            j = -2;
            flag_key = 3;
        } 
        
        

    }
} 
}   


import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int rtime;
    private int x,y;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620, 420, 1);
        rtime = 6000;

        
        

        for(int i=0;i<10;++i){
            int xmin = 50;
            int xmax = 550;
            int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
            int ymin = 50;
            int ymax = 350;
            int y = ymin + (int)(Math.random()*((ymax-ymin)+1));
            
            addObject( new muffin(), x, y );
        }

        addObject( new Wall(), 0, 0 );
        addObject( new Wall(), 620, 0 );
        addObject( new Wall(), 620, 400 );
        addObject( new Wall(), 0, 400 );
        
        int i=0;
        while(i<620){
            i=i+40;
            addObject( new Wall(), i, 0 );
        }
        i=0;


        while(i<620){
            i=i+40;
            addObject( new Wall(), i, 420 );
        }
        i=0;
        while(i<420){
            i=i+40;
            addObject( new Wall(), 0, i );
        }
        i=0;
        while(i<420){
            i=i+40;
            addObject( new Wall(), 620, i );
        }
        i=40;
        while(i<100){
            i=i+38;
            addObject( new Wall(), 80, i );
        }
        i=154;
        while(i<307){
            i=i+38;
            if(i!=230){
            addObject( new Wall(), 80, i );
        }
        }
         addObject( new Player(), 346, 230);
         addObject( new enemy(), 42, 40);
         addObject( new enemy(), 574, 40);
         addObject( new enemy(), 42, 382);
         addObject( new enemy(), 574, 382);
         addObject( new Wall(), 42, 192);
         addObject( new Wall(), 118, 78 );
         addObject( new Wall(), 118, 116 );
         addObject( new Wall(), 156, 78 );
         addObject( new Wall(), 156, 116);
         addObject( new Wall(), 156, 154);
         addObject( new Wall(), 156, 192);
         addObject( new Wall(), 156, 230);
         addObject( new Wall(), 156, 268);
         addObject( new Wall(), 156, 306);
         addObject( new Wall(), 156, 344);
         addObject( new Wall(), 156, 78 );
         addObject( new Wall(), 194, 268);
         addObject( new Wall(), 194, 344);
         addObject( new Wall(), 232, 78);
         addObject( new Wall(), 232, 116);
         addObject( new Wall(), 232, 154);
         addObject( new Wall(), 232, 192);
         addObject( new Wall(), 232, 268);
         addObject( new Wall(), 232, 344);
         addObject( new Wall(), 270, 192);
         addObject( new Wall(), 270, 268);
         addObject( new Wall(), 308, 40);
         addObject( new Wall(), 308, 78);
         addObject( new Wall(), 308, 116);
         addObject( new Wall(), 308, 192);
         addObject( new Wall(), 308, 344);
         addObject( new Wall(), 308, 382);
         addObject( new Wall(), 346, 268);
         addObject( new Wall(), 346, 306);
         addObject( new Wall(), 346, 344);
         addObject( new Wall(), 346, 382);
         addObject( new Wall(), 384, 78);
         addObject( new Wall(), 384, 116);
         addObject( new Wall(), 384, 154);
         addObject( new Wall(), 384, 344);
         addObject( new Wall(), 384, 382);
         addObject( new Wall(), 422, 78);
         addObject( new Wall(), 422, 268);
         addObject( new Wall(), 460, 78);
         addObject( new Wall(), 460, 154);
         addObject( new Wall(), 460, 192);
         addObject( new Wall(), 460, 230);
         addObject( new Wall(), 460, 268);
         addObject( new Wall(), 460, 344);
         addObject( new Wall(), 498, 78);
         addObject( new Wall(), 498, 344);
         addObject( new Wall(), 536, 78);
         addObject( new Wall(), 536, 116);
         addObject( new Wall(), 536, 192);
         addObject( new Wall(), 536, 268);
         addObject( new Wall(), 536, 344);
         addObject( new Wall(), 572, 192);
    }
    public void act()
    {
        rtime--;
        showText( "残り時間 = " + (rtime/60) + "秒", 500, 50 );
        //if( rtime == 0 )
        //{
           // showText( "Time Over", 100, 100 );
            //Greenfoot.stop();
        //}
        //ゲームクリアの画面
       if( rtime == 0 ){
           showText("Game Clear!", 300, 100);
           Greenfoot.stop();
    }
    }
        
}
 

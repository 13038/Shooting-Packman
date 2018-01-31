import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int item = 0;
    private int rtime;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        rtime = 6000;
        for(int i=0;i<7;++i){
            int xmin = 0;
            int xmax = 600;
            int x = xmin + (int)(Math.random()*((xmax-xmin)+1));
            int ymin = 0;
            int ymax = 400;
            int y = ymin + (int)(Math.random()*((ymax-ymin)+1));

            addObject( new muffin(), x, y );
        }
        
        addObject( new Wall(), 0, 0 );
        addObject( new Wall(), 600, 0 );
        addObject( new Wall(), 600, 400 );
        addObject( new Wall(), 0, 400 );
        
        int i=0;
        while(i<600){
            i=i+40;
            addObject( new Wall(), i, 0 );
        }
        i=0;


        while(i<600){
            i=i+40;
            addObject( new Wall(), i, 400 );
        }
        i=0;
        while(i<400){
            i=i+40;
            addObject( new Wall(), 0, i );
        }
        i=0;
        while(i<400){
            i=i+40;
            addObject( new Wall(), 600, i );
        }
        

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
    }
    
}

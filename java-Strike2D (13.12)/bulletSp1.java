import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class bulletSp1 extends bullet
{
    int range = 2000;
    int timer = 1;
    public void act() 
    {
        fly();
        folgeSp2();
        collision();
    }  
    public void collision()
    {
        if ((isTouching(box.class)) || (isTouching(Huen.class)) || (isAtEdge()))
        {
            getWorld().removeObject(this);
        }
    } 
    public void folgeSp2()
    {
        if ( ! getObjectsInRange( range, Spieler2.class ).isEmpty() && (timer > 0))
        {
            Actor pj = getObjectsInRange( range, Spieler2.class ).get( 0 );
            turnTowards( pj.getX(), pj.getY() );
            timer--;
        }
    }
    
}
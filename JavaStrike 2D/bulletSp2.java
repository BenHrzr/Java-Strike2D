import greenfoot.*;  
public class bulletSp2 extends bullet
{
    private Spieler1 pSp1;
    int range = 2000;
    int timer = 1;
    public void act() 
    {
        fly();
        folgeSp2();
        collision();
    }
    public void folgeSp2()
    {
        if ( ! getObjectsInRange( range, Spieler1.class ).isEmpty() && (timer > 0))
        {
            Actor pj = getObjectsInRange( range, Spieler1.class ).get( 0 );
            turnTowards( pj.getX(), pj.getY() );
            timer--;
        }
    }
        public void collision()
    {
        if (isTouching(box.class) || isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
import greenfoot.*;

public class Bombe extends Actor
{
    private int sprengzeitTimer = 6000;
    private boolean sprengzeit = false;
    private MyWorld mw;
    private int gtTim = 3000;
    
    public void act()
    {
        if (gibSpz() == true) 
        {
            if (sprengzeitTimer > 0)
            {
                sprengzeitTimer--;
            }
            else
            {
                sprengzeitTimerEnde(); 
            }
        }
        Zünden();
        Timer();
        Entschärfen();
    }
    public int gibSpzt()
    {
      return sprengzeitTimer;
    }
    public boolean gibSpz()
    {
       return sprengzeit;
    }
    public void sprengzeitTimerEnde()
    {
        Greenfoot.stop(); 
    }
    public void Zünden()
    {
        if(isTouching(Spieler1.class))
        {
            sprengzeit = true;
        }
    }
    public void Entschärfen()
    {
         if(sprengzeit == true)
        {
            if(isTouching(Spieler2.class))
            {
                Greenfoot.playSound("habibi.mp3");
                Greenfoot.stop();
            }
        }
    }
    public void Timer()
    {
        mw = (MyWorld)this.getWorld();
        if(gibSpz() == true)
        {
            mw.showText("Verbeibende Zeit: " + gibSpzt(), 130, 40);
        }
    }
}

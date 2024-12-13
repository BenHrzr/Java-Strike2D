import greenfoot.*;

public class Bombe extends Actor
{
    private int sprengzeitTimer = 3000;
    private boolean sprengzeit = false;
    private MyWorld mw;
    private int gTim = 3000;
    private boolean Sound = false;
    
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
        Z�nden();
        Timer();
        Entsch�rfen();
        stTim();
    }
    public void stTim()
    {
        if(sprengzeitTimer == 3000)
        {
            mw = (MyWorld)this.getWorld();
            gTim--;
            mw.showText("Verbeibende Zeit: " + gibgTim(), 130, 40);
        }
        if(sprengzeit == true && Sound == false)
        {
            Greenfoot.playSound("bomb.mp3");
            Sound = true;
        }
    }
    public int gibgTim()
    {
        return gTim;
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
        Greenfoot.playSound("tw.mp3");
        Greenfoot.stop();
    }
    public void Z�nden()
    {
        if(isTouching(Spieler1.class))
        {
            sprengzeit = true;
        }
    }
    public void Entsch�rfen()
    {
         if(sprengzeit == true || gTim == 0)
        {
            if(isTouching(Spieler2.class))
            {
                Greenfoot.playSound("ctw.mp3");
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
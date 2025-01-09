import greenfoot.*;
public class Bombe extends Actor
{
    private int sprengzeitTimer = 3000;
    private boolean sprengzeit = false;
    private MyWorld mw;
    private int gTim = 3000;
    private boolean Sound = false;
    private int dTim = 100;    
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
        stTim();
    }
    public void stTim()
    {
         if(gTim==0)
        {
            mw = (MyWorld)this.getWorld();
            end1 pEnd = new end1();
            mw.addObject(pEnd, 600, 450);
            Greenfoot.playSound("ctw.mp3");
            Greenfoot.stop();
        }
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
        mw = (MyWorld)this.getWorld();
        end1 pEnd = new end1();
        mw.addObject(pEnd, 600, 450);
        Greenfoot.playSound("tw.mp3");
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
                dTim--;
            }
            if(dTim == 0)
            {
                mw = (MyWorld)this.getWorld();
                end1 pEnd = new end1();
                mw.addObject(pEnd, 600, 450);
                Greenfoot.playSound("ctw.mp3");
                Greenfoot.stop();
            }
            if(!isTouching(Spieler2.class))
            {
                dTim = 100;
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
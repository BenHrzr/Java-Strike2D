import greenfoot.*;  
public class Spieler1 extends Actor
{
    private int HP1 = 3;
    private int Iframes = 5;
    private boolean Treffer = false;
    private MyWorld mw;
    private boolean endscreen =false;
    public void act() 
    {
        tot1();
        bewegung();
        LeAn1();
        schaden1();
        unbesiegbar1();
    }
    public void bewegung()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);
            if (isTouching(box.class) || (isTouching(glas.class)))
            {
                 setLocation(getX(), getY() + 3);
            }
            if (isTouching(Huen.class))
            {
                setLocation(getX(), getY() + 3);
            }
            setImage("Spieler1oben.png");
        }
        else if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
            if (isTouching(box.class) || (isTouching(glas.class)))
            {
                setLocation(getX(), getY() - 3);
            }
            if (isTouching(Huen.class))
            {
                setLocation(getX(), getY() - 3);
            }
            setImage("Spieler1unten.png");
        }
        else if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 3, getY());
            if (isTouching(box.class) || (isTouching(glas.class)))
            {
                setLocation(getX() + 3, getY());
            }
            if (isTouching(Huen.class))
            {
                setLocation(getX() + 3, getY());
            }
            setImage("Spieler1links.png");
        }
        else if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3, getY()); 
            if (isTouching(box.class) || (isTouching(glas.class)))
            {
                setLocation(getX() - 3, getY());
            }
            if (isTouching(Huen.class))
            {
                setLocation(getX() - 3, getY());
            }
            setImage("Spieler1rchts.png");
        }
    }
    public void schaden1()
    {
        if(isTouching(bulletSp2.class) && Treffer == false)
        {
            HP1--;
            Greenfoot.playSound("hit.mp3");
        }
        Treffer = true;
    }
    public void unbesiegbar1()
    {
        if(Iframes > 0 && Treffer == true)
        {
            Iframes--;
        }
        else
        {
            Iframes = 5;
            Treffer = false;
        }
    }
    public void tot1()
    {
        if(HP1 == 0)
        {
            mw = (MyWorld)this.getWorld();
            end1 pEnd = new end1();
            mw.addObject(pEnd, 600, 450);
            Greenfoot.playSound("ctw.mp3");
            Greenfoot.stop();
        }
    }
    public int gibHP1()
    {
        return HP1;
    }
    public void LeAn1()
    {
        mw = (MyWorld)this.getWorld();
        mw.showText("Spieler 1: " + gibHP1(), 1000, 40);
    }
    public boolean gibEnd()
    {
        return endscreen;
    }
}

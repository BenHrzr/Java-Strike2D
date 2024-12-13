import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)
class Spieler2 extends Actor
{
    private int HP2 = 3;
    private int Iframes = 5;
    private boolean Treffer;
    private MyWorld mw;
    public void act()
    {
        tot2();
        Schaden2();
        unbesiegbar2();
        LeAn2();
        bewegung();
    }
    public void bewegung()
    {
        if(Greenfoot.isKeyDown("up"))
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
        }
        else if (Greenfoot.isKeyDown("down"))
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
        }
        else if (Greenfoot.isKeyDown("left"))
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
        }
        else if (Greenfoot.isKeyDown("right"))
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
        }
    }
    public void Schaden2()
    {
        if(isTouching(bulletSp1.class) && Treffer == false)
        {
            HP2--;
        }
        Treffer = true;
    }
    public void unbesiegbar2()
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
    public void tot2()
    {
        if(HP2 == 0)
        {
            mw = (MyWorld)this.getWorld();
            end1 pEnd = new end1();
            mw.addObject(pEnd, 600, 450);
            Greenfoot.playSound("ctw.mp3");
            Greenfoot.stop();
        }
    }
    public int gibHP2()
    {
        return HP2;
    }
    public void LeAn2()
    {
        mw = (MyWorld)this.getWorld();
        mw.showText("Spieler 2: " + gibHP2(), 500, 40);
    }
}

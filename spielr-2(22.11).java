import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)
class Spieler2 extends Actor
{
    private Spieler1 spieler1;
    private MyWorld MW;
    private int HP2 = 3;

    public void act() 
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
            if (isTouching(box.class))
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
            if (isTouching(box.class))
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
            if (isTouching(box.class))
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
            if (isTouching(box.class))
            {
                setLocation(getX() - 3, getY());
            }
            if (isTouching(Huen.class))
            {
                setLocation(getX() - 3, getY());
            }
        }
        tot();
    }    
    public int gibHP2()
    {
        return HP2;
    }
    public void setHP2()
    {
        HP2 = HP2 -1; 
    }
    public void tot()
    {
        if(HP2 == 0)
        {
            Greenfoot.stop();
        }
    }
}

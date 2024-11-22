import greenfoot.*;  

public class Spieler1 extends Actor
{
    private int HP1 = 3;
    public void act() 
    {
        bewegung();
    }
    public int gibHP1()
    {
        return HP1;
    }
    public void setHP1()
    {
        HP1 --;
    }
    public void bewegung()
    {
        if (Greenfoot.isKeyDown("w"))
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
        else if (Greenfoot.isKeyDown("s"))
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
        else if (Greenfoot.isKeyDown("a"))
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
        else if (Greenfoot.isKeyDown("d"))
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
    }
}

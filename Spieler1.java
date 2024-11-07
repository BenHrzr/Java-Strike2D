import greenfoot.*;  

public class Spieler1 extends Actor
{
    private boolean sprengzeit = false;

    public void act() 
    {
        bewegung();
        Zünden();
    }
    
    public void bewegung()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);  
        }
        else if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);  
        }
        else if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 3, getY());  
        }
        else if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3, getY());  
        }
    }

    public void Zünden()
    {
        if(isTouching(Bombe.class))
        {
            sprengzeit = true;
        }
    }

    public boolean gibSpz()
    {
        return sprengzeit;
    }
}

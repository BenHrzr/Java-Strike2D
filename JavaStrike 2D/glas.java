import greenfoot.*;  
public class glas extends Actor
{
    public void act() 
    {
        if(isTouching(bullet.class))
        {
            getWorld().removeObject(this);
        } 
    }    
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)


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
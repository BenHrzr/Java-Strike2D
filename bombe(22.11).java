import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class bullet extends Actor
{
    public void act() 
    {
        fly();
    } 
    public void fly()
    {
        move(5);
    }
    public void glasentfernen()
    {
        if(isTouching(glas.class))
        {
            
        }
    }
}

import greenfoot.*;  

public class MyWorld extends World
{
    private int sprengzeitTimer = 6000; 
    private Spieler1 spieler1; 

    public MyWorld()
    {    
        super(900, 900, 1); 
        
        // Map
        box pBox = new box();
        addObject(pBox, 630, 450);  
        box pBox2 = new box();
        addObject(pBox2, 630, 512);
        box pBox3 = new box();
        addObject(pBox3, 630, 574);
        box pBox4 = new box();
        addObject(pBox4, 630, 633);
        box pBox5 = new box();
        addObject(pBox5, 450, 512);
        
        // Bombe
        Bombe pBom = new Bombe();
        addObject(pBom, 450, 450);
        
        // Spieler 1
        spieler1 = new Spieler1();
        addObject(spieler1, 450, 10);
        
        // Spieler 2
        Spieler2 pSpiel2 = new Spieler2();
        addObject(pSpiel2, 450, 880);
    }

    public void act()
    {
        if (spieler1.gibSpz()) 
        {
            if (sprengzeitTimer > 0)
            {
                sprengzeitTimer--; 
                showText("Verbleibende Zeit: " + sprengzeitTimer, 100, 40);
            }
            else
            {
                sprengzeitTimerEnde(); 
            }
        }
    }

    public void sprengzeitTimerEnde()
    {
        Greenfoot.stop(); 
    }
}

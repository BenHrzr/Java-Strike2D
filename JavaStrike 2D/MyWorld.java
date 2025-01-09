import greenfoot.*;  
public class MyWorld extends World
{
    private Spieler1 pSp1;
    private Spieler2 pSp2;
    private bulletSp1 pBul1;
    private bulletSp2 pBul2;
    private end1 pEnd;
    int cooldown = 0;
    int cooldown2 = 0;
    private boolean hmu = false;
    public MyWorld()
    {    
        super(1200, 900, 1); 
        
        
        // Map
         
        box pBox2 = new box();
        addObject(pBox2, 630, 512);
        box pBox3 = new box();
        addObject(pBox3, 630, 574);
        box pBox4 = new box();
        addObject(pBox4, 630, 633);
        box pBox5 = new box();
        addObject(pBox5, 450, 512);
        box pBox6 = new box();
        addObject(pBox6, 512, 512);
        box pBox7 = new box();
        addObject(pBox7, 568, 512);
        box pBox99 = new box();
        addObject(pBox99, 330, 510);
        box pBox98 = new box();
        addObject(pBox98, 270, 510);
        box pBox100 = new box();
        addObject(pBox100, 330, 450 );
        box pBox101 = new box();
        addObject(pBox101, 270, 450);
         
        box pBox9 = new box();
        addObject(pBox9, 450, 650); 
        box pBox10 = new box();
        addObject(pBox10, 390, 650); 
        box pBox11 = new box();
        addObject(pBox11, 330, 650); 
        box pBox12 = new box();
        addObject(pBox12, 270, 650); 
        box pBox13 = new box();
        addObject(pBox13, 130, 630); 
        box pBox14 = new box();
        addObject(pBox14, 130, 690); 
        box pBox15 = new box();
        addObject(pBox15, 130, 570); 
        box pBox16 = new box();
        addObject(pBox16, 130, 510); 
        box pBox17 = new box();
        addObject(pBox17, 130, 450); 
        box pBox18 = new box();
        addObject(pBox18, 130, 390); 
        box pBox19 = new box();
        addObject(pBox19, 766, 390);
        box pBox20 = new box();
        addObject(pBox20, 766, 330);
        box pBox21 = new box();
        addObject(pBox21, 766, 450);
        
        box pBox24 = new box();
        addObject(pBox24, 390, 512);
        box pBox25 = new box();
        addObject(pBox25, 766, 630);
        box pBox26 = new box();
        addObject(pBox26, 766, 690);
        box pBox27 = new box();
        addObject(pBox27, 275, 300);
        box pBox28 = new box();
        addObject(pBox28 , 335, 300);
        box pBox29 = new box();
        addObject(pBox29 , 395, 300);
        box pBox30 = new box();
        addObject(pBox30 , 455, 300);
        box pBox31 = new box();
        addObject(pBox31 , 515, 300);
        box pBox32 = new box();
        addObject(pBox32 , 575, 300);
        box pBox33 = new box();
        addObject(pBox33 , 980, 690);
        box pBox34 = new box();
        addObject(pBox34 , 980, 630);
        box pBox35 = new box();
        addObject(pBox35 , 980, 570);
        box pBox36 = new box();
        addObject(pBox36 , 980, 510);
        box pBox37 = new box();
        addObject(pBox37 , 980, 450);
        box pBox38 = new box();
        addObject(pBox38 , 980, 390);
        box pBox39 = new box();
        addObject(pBox39 , 980, 330);
        box pBox40 = new box();
        addObject(pBox40 , 920, 510);
        box pBox41 = new box();
        addObject(pBox41 , 828, 650);
        glas pGlas = new glas();
        addObject(pGlas , 828, 380);
        glas pGlas3 = new glas();
        addObject(pGlas3 , 211, 300);
        glas pGlas4 = new glas();
        addObject(pGlas4 , 150, 327);
        glas pGlas5 = new glas();
        addObject(pGlas5 , 200, 650);
        glas pGlas6 = new glas();
        addObject(pGlas6 , 700, 672);
        Huen pHuen5 = new Huen();
        addObject(pHuen5, 1100, 450);
        Huen pHuen6 = new Huen();
        addObject(pHuen6, 1040, 450);
        Huen pHuen7 = new Huen();
        addObject(pHuen7, 1160, 450);
        box pBox42 = new box();
        addObject(pBox42 , 200, 168);
        box pBox43 = new box();
        addObject(pBox43 , 260, 168);
        box pBox44 = new box();
        addObject(pBox44 , 140, 168);
        box pBox45 = new box();
        addObject(pBox45, 80, 168);
        box pBox46 = new box();
        addObject(pBox46 , 320, 168);
        box pBox47 = new box();
        addObject(pBox47 , 500, 168);
        box pBox48 = new box();
        addObject(pBox48 , 560, 168);
        box pBox49 = new box();
        addObject(pBox49 , 380, 168);
        box pBox50 = new box();
        addObject(pBox50 , 440, 168);
        Huen pHuen8 = new Huen();
        addObject(pHuen8, 639, 300);
        Huen pHuen9 = new Huen();
        addObject(pHuen9, 700, 300);
        Huen pHuen10 = new Huen();
        addObject(pHuen10, 639, 360);
        Huen pHuen11 = new Huen();
        addObject(pHuen11, 700, 360);
        
        // Bombe
        Bombe pBom = new Bombe();
        addObject(pBom, 450, 450);
        
        
        
        // Spieler 1
        pSp1 = new Spieler1();
        addObject(pSp1, 450, 10);
        
        // Spieler 2
        pSp2 = new Spieler2();
        addObject(pSp2, 450, 880);
        
        // Musik
        Greenfoot.playSound("Hintergrund.mp3");
        
        // Endscreen

        
        }
    public void act()
    {
        shoot1();
        shoot2();
        cooldownReset();
        cooldownReset2();
        
    }
    public void shoot1()
    {
        if(Greenfoot.isKeyDown("f") && (cooldown == 0))
        {
            pBul1 = new bulletSp1();
            addObject(pBul1, pSp1.getX(), pSp1.getY());
            cooldown = 50;
            Greenfoot.playSound("schuss.mp3");
        }
    }
    public void shoot2()
    {
        if(Greenfoot.isKeyDown("#") && (cooldown2 == 0))
        {
            pBul2 = new bulletSp2();
            addObject(pBul2, pSp2.getX(), pSp2.getY());
            cooldown2 = 50;
            Greenfoot.playSound("schuss.mp3");
        }
    }
    public void cooldownReset()
    {
        if (cooldown > 0)
        {
            cooldown--;
        }
    }
    public void cooldownReset2()
    {
        if (cooldown2 > 0)
        {
            cooldown2--;
        }
    }
}

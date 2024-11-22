import greenfoot.*;  

public class MyWorld extends World
{
    private Spieler1 pSp1;
    private Spieler2 pSp2;
    public MyWorld()
    {    
        super(1200, 900, 1); 
        
        
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
        box pBox6 = new box();
        addObject(pBox6, 512, 512);
        box pBox7 = new box();
        addObject(pBox7, 568, 512);
        Huen pHuen = new Huen();
        addObject(pHuen, 330, 510);
        Huen pHuen2 = new Huen();
        addObject(pHuen2, 270, 510);
        Huen pHuen3 = new Huen();
        addObject(pHuen3, 330, 450 );
        Huen pHuen4 = new Huen();
        addObject(pHuen4, 270, 450);
        box pBox8 = new box();
        addObject(pBox8, 510, 650); 
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
        box pBox22 = new box();
        addObject(pBox22, 766, 510);
        box pBox23 = new box();
        addObject(pBox23, 766, 570);
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
        addObject(pGlas , 600, 400);
        
        
        
        // Bombe
        Bombe pBom = new Bombe();
        addObject(pBom, 450, 450);
        
        
        
        // Spieler 1
        pSp1 = new Spieler1();
        addObject(pSp1, 450, 10);
        
        // Spieler 2
        pSp2 = new Spieler2();
        addObject(pSp2, 450, 880);
        
        // Bullet
    }
    public void act()
    {
        shoot1();
        shoot2();
    }
    public void shoot1()
    {
        if(Greenfoot.isKeyDown("e"))
        {
            bullet pBul1 = new bulletSp1();
            addObject(pBul1, pSp1.getX(), pSp1.getY());
            Greenfoot.playSound("schuss.mp3");
        }
    }
    public void shoot2()
    {
        if(Greenfoot.isKeyDown("0"))
        {
            bullet pBul2 = new bulletSp2();
            addObject(pBul2, pSp2.getX(), pSp2.getY());
            Greenfoot.playSound("schuss.mp3");
            
        }
    }
}

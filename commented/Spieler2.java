// Spieler2.java
// Klasse für Spieler 2 im Spiel
// Diese Klasse enthält Logik für Bewegung, Schadensberechnung und Unbesiegbarkeit.

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

class Spieler2 extends Actor
{
    private int HP2 = 3; // Lebenspunkte von Spieler 2
    private int Iframes = 5; // Zeit der Unbesiegbarkeit nach einem Treffer
    private boolean Treffer; // Status, ob Spieler 2 getroffen wurde
    private MyWorld mw; // Referenz auf die Spielwelt

    /**
     * Die act-Methode wird in jeder Spielrunde ausgeführt.
     * Beinhaltet Logik für Bewegung, Schadensberechnung und Anzeige.
     */
    public void act()
    {
        tot2(); // Überprüft, ob Spieler 2 tot ist
        Schaden2(); // Berechnet den erlittenen Schaden
        unbesiegbar2(); // Handhabt die Unbesiegbarkeitsphase
        LeAn2(); // Aktualisiert die Anzeige der Lebenspunkte
        bewegung(); // Handhabt die Bewegung des Spielers
    }

    /**
     * Methode zur Bewegung des Spielers basierend auf Tasteneingaben.
     * Verhindert Bewegung durch Hindernisse wie Boxen oder Glas.
     */
    public void bewegung()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
            if (isTouching(box.class) || isTouching(glas.class) || isTouching(Huen.class))
            {
                 setLocation(getX(), getY() + 3);
            }
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
            if (isTouching(box.class) || isTouching(glas.class) || isTouching(Huen.class))
            {
                setLocation(getX(), getY() - 3);
            }
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY());
            if (isTouching(box.class) || isTouching(glas.class) || isTouching(Huen.class))
            {
                setLocation(getX() + 3, getY());
            }
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY()); 
            if (isTouching(box.class) || isTouching(glas.class) || isTouching(Huen.class))
            {
                setLocation(getX() - 3, getY());
            }
        }
    }

    /**
     * Methode zur Schadensberechnung.
     * Reduziert die Lebenspunkte, wenn der Spieler von einem gegnerischen Projektil getroffen wird.
     */
    public void Schaden2()
    {
        if (isTouching(bulletSp1.class) && !Treffer)
        {
            HP2--;
            Treffer = true;
        }
    }

    /**
     * Methode für die Unbesiegbarkeitsphase nach einem Treffer.
     * Verhindert sofortige weitere Treffer.
     */
    public void unbesiegbar2()
    {
        if (Iframes > 0 && Treffer)
        {
            Iframes--;
        }
        else
        {
            Iframes = 5;
            Treffer = false;
        }
    }

    /**
     * Methode, die prüft, ob der Spieler tot ist.
     * Fügt das Endobjekt hinzu und stoppt das Spiel, wenn die Lebenspunkte auf 0 fallen.
     */
    public void tot2()
    {
        if (HP2 == 0)
        {
            mw = (MyWorld)this.getWorld();
            end1 pEnd = new end1();
            mw.addObject(pEnd, 600, 450);
            Greenfoot.playSound("ctw.mp3");
            Greenfoot.stop();
        }
    }

    /**
     * Methode zur Aktualisierung der Lebensanzeige.
     */
    public void LeAn2()
    {
        mw = (MyWorld)this.getWorld();
        mw.showText("Spieler 2: " + gibHP2(), 500, 40);
    }

    /**
     * Gibt die aktuellen Lebenspunkte von Spieler 2 zurück.
     * @return Lebenspunkte
     */
    public int gibHP2()
    {
        return HP2;
    }
}

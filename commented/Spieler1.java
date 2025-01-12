// Spieler1.java
// Klasse für Spieler 1 im Spiel
// Diese Klasse enthält Logik für Bewegung, Schadensberechnung und Unbesiegbarkeit.

import greenfoot.*;  

public class Spieler1 extends Actor
{
    private int HP1 = 3; // Lebenspunkte von Spieler 1
    private int Iframes = 5; // Zeit der Unbesiegbarkeit nach einem Treffer
    private boolean Treffer = false; // Status, ob Spieler 1 getroffen wurde
    private MyWorld mw; // Referenz auf die Spielwelt
    private boolean endscreen = false; // Status, ob das Spiel beendet ist

    /**
     * Die act-Methode wird in jeder Spielrunde ausgeführt.
     * Beinhaltet Logik für Bewegung, Schadensberechnung und Anzeige.
     */
    public void act() 
    {
        tot1(); // Überprüft, ob Spieler 1 tot ist
        bewegung(); // Handhabt die Bewegung des Spielers
        LeAn1(); // Aktualisiert die Anzeige der Lebenspunkte
        schaden1(); // Berechnet den erlittenen Schaden
        unbesiegbar1(); // Handhabt die Unbesiegbarkeitsphase
    }

    /**
     * Methode zur Bewegung des Spielers basierend auf Tasteneingaben.
     * Verhindert Bewegung durch Hindernisse wie Boxen oder Glas.
     */
    public void bewegung()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3);
            if (isTouching(box.class) || isTouching(glas.class) || isTouching(Huen.class))
            {
                 setLocation(getX(), getY() + 3);
            }
        }
        else if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
            if (isTouching(box.class) || isTouching(glas.class) || isTouching(Huen.class))
            {
                setLocation(getX(), getY() - 3);
            }
        }
        else if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 3, getY());
            if (isTouching(box.class) || isTouching(glas.class) || isTouching(Huen.class))
            {
                setLocation(getX() + 3, getY());
            }
        }
        else if (Greenfoot.isKeyDown("d"))
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
    public void schaden1()
    {
        if (isTouching(bulletSp2.class) && !Treffer)
        {
            HP1--;
            Treffer = true;
        }
    }

    /**
     * Methode für die Unbesiegbarkeitsphase nach einem Treffer.
     * Verhindert sofortige weitere Treffer.
     */
    public void unbesiegbar1()
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
    public void tot1()
    {
        if (HP1 == 0)
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
    public void LeAn1()
    {
        mw = (MyWorld)this.getWorld();
        mw.showText("Spieler 1: " + gibHP1(), 300, 40);
    }

    /**
     * Gibt die aktuellen Lebenspunkte von Spieler 1 zurück.
     * @return Lebenspunkte
     */
    public int gibHP1()
    {
        return HP1;
    }

    /**
     * Gibt den Status des Endbildschirms zurück.
     * @return true, wenn das Spiel beendet ist
     */
    public boolean gibEnd()
    {
        return endscreen;
    }
}

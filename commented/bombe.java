// Bombe.java
// Klasse zur Simulation einer Bombe in einem Spiel
// Diese Klasse enthält die Logik für das Zünden, Entschärfen und den Timer der Bombe.

import greenfoot.*;

public class Bombe extends Actor
{
    private int sprengzeitTimer = 3000; // Timer bis zur Explosion
    private boolean sprengzeit = false; // Status, ob die Bombe aktiv ist
    private MyWorld mw;
    private int gTim = 3000; // Zeit für die Anzeige
    private boolean Sound = false; // Status, ob der Sound bereits abgespielt wurde

    public void act()
    {
        if (gibSpz()) // Prüft, ob die Bombe gezündet wurde
        {
            if (sprengzeitTimer > 0)
            {
                sprengzeitTimer--; // Countdown der Sprengzeit
            }
            else
            {
                sprengzeitTimerEnde(); // Explosion, wenn der Timer abläuft
            }
        }
        Zünden(); // Logik für das Zünden der Bombe
        Timer(); // Anzeige der verbleibenden Zeit
        Entschärfen(); // Logik für die Entschärfung
        stTim(); // Anzeige und Sound-Logik
    }

    public void stTim()
    {
        if (sprengzeitTimer == 3000) // Initialer Zustand
        {
            mw = (MyWorld)this.getWorld();
            gTim--;
            mw.showText("Verbeibende Zeit: " + gibgTim(), 130, 40);
        }
        if (sprengzeit && !Sound) // Explosionston abspielen
        {
            Greenfoot.playSound("bomb.mp3");
            Sound = true;
        }
    }

    public int gibgTim()
    {
        return gTim;
    }

    public int gibSpzt()
    {
      return sprengzeitTimer;
    }

    public boolean gibSpz()
    {
       return sprengzeit;
    }

    public void sprengzeitTimerEnde()
    {
        Greenfoot.playSound("tw.mp3"); // Ton für Explosion
        Greenfoot.stop(); // Spiel stoppen
    }

    public void Zünden()
    {
        if (isTouching(Spieler1.class)) // Aktivierung durch Spieler1
        {
            sprengzeit = true;
        }
    }

    public void Entschärfen()
    {
         if (sprengzeit || gTim == 0) // Entschärfung, wenn aktiv oder Zeit abgelaufen
        {
            if (isTouching(Spieler2.class)) // Spieler2 entschärft die Bombe
            {
                Greenfoot.playSound("ctw.mp3");
                Greenfoot.stop();
            }
        }
    }

    public void Timer()
    {
        mw = (MyWorld)this.getWorld();
        if (gibSpz()) // Zeitanzeige bei aktivierter Bombe
        {
            mw.showText("Verbeibende Zeit: " + gibSpzt(), 130, 40);
        }
    }
}

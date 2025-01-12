// bulletSp1.java
// Spezialisierte Klasse für ein Projektil von Spieler 1
// Fügt Zielverfolgung und Kollisionslogik hinzu.

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class bulletSp1 extends bullet
{
    int range = 2000; // Reichweite für die Zielverfolgung
    int timer = 1; // Timer für die Zielerfassung

    /**
     * Die act-Methode wird in jeder Spielrunde ausgeführt.
     * Beinhaltet Bewegung, Zielverfolgung und Kollisionsüberprüfung.
     */
    public void act() 
    {
        fly(); // Bewegt das Projektil vorwärts
        folgeSp2(); // Verfolgt Spieler 2, falls in Reichweite
        collision(); // Prüft auf Kollisionen mit Hindernissen oder Rändern
    }  

    /**
     * Methode zur Behandlung von Kollisionen.
     * Entfernt das Projektil, wenn es ein Hindernis, einen Spieler oder den Rand trifft.
     */
    public void collision()
    {
        if ((isTouching(box.class)) || (isTouching(Huen.class)) || (isAtEdge()))
        {
            getWorld().removeObject(this);
        }
    } 

    /**
     * Methode zur Zielverfolgung.
     * Verfolgt Spieler 2, wenn dieser in Reichweite ist und der Timer größer als 0 ist.
     */
    public void folgeSp2()
    {
        if (!getObjectsInRange(range, Spieler2.class).isEmpty() && (timer > 0))
        {
            Actor pj = getObjectsInRange(range, Spieler2.class).get(0);
            turnTowards(pj.getX(), pj.getY()); // Dreht das Projektil in Richtung Ziel
            timer--; // Verhindert wiederholte Zielerfassung
        }
    }
}

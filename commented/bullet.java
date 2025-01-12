// bullet.java
// Basisklasse für Projektile im Spiel
// Diese Klasse definiert die grundlegende Bewegung eines Projektils.

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

public class bullet extends Actor
{
    /**
     * Die act-Methode wird in jeder Spielrunde ausgeführt.
     * Ruft die Methode fly auf, um das Projektil vorwärts zu bewegen.
     */
    public void act() 
    {
        fly();        
    } 

    /**
     * Methode, um das Projektil vorwärts zu bewegen.
     * Standardgeschwindigkeit ist 15.
     */
    public void fly()
    {
        move(15);
    }
}

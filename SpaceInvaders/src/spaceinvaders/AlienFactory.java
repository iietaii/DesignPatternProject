/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spaceinvaders;

public class AlienFactory {

    private Alien prototype;

    public AlienFactory(Alien prototype) {
        this.prototype = prototype;
    }

    public Alien createAlien(int x, int y) {
        Alien clone = prototype.clone();
        clone.setX(x);
        clone.setY(y);
        return clone;
    }
}
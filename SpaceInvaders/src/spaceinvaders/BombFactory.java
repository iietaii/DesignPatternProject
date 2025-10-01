/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spaceinvaders;

public class BombFactory {

    private Bomb prototype;

    public BombFactory(Bomb prototype) {
        this.prototype = prototype;
    }

    public Bomb createBomb(int x, int y) {
        Bomb clone = prototype.clone();
        clone.setX(x);
        clone.setY(y);
        clone.setDestroyed(true);
        return clone;
    }
}
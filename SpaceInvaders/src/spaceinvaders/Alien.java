package spaceinvaders;

import javax.swing.ImageIcon;

public class Alien extends Sprite implements Cloneable {

    private Bomb bomb;
    private final String alien = "/img/alien.png";

    public Alien(int x, int y) {
        this.x = x;
        this.y = y;
        bomb = new Bomb(x, y);
        ImageIcon ii = new ImageIcon(this.getClass().getResource(alien));
        setImage(ii.getImage());
    }

    public void act(int direction) {
        this.x += direction;
    }

    public Bomb getBomb() {
        return bomb;
    }

    @Override
    public Alien clone() {
        try {
            Alien cloned = (Alien) super.clone();
            cloned.bomb = this.bomb.clone(); 
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

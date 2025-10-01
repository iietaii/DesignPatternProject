package spaceinvaders;

import javax.swing.ImageIcon;


public class Bomb extends Sprite implements Cloneable {

    private final String bomb = "/img/bomb.png";
    private boolean destroyed;

    public Bomb(int x, int y) {
        setDestroyed(false);
        this.x = x;
        this.y = y;
        ImageIcon ii = new ImageIcon(this.getClass().getResource(bomb));
        setImage(ii.getImage());
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    @Override
    public Bomb clone() {
        try {
            Bomb cloned = (Bomb) super.clone();
            cloned.setDestroyed(this.destroyed);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
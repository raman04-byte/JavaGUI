import java.awt.Image;

public class Sprites {
    private Animation a;
    private float x;
    private float y;
    private float vx;
    private float vy;

    public Sprites(Animation a) {
        this.a = a;
    }

    public void update(long timepassed) {
        x += vx * timepassed;
        y += vy * timepassed;
        a.update(timepassed);
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getWidth() {
        return a.getImage().getWidth(null);
    }

    public int getHeight() {
        return a.getImage().getHeight(null);
    }

    public float getVelocityX() {
        return vx;
    }

    public float getVelocityY() {
        return vy;
    }

    public void setVelocityX(float vx) {
        this.vx = vx;
    }
    public void setVelocityY(float vy) {
        this.vy = vy;
    }
    public Image getImage(){
        return a.getImage();
    }


}

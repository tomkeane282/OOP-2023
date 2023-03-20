package ie.tudublin;
import processing.core.PVector;
import processing.core.PApplet;

public class Ship {
    private PVector pos;
    PApplet p;
    
    Public Ship(float x, float y, float size, int c)
    {
        pos = new PVector(x, y);
    }

    public PVector getPos() {
        return pos;
    }

    public void setPos(PVector pos) {

    }

    private float rot;
    private int c;
    private float size;
}

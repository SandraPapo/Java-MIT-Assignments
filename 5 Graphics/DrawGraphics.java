import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes.add(new BouncingBox(200, 50, Color.ORANGE));
        boxes.add(new BouncingBox(50, 50, Color.lightGray));
        boxes.add(new BouncingBox(200, 200, Color.YELLOW));
        
        boxes.get(0).setMovementVector(10, -10);
        boxes.get(1).setMovementVector(-20, -5);
        boxes.get(2).setMovementVector(5, -5);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.setColor(Color.BLUE);
        surface.fillOval(135, 100, 30, 30);
        surface.setColor(Color.RED);
        surface.fill3DRect( 130, 170, 40, 40, true);
        surface.setColor(Color.GREEN);
        surface.fillArc(125, 135, 50, 50, 0, 180);
        
        for (BouncingBox box: boxes)
            box.draw(surface);
        
    }
} 

package figury;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Kwadrat extends Figura implements MouseListener {
    public Kwadrat(Graphics2D buf, int del, int w, int h) {
        super(buf, del, w, h);
        shape = new Rectangle2D.Float(0,0,10,10);
        area = new Area(shape);
        aft = new AffineTransform();


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

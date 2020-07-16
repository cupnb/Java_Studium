package de.tefemuc.Uebung11;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class A43b extends JFrame implements MouseInputListener {
    public static void main(String[] args){
        new A43b();
    }

    private int x;
    private int y;
    private Graphics g;

    public A43b(){
        super("LineFrame");
        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseListener(this);
        addMouseMotionListener(this);
        g = getGraphics();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        g.drawLine(x, y, e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        update(g);
        g.drawLine(x, y, e.getX(), e.getY());

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

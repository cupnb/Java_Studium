package de.tefemuc.Uebung11;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class A44b extends JFrame implements MouseMotionListener {
    public static void main(String[] args){
        new A44b();
    }

    private int clicks;
    public A44b(){
        super("PositionFrame");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        setTitle("PositionFrame x: " + e.getX() + " y: " + e.getY());
    }
}

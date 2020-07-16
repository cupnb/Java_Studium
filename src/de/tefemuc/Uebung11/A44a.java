package de.tefemuc.Uebung11;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class A44a extends JFrame implements MouseListener {
    public static void main(String[] args){
        new A44a();
    }

    private int clicks;
    public A44a(){
        super("KlickFrame");
        setSize(500, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        clicks++;
        getGraphics().drawString(Integer.toString(clicks), e.getX(), e.getY());
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

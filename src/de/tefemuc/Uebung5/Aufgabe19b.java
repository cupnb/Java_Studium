package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aufgabe19b extends JFrame {

    public Aufgabe19b(){
        super("Aufgabe19a");
        setSize(500, 500);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new ClosingActionListener(this));

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == 'x'){
                    System.exit(0);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setVisible(true);
    }

}

package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;

public class Aufgabe19a extends JFrame {

    public Aufgabe19a(){
        super("Aufgabe19a");
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton b = new JButton("Change title");
        b.addActionListener(e -> changeTitle());

        this.add(b);

        setVisible(true);
    }

    public void changeTitle(){
        String s = JOptionPane.showInputDialog("New title:");
        if (s == null || s.isEmpty()){
            return;
        }

        setTitle(s);
    }
}

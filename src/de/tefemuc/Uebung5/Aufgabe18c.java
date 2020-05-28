package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;

public class Aufgabe18c extends JFrame {

    JTextArea text;
    JButton left;
    JButton right;

    public Aufgabe18c(){
        super("Aufgabe18c");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        left = new JButton("Left button");
        right = new JButton("Right button");

        text = new JTextArea(5, 20);
        JScrollPane textPanel = new JScrollPane(text);
        textPanel.setPreferredSize((new Dimension(250, 100)));


        right.setActionCommand("right");
        right.addActionListener(new MyActionListener(text));
        left.addActionListener(new MyActionListener(text));

        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(textPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }
}

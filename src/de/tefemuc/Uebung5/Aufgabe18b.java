package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe18b extends JFrame {

    JTextArea text;
    JButton left;
    JButton right;

    public Aufgabe18b() {
        super("Aufgabe18b");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        left = new JButton("Left button");
        right = new JButton("Right button");

        right.addActionListener(e -> text.append("Right button\n"));
        left.addActionListener(e -> text.append("Left button\n"));

        text = new JTextArea(5, 20);
        JScrollPane textPanel = new JScrollPane(text);
        textPanel.setPreferredSize((new Dimension(250, 100)));

        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(textPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }
}

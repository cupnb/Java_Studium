package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe18a extends JFrame implements ActionListener {

    JTextArea text;
    JButton left;
    JButton right;

    public Aufgabe18a(){
        super("Aufgabe18a");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        left = new JButton("Left button");
        right = new JButton("Right button");

        right.setActionCommand("right");
        right.addActionListener(this);
        left.addActionListener(this);

        text = new JTextArea(5, 20);
        JScrollPane textPanel = new JScrollPane(text);
        textPanel.setPreferredSize((new Dimension(250, 100)));

        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(textPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("right")){
            text.append("Right button\n");
            return;
        }
        text.append("Left button\n");
    }
}

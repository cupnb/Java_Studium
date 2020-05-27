package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;

public class Aufgabe17c {

    public static void main(String[] args){

        JFrame frame = new JFrame("Aufgabe17c");

        JTextField textField = new JTextField();
        textField.setColumns(20);
        textField.setEnabled(false);

        JPanel buttonPanel = new JPanel(new GridLayout(0, 3));

        buttonPanel.add(new JButton("9"));
        buttonPanel.add(new JButton("8"));
        buttonPanel.add(new JButton("7"));
        buttonPanel.add(new JButton("6"));
        buttonPanel.add(new JButton("5"));
        buttonPanel.add(new JButton("4"));
        buttonPanel.add(new JButton("3"));
        buttonPanel.add(new JButton("2"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("0"));

        buttonPanel.add(new JButton("."));
        buttonPanel.add(new JButton("="));
        buttonPanel.add(new JButton("+"));
        buttonPanel.add(new JButton("-"));
        buttonPanel.add(new JButton("C"));


        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}


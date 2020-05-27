package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class Aufgabe17a {

    public static void main(String[] args){

        Aufgabe17a a = new Aufgabe17a();
    }

    public Aufgabe17a(){
        JFrame frame = new JFrame("Aufgabe17a");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JPanel textPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        JLabel text = new JLabel("Name:");
        JTextField textField = new JTextField();
        textField.setColumns(20);

        textPanel.setLayout(new FlowLayout());
        textPanel.add(text);
        textPanel.add(textField);
        textPanel.setBackground(Color.gray);

        JButton okButton = new JButton("Ok");
        JButton cancelButton = new JButton("Cancel");

        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        buttonPanel.setBackground(Color.lightGray);


        frame.add(textPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }


}

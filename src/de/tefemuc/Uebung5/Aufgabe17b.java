package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;

public class Aufgabe17b {

    public static void main(String[] args){
        JFrame frame = new JFrame("Aufgabe17b");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Alter:");
        JComboBox<String> menu = new JComboBox<>();

        menu.addItem("none");

        for (int i = 0; i < 111; i++){
            menu.addItem(Integer.toString(i));
        }

        panel.add(label);
        panel.add(menu);

        frame.add(panel);

        frame.pack();
        frame.setVisible(true);


    }
}

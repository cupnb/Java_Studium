package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;

public class Aufgabe17d {

    public static void main(String[] args){

        JFrame frame = new JFrame("Aufgabe17d");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();

        JMenuItem topMenu = new JMenu("A menu");
        JMenuItem subMenu = new JMenu("A submenu");
        JMenuItem menuItem = new JMenuItem("A menuitem");
        JMenuItem checkBox = new JCheckBoxMenuItem("A checkbox menuitem");

        subMenu.add(checkBox);
        subMenu.add(menuItem);
        topMenu.add(subMenu);

        bar.add(topMenu);

        frame.add(bar, BorderLayout.NORTH);
        frame.setVisible(true);

    }
}

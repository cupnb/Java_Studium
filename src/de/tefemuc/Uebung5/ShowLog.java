package de.tefemuc.Uebung5;

import javax.swing.*;
import java.util.ArrayList;

public class ShowLog extends JDialog {

    public ShowLog(Aufgabe20 a, Iterable<String> s){
        super(a, "Log");

        JTextArea textArea = new JTextArea(5, 50);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEnabled(false);

        for (String st : s){
            textArea.append(st + "\n");
        }

        add(scrollPane);

        pack();
        setVisible(true);

    }
}

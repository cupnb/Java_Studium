package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

    JTextArea text;

    public MyActionListener(JTextArea t){
        this.text = t;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("right")){
            text.append("Right button\n");
            return;
        }
        text.append("Left button\n");
    }
}

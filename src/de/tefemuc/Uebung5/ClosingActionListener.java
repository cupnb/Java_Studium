package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.event.*;

public class ClosingActionListener extends WindowAdapter {

    Aufgabe19b aufgabe19b;
    public ClosingActionListener(Aufgabe19b aufgabe19b){
        this.aufgabe19b = aufgabe19b;
    }
    @Override
    public void windowClosing(WindowEvent e){

        JOptionPane.showMessageDialog(null, "Hit x to close");
    }
}

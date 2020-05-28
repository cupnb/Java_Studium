package de.tefemuc.Uebung5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Aufgabe20 extends JFrame {

    Aufgabe20(){
        super("Aufgabe20");
        setSize(200, 200);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        ArrayList<String> log = new ArrayList<>();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                log.add(LocalDateTime.now().toString() + ": Window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                log.add(LocalDateTime.now().toString() + ": Window closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                log.add(LocalDateTime.now().toString() + ": Window closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                super.windowIconified(e);
                log.add(LocalDateTime.now().toString() + ": Window iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                super.windowDeiconified(e);
                log.add(LocalDateTime.now().toString() + ": Window deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);
                log.add(LocalDateTime.now().toString() + ": Window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
                log.add(LocalDateTime.now().toString() + ": Window deactivated");
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
                log.add(LocalDateTime.now().toString() + ": Window state changed");
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {
                super.windowGainedFocus(e);
                log.add(LocalDateTime.now().toString() + ": Window gained focus");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                super.windowLostFocus(e);
                log.add(LocalDateTime.now().toString() + ": Window lost focus");
            }
        });

        JButton close = new JButton("Close application");
        close.addActionListener(e -> {
            System.exit(0);
        });

        JButton showLog = new JButton("Show log");
        showLog.addActionListener(e -> {
            new ShowLog(this, log);
        });

        setLayout(new FlowLayout());

        add(close, FlowLayout.LEFT);
        add(showLog);
        pack();
        setVisible(true);


    }
}

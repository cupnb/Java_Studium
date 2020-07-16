package de.tefemuc.Uebung8.gui;

import de.tefemuc.Uebung8.data.Employee;
import de.tefemuc.Uebung8.data.EmployeeContainer;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LoggingDialog extends JDialog implements PropertyChangeListener {

    private JTextArea log;
    private JScrollPane pane;
    private static LoggingDialog unique = null;
    private LoggingDialog(EmployeeGUI gui){
        super(gui, "Logging Dialog", false);
        setSize(new Dimension(600, 400));


        log = new JTextArea("Beginn des Logs\n");
        log.setColumns(50);
        log.setRows(20);

        pane = new JScrollPane(log);
        add(pane);

        EmployeeContainer container = EmployeeContainer.instance();
        container.addPropertyChangeListener(this);
        for (Employee e : container){
            e.addPropertyChangeListener(this);
        }
        setVisible(true);

    }

    public static LoggingDialog instance(){
        if (unique == null){
            unique = new LoggingDialog(null);
        }
        return unique;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        log.append(evt.getPropertyName() + ": Von " + evt.getOldValue() + " zu: " + evt.getNewValue() + "\n");
        for (Employee e : EmployeeContainer.instance()){
            e.removePropertyChangeListener(this);
            e.addPropertyChangeListener(this);
        }
    }
}

/*
 * 
 * @ListEmployee.java 01 16.06.2019 (lorenzro)
 * 
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */
package de.tefemuc.Uebung8.gui;

import de.tefemuc.Uebung8.data.*;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Vector;

@SuppressWarnings("serial")
public class ListEmployee extends JDialog implements ActionListener, PropertyChangeListener {

    private EmployeeContainer container;
    private JList<Employee> allEmployeesList;

    public ListEmployee(EmployeeGUI f) {
	super(f, "Show All Employees", false);
	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

	this.setLayout(new GridLayout(0, 1));

	JPanel p = new JPanel();
	add(p);
	p.setLayout(new BorderLayout());

	JLabel allEmployeesLabel = new JLabel("All Employees: ");
	p.add(allEmployeesLabel, BorderLayout.NORTH);

	allEmployeesList = new JList<Employee>();
	p.add(allEmployeesList, BorderLayout.CENTER);

	JPanel buttons = new JPanel();
	p.add(buttons, BorderLayout.SOUTH);
	JButton cancel = new JButton("Cancel");
	cancel.addActionListener(this);
	buttons.add(cancel);
	JButton delete = new JButton("Delete Employee");
	delete.addActionListener(this);
	buttons.add(delete);
	JButton change = new JButton("Change Employee");
	change.addActionListener(this);
	buttons.add(change);

	setLocation(f.getLocation().x + 200, f.getLocation().y + 200);

	container = EmployeeContainer.instance();
	container.addPropertyChangeListener(this);
	for (Employee e : container) {
	    e.addPropertyChangeListener(this);
	}
	updateList();

	pack();
	setVisible(true);
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
	updateList();
	if (e.getPropertyName().equals("employee")) {
	    Employee emp = (Employee) e.getNewValue();
	    if (emp != null)
		emp.addPropertyChangeListener(this);
	    else {
		emp = (Employee) e.getOldValue();
		emp.removePropertyChangeListener(this);
	    }
	}
    }

    private void updateList() {
	Vector<Employee> v = new Vector<Employee>();
	for (Employee e : container)
	    v.add(e);
	allEmployeesList.setListData(v);
	pack();
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand().equals("Delete Employee")) {
	    onDelete();
	} else if (e.getActionCommand().equals("Cancel")) {
	    onCancel();
	} else if (e.getActionCommand().equals("Change Employee")) {
	    onChange();
	}
    }

    private void onDelete() {
	Employee subject = allEmployeesList.getSelectedValue();
	if (subject != null) {
	    subject.removePropertyChangeListener(this);
	    container.unlinkEmployee(subject);
	} else {
	    JOptionPane.showMessageDialog(null, "No employee selected", "Error", JOptionPane.ERROR_MESSAGE);
	}
    }

    private void onCancel() {
	dispose();
    }

    private void onChange() {
	Employee subject = allEmployeesList.getSelectedValue();
	if (subject != null) {
	    new ChangeEmployee(this, subject);
	} else {
	    JOptionPane.showMessageDialog(null, "No employee selected", "Error", JOptionPane.ERROR_MESSAGE);
	}
    }
}
/*
 * 
 * @CoiceEmployee.java 01 16.06.2019 (lorenzro)
 * 
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package de.tefemuc.Uebung8.gui;

import de.tefemuc.Uebung8.data.*;

import java.util.Vector;

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

@SuppressWarnings("serial")
public class ChoiceEmployee extends JDialog implements ActionListener {

    private EmployeeContainer container;
    private Employee subject = null;

    private JList<Employee> allEmployeesList;

    public ChoiceEmployee(JDialog f) {

	super(f, "Show All Employees", true);
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
	JButton ok = new JButton("OK");
	ok.addActionListener(this);
	buttons.add(ok);
	JButton cancel = new JButton("Cancel");
	cancel.addActionListener(this);
	buttons.add(cancel);

	setLocation(f.getLocation().x + 200, f.getLocation().y + 200);

	container = EmployeeContainer.instance();
	updateList();

	pack();
	setVisible(true);
    }
    
    private void updateList() {
	Vector<Employee> v = new Vector<Employee>();
	for (Employee e: container)
	    v.add(e);
	allEmployeesList.setListData(v);
	pack();
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand().equals("OK")) {
	    onOk();
	} else if (e.getActionCommand().equals("Cancel")) {
	    onCancel();
	}
    }

    private void onCancel() {
	dispose();
    }

    private void onOk() {
	subject = allEmployeesList.getSelectedValue();
	if (subject != null) {
	    dispose();
	} else {
	    JOptionPane.showMessageDialog(null, "No employee selected", "Error", JOptionPane.ERROR_MESSAGE);
	}
    }

    public Employee getChoice() {
	return subject;
    }
}
/*
 * 
 * @ChangeEmployee.java 01 16.06.2019 (lorenzro)
 * 
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package de.tefemuc.Uebung8.gui;

import de.tefemuc.Uebung8.data.*;

import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@SuppressWarnings("serial")
public class ChangeEmployee extends JDialog implements ActionListener, PropertyChangeListener {

    private Employee subject;
    private EmployeeContainer container;

    private JTextField idTextfield;
    private JTextField nameTextfield;
    private JTextField beginTextfield;
    private JComboBox<Employee> bossChoice;

    public ChangeEmployee(ListEmployee f, Employee subject) {

	super(f, "Change Employee" + subject.getId(), false);
	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	container = EmployeeContainer.instance();
	container.addPropertyChangeListener(this);
	for (Employee e : container) {
	    e.addPropertyChangeListener(this);
	}
	this.subject = subject;

	this.setLayout(new GridLayout(0, 1));

	JPanel oben = new JPanel();
	add(oben);
	oben.setLayout(new BorderLayout());

	JPanel p = new JPanel();
	oben.add(p, BorderLayout.NORTH);
	JLabel idLabel = new JLabel("ID: ");
	idTextfield = new JTextField(5);
	idTextfield.setEnabled(false);
	p.add(idLabel);
	p.add(idTextfield);

	JLabel nameLabel = new JLabel("Name: ");
	nameTextfield = new JTextField(20);
	p.add(nameLabel);
	p.add(nameTextfield);

	JLabel beginLabel = new JLabel("Begin: ");
	beginTextfield = new JTextField(20);
	beginTextfield.setEnabled(false);
	p.add(beginLabel);
	p.add(beginTextfield);

	JLabel bossLabel = new JLabel("Boss: ");
	bossChoice = new JComboBox<Employee>();
	p.add(bossLabel);
	p.add(bossChoice);
	bossChoice.addItem(null);
	for (Employee e : container) {
	    if (!e.equals(subject))
		bossChoice.addItem(e);
	}

	JPanel t = new JPanel();
	oben.add(t, BorderLayout.CENTER);

	JButton ok = new JButton("OK");
	ok.addActionListener(this);
	t.add(ok);
	JButton cancel = new JButton("Cancel");
	cancel.addActionListener(this);
	t.add(cancel);

	setLocation(f.getLocation().x + 200, f.getLocation().y + 200);

	load();
	pack();
	setVisible(true);
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
	if (e.getPropertyName().equals("employee")) {
	    Employee emp = (Employee) e.getNewValue();
	    if (emp != null)
		emp.addPropertyChangeListener(this);
	    else {
		emp = (Employee) e.getOldValue();
		emp.removePropertyChangeListener(this);
		if (emp.equals(subject))
		    dispose();
	    }
	}

	Employee selected = (Employee) bossChoice.getSelectedItem();
	bossChoice.removeAllItems();
	bossChoice.addItem(null);
	for (Employee emp : container) {
	    if (!emp.equals(subject))
		bossChoice.addItem(emp);
	}
	bossChoice.setSelectedItem(selected);
	pack();
    }

    private void save() {
	try {
	    subject.setName(nameTextfield.getText());
	    Employee boss = (Employee) bossChoice.getSelectedItem();
	    if (boss != null)
		subject.linkBoss(boss);
	    else
		subject.unlinkBoss();
	    dispose();
	} catch (IllegalInputException e) {
	    load();
	    JOptionPane.showMessageDialog(null, "Employee could not changed completely:\n" + e.getMessage(), "Error",
		    JOptionPane.ERROR_MESSAGE);
	}
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand().equals("OK")) {
	    onOk();
	} else if (e.getActionCommand().equals("Cancel")) {
	    onCancel();
	}
    }

    private void onOk() {
	save();
    }

    private void onCancel() {
	dispose();
    }

    private void load() {
	if (subject != null) {
	    idTextfield.setText(subject.getId() + "");
	    nameTextfield.setText(subject.getName());
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    beginTextfield.setText(subject.getBeginOfContract().format(dtf));
	    if (subject.getlinkBoss().isEmpty())
		bossChoice.setSelectedItem(null);
	    else
		bossChoice.setSelectedItem(subject.getlinkBoss().get());
	} else {
	    JOptionPane.showMessageDialog(null, "No employee selected", "Error", JOptionPane.ERROR_MESSAGE);
	}
    }
}
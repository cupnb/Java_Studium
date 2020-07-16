/*
 * 
 * @RegisterEmployee.java 01 16.06.2019 (lorenzro)
 * 
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package de.tefemuc.Uebung8.gui;

import de.tefemuc.Uebung8.data.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
public class RegisterEmployee extends JDialog implements ActionListener, PropertyChangeListener {

    private Employee subject;
    private EmployeeContainer container;

    private JTextField idTextfield;
    private JTextField nameTextfield;
    private JTextField beginTextfield;
    private JComboBox<Employee> bossChoice;

    public RegisterEmployee(EmployeeGUI f) {

	super(f, "Register New Employee", false);
	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	container = EmployeeContainer.instance();
	container.addPropertyChangeListener(this);
	for (Employee e : container) {
	    e.addPropertyChangeListener(this);
	}

	this.setLayout(new GridLayout(0, 1));

	JPanel oben = new JPanel();
	add(oben);
	oben.setLayout(new BorderLayout());

	JPanel p = new JPanel();
	oben.add(p, BorderLayout.NORTH);
	JLabel idLabel = new JLabel("ID: ");
	idTextfield = new JTextField(5);
	idTextfield.setEnabled(false);
	idTextfield.setText(EmployeeContainer.getIdCounter() + "");
	p.add(idLabel);
	p.add(idTextfield);

	JLabel nameLabel = new JLabel("Name: ");
	nameTextfield = new JTextField(20);
	p.add(nameLabel);
	p.add(nameTextfield);

	JLabel beginLabel = new JLabel("Begin: ");
	beginTextfield = new JTextField(20);
	p.add(beginLabel);
	p.add(beginTextfield);

	JLabel bossLabel = new JLabel("Boss: ");
	bossChoice = new JComboBox<Employee>();
	p.add(bossLabel);
	p.add(bossChoice);
	bossChoice.addItem(null);
	for (Employee e : container)
	    bossChoice.addItem(e);
	bossChoice.setSelectedItem(null);

	JPanel t = new JPanel();
	oben.add(t, BorderLayout.CENTER);

	JButton ok = new JButton("OK");
	ok.addActionListener(this);
	t.add(ok);
	JButton apply = new JButton("Apply");
	apply.addActionListener(this);
	t.add(apply);
	JButton cancel = new JButton("Cancel");
	cancel.addActionListener(this);
	t.add(cancel);
	JButton list = new JButton("Show All Employees");
	list.addActionListener(this);
	t.add(list);

	setLocation(f.getLocation().x + 200, f.getLocation().y + 200);

	pack();
	setVisible(true);
    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
	if (e.getPropertyName().equals("employee")) {
	    Employee emp = (Employee) e.getNewValue();
	    if (emp != null) {
		emp.addPropertyChangeListener(this);
		this.idTextfield.setText(EmployeeContainer.getIdCounter() + "");
	    }
	    else {
		emp = (Employee) e.getOldValue();
		emp.removePropertyChangeListener(this);
	    }
	}
	
	

	Employee selected = (Employee) bossChoice.getSelectedItem();
	bossChoice.removeAllItems();
	bossChoice.addItem(null);
	for (Employee emp : container)
	    bossChoice.addItem(emp);
	bossChoice.setSelectedItem(selected);
	pack();
    }

    private void save() {
	try {
	    int id = Integer.parseInt(idTextfield.getText());
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    LocalDate beginDate = LocalDate.parse(beginTextfield.getText(), dtf);
	    subject = new Employee(id, nameTextfield.getText(), beginDate);
	    Employee boss = (Employee) bossChoice.getSelectedItem();
	    if (boss != null)
		subject.linkBoss(boss);
	    else
		subject.unlinkBoss();
	    subject.addPropertyChangeListener(this);
	    container.linkEmployee(subject);
	    clear();
	    subject = null;
	} catch (DateTimeParseException e) {
	    JOptionPane.showMessageDialog(null, "Date not correct:\n" + e.getMessage(), "Error",
		    JOptionPane.ERROR_MESSAGE);
	} catch (IllegalInputException e) {
	    JOptionPane.showMessageDialog(null, "Employee cannot be registered:\n" + e.getMessage(), "Error",
		    JOptionPane.ERROR_MESSAGE);
	}
    }

    private void clear() {
	idTextfield.setText(EmployeeContainer.getIdCounter() + "");
	nameTextfield.setText("");
	beginTextfield.setText("");
	bossChoice.setSelectedItem(null);
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getActionCommand().equals("OK")) {
	    onOk();
	} else if (e.getActionCommand().equals("Apply")) {
	    onApply();
	} else if (e.getActionCommand().equals("Cancel")) {
	    onCancel();
	} else if (e.getActionCommand().equals("Show All Employees")) {
	    onList();
	}
    }

    private void onOk() {
	save();
	onCancel();
    }

    private void onApply() {
	save();
    }

    private void onCancel() {
	dispose();
    }

    private void onList() {
	ChoiceEmployee selection = new ChoiceEmployee(this);
	subject = selection.getChoice();
	load();
    }

    private void load() {
	if (subject != null) {
	    nameTextfield.setText(subject.getName());
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    beginTextfield.setText(subject.getBeginOfContract().format(dtf));
	    if (subject.getlinkBoss().isEmpty())
		bossChoice.setSelectedItem(null);
	    else
		bossChoice.setSelectedItem(subject.getlinkBoss().get());
	    subject = null;
	} else {
	    JOptionPane.showMessageDialog(null, "No employee selected", "Error", JOptionPane.ERROR_MESSAGE);
	}
    }
}
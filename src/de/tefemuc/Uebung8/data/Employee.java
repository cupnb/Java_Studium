/*
 * 
 * @Employee.java 02 03.06.2019 (Robert Lorenz)
 * 
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package de.tefemuc.Uebung8.data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Employee {

    private int id;
    private String name;
    private LocalDate beginOfContract;
    private Employee boss;
    
    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    public Employee(int id, String name, LocalDate beginOfContract) throws IllegalInputException {
	setId(id);
	setName(name);
	setBeginOfContract(beginOfContract);
	boss = null;
    }

    private static boolean checkId(int id) {
	return (id > 1000);
    }

    private static boolean checkName(String name) {
	return (name.length() >= 2 && Character.isUpperCase(name.charAt(0)));
    }

    private static boolean checkBeginOfContract(LocalDate beginOfContract) {
	return beginOfContract.isAfter(LocalDate.now());
    }

    private void setId(int id) {
	if (!checkId(id))
	    throw new IllegalArgumentException("ID not valid");
	this.id = id;
    }

    public void setName(String name) throws IllegalInputException {
	if (!checkName(name))
	    throw new IllegalInputException("name not valid", name);
	String oldName = this.name;
	this.name = name;
	changes.firePropertyChange("name", oldName, name);
    }

    private void setBeginOfContract(LocalDate beginOfContract) throws IllegalInputException {
	if (!checkBeginOfContract(beginOfContract)) {
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    throw new IllegalInputException("begin of contract not valid", beginOfContract.format(dtf));
	}
	this.beginOfContract = beginOfContract;
    }

    public int getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public LocalDate getBeginOfContract() {
	return beginOfContract;
    }

    @Override
    public boolean equals(Object o) {
	if (o == null)
	    return false;
	if (!(o instanceof Employee))
	    return false;
	Employee a = (Employee) o;
	return (a.getId() == this.getId());
    }

    @Override
    public String toString() {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	return "Employee " + getId() + ": " + getName() + ", since " + getBeginOfContract().format(dtf);
    }

    public void linkBoss(Employee boss) throws IllegalInputException {
	if (!this.checkBoss(boss))
	    throw new IllegalInputException("Relationship to boss must be acylic", boss.getId() + "");
	Employee oldBoss = this.boss;
	this.boss = boss;
	changes.firePropertyChange("boss", oldBoss, boss);
    }

    public void unlinkBoss() {
	Employee oldBoss = this.boss;
	this.boss = null;
	changes.firePropertyChange("boss", oldBoss, null);
    }

    public Optional<Employee> getlinkBoss() {
	return Optional.ofNullable(this.boss);
    }

    private boolean checkBoss(Employee newBoss) {
	if (newBoss.equals(this)) {
	    return false;
	} else if (newBoss.boss == null) {
	    return true;
	} else {
	    return this.checkBoss(newBoss.boss);
	}
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
	changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
	changes.removePropertyChangeListener(l);
    }
}

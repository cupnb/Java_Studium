/*
 * 
 * @EmployeeContainer.java 01 16.06.2019 (lorenzro)
 * 
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package de.tefemuc.Uebung8.data;

import java.util.ArrayList;
import java.util.Iterator;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class EmployeeContainer implements Iterable<Employee> {
    private static EmployeeContainer unique = null;
    private ArrayList<Employee> employee;
    private static int idCounter = 1001;

    private PropertyChangeSupport changes = new PropertyChangeSupport(this);

    private EmployeeContainer() {
	employee = new ArrayList<Employee>();
    }

    public static EmployeeContainer instance() {
	if (unique == null)
	    unique = new EmployeeContainer();
	return unique;
    }

    public void linkEmployee(Employee a) throws IllegalInputException {
	if (this.employee.contains(a))
	    throw new IllegalInputException("Employee already exists", a.getId() + "");
	this.employee.add(a);
	++idCounter;
	changes.firePropertyChange("employee", null, a);
    }

    public void unlinkEmployee(Employee a) {
	if (!this.employee.contains(a))
	    return;
	for (Employee b : employee) {
	    if (b.getlinkBoss().isEmpty())
		continue;
	    if (a.equals(b.getlinkBoss().get()))
		b.unlinkBoss();
	}
	this.employee.remove(a);
	changes.firePropertyChange("employee", a, null);
    }

    public static int getIdCounter() {
	return idCounter;
    }

    public Iterator<Employee> iterator() {
	return this.employee.iterator();
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
	changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
	changes.removePropertyChangeListener(l);
    }
}

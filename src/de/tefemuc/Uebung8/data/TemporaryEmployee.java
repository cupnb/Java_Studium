/*
 * 
 * @TemporaryEmployee.java 01 07.05.2019 (Robert Lorenz)
 * 
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package de.tefemuc.Uebung8.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Temporary Employee with attributes name and begin and end of contract
 * 
 * @author lorenzro
 * @see Employee
 */
public class TemporaryEmployee extends Employee {

    private LocalDate endOfContract;

    /**
     * Creates a new Temporary Employee with specified ID, name and begin and end of contract
     * 
     * @param id the ID of the Temporary Employee
     * @param name the name of the Temporary Employee
     * @param beginOfContract the begin of contract of the Temporary Employee
     * @param endOfContract the end of contract of the Temporary Employee
     * 
     * @throws IllegalInputException if name or begin or end of contract are not valid
     * @throws IllegalArgumentException if ID is not valid
     */
    public TemporaryEmployee(int id, String name, LocalDate beginOfContract,
	    LocalDate endOfContract) throws IllegalInputException {
	super(id, name, beginOfContract);
	setEndOfContract(endOfContract);
    }

    private boolean checkEndOfContract(LocalDate endOfContract) {
	return this.getBeginOfContract().isBefore(endOfContract);
    }

    private void setEndOfContract(LocalDate endOfContract)
	    throws IllegalInputException {
	if (!checkEndOfContract(endOfContract)) {
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	    throw new IllegalInputException("end of contract not valid", endOfContract.format(dtf));
	}
	this.endOfContract = endOfContract;
    }

    /**
     * Returns the end of contract of the Temporary Employee
     * 
     * @return endOfContract the end of contract of the Employee
     */
    public LocalDate getEndOfContract() {
	return endOfContract;
    }

    /**
     * Returns a String object representing the Temporary Employee's ID, name and begin and end of
     * contract
     * 
     * @return String representation of ID, name and begin and end of contract of this Employee
     */
    @Override
    public String toString() {
	return super.toString() + ", until " + getEndOfContract();
    }

}

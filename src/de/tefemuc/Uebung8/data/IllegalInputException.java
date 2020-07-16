/*
 * 
 * @IllegalInputException.java 01 07.05.2019 (Robert Lorenz)
 * 
 * Copyright (c) 2019 Lehrprofessur für Informatik, Universität Augsburg
 * 
 */

package de.tefemuc.Uebung8.data;

/**
 * Indicates, that a user input for some attribute is invalid
 * 
 * @author lorenzro
 *
 */
@SuppressWarnings("serial")
public class IllegalInputException extends Exception {

    /**
     * Constructs an IllegalInputException with the specified detailed message
     * 
     * @param message the detailed message
     * @param input String representation of the invalid input
     * 
     */
    public IllegalInputException(String message, String input) {
	super(message + ": " + input);
    }

}

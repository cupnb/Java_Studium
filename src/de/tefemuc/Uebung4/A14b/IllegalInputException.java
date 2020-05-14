package de.tefemuc.Uebung4.A14b;

public class IllegalInputException extends Exception {
    public IllegalInputException(String msg, String input){
        super(msg + ": " + input);
    }
}

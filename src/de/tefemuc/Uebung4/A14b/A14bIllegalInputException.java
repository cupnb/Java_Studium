package de.tefemuc.Uebung4.A14b;

public class A14bIllegalInputException extends Exception {
    public A14bIllegalInputException(String msg, String input){
        super(msg + ": " + input);
    }
}

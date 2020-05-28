package de.tefemuc.Uebung6;


public class A23Telephone {

    private A23TelephoneType type;
    private String number;

    public A23Telephone(A23TelephoneType type, String number) throws A23IllegalInputException {
        setType(type);
        setNumber(number);
    }

    public A23Telephone(A23Telephone telephone) throws A23IllegalInputException{
        setType(telephone.getType());
        setNumber(telephone.getNumber());
    }

    public A23TelephoneType getType(){
        return type;
    }

    public void setType(A23TelephoneType type) {
        this.type = type;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number) throws A23IllegalInputException {
        if (checkNumber(number)) this.number = number;
        else throw new A23IllegalInputException("Number not allowed");
    }

    private boolean checkNumber(String number){
        if (number.matches("^[0-9]*$") && number.length() > 3) return true;
        return false;
    }
}

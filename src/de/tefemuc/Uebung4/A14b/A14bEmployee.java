package de.tefemuc.Uebung4.A14b;

import java.time.LocalDate;

public class A14bEmployee {

    private int id;
    private String name;
    private LocalDate beginOfContract;

    public A14bEmployee(int id, String name, LocalDate beginOfContract) throws A14bIllegalInputException {
        setName(name);
        setId(id);
        setBeginOfContract(beginOfContract);
    }

    private boolean checkName(String name) {
        return (name.length() < 2 || !Character.isUpperCase(name.charAt(0)));
    }

    private void setName(String name) throws A14bIllegalInputException {
        if (checkName(name)) throw new A14bIllegalInputException("Name is not fitting", name);
        else this.name = name;
    }

    private void setId(int id){
        this.id = id;
    }

    private void setBeginOfContract(LocalDate beginOfContract){
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
    public String toString(){
        return "Name: " + name + " ID: " + id + " Begin of contract: " + beginOfContract;
    }

    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (!o.getClass().equals(this.getClass())) return false;
        A14bEmployee e = (A14bEmployee) o;
        return (e.getId() == this.id);
    }

}

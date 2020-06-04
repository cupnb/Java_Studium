package de.tefemuc.Uebung7;

import java.util.ArrayList;

public class A28aStudent {

    ArrayList<Studiengang> s;
    public A28aStudent(Studiengang s) throws IllegalArgumentException{
        linkStudiengang(s);
    }

    public void linkStudiengang(Studiengang s) throws IllegalArgumentException{
        if (!this.s.contains((Studiengang) s)){
            this.s.add(s);
        } else throw new IllegalArgumentException("Bereits Teil des Studienganges!");
    }
}

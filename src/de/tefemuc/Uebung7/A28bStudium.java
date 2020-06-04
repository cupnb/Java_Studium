package de.tefemuc.Uebung7;

import java.time.LocalDate;
import java.util.ArrayList;

public class A28bStudium {
    private LocalDate imma;
    private LocalDate exma;

    private ArrayList<A28bStudiengang> studiengangs;

    private boolean checkStudiengangs(A28bStudiengang s){
        return !studiengangs.contains((A28bStudiengang) s);
    }
}

package de.tefemuc.Uebung7;

import java.util.ArrayList;

public class A28cDirectory {

    ArrayList<AbstractFile> files;
    public A28cDirectory(String name) throws IllegalArgumentException{
        super(name);
    }

    public int getSize(){
        int sum = 0;
        for (AbstractFile f: files) {
            sum += f.getSize();
        }
        return sum;
    }
}

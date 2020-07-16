package de.tefemuc.Uebung8;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class A32bObjectContainer implements Iterable<GeometricObject>{

    private static A32bObjectContainer unique = null;
    private ArrayList<GeometricObject> list;
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);;

    private A32bObjectContainer(){
        list = new ArrayList<GeometricObject>();
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        changeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changeSupport.removePropertyChangeListener(l);
    }

    public void addObject(GeometricObject o){
        if (list.contains((GeometricObject) o)) return;
        list.add(o);
        changeSupport.firePropertyChange("Object", null, o);
    }

    public void removeObject(GeometricObject o){
        if (list.contains((GeometricObject) o)) return;
        list.remove(o);
        changeSupport.firePropertyChange("Object", o, null);
    }

    public static A32bObjectContainer instance(){
        if (unique == null) {
            unique = new A32bObjectContainer();
        }
        return unique;
    }


    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer action) {
    }

    @Override
    public Spliterator spliterator() {
        return list.spliterator();
    }
}

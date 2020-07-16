package de.tefemuc.Uebung8;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class A32cPropertyChangeListener implements PropertyChangeListener {

    public A32cPropertyChangeListener(){
        A32bObjectContainer container = A32bObjectContainer.instance();
        container.addPropertyChangeListener(this);
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(evt.getPropertyName() + evt.getOldValue() + evt.getNewValue());
    }
}

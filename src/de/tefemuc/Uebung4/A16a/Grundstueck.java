package de.tefemuc.Uebung4.A16a;

public class Grundstueck extends Immobilie{

    public Grundstueck(int size, int price) throws IllegalPriceException, IllegalSizeException{
        super(size, price);
    }

    @Override
    protected boolean checkPrice(int price){
        return (!(price < 10000 || price % 1000 != 0));
    }

    @Override
    protected boolean checkSize(int size) {
        return (!(size < 250));
    }
}


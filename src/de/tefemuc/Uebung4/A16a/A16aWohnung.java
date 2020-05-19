package de.tefemuc.Uebung4.A16a;

public class A16aWohnung extends A16aImmobilie {

    public A16aWohnung(int size, int price) throws A16aIllegalPriceException, A16aIllegalSizeException {
        super(size, price);
    }

    @Override
    protected boolean checkPrice(int price){
        return (!(price < 10000 || price % 1000 != 0));
    }

    @Override
    protected boolean checkSize(int size) {
        return (!(size > 120 || size < 20));
    }
}

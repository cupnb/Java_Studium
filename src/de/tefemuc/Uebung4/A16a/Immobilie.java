package de.tefemuc.Uebung4.A16a;

public abstract class Immobilie {

    private int size;
    private int price;

    public Immobilie(int size, int price) throws IllegalSizeException, IllegalPriceException{
        setSize(size);
        setPrice(price);
    }

    private void setSize(int size) throws IllegalSizeException {
        if (!checkSize(size)) throw new IllegalSizeException("Illegal size for this type of real estate");
        this.size = size;
    }

    private void setPrice(int price) throws IllegalPriceException {
        if (!checkPrice(price)) throw new IllegalPriceException("Illegal price for this type of real estate");
        this.price = price;
    }

    protected abstract boolean checkSize (int size);

    protected abstract boolean checkPrice(int price);

    public double calcPricePerSquareMeter(){
        return ((price + price * 0.345) / size);
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}

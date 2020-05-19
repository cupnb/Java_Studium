package de.tefemuc.Uebung4.A16a;

public abstract class A16aImmobilie {

    private int size;
    private int price;

    public A16aImmobilie(int size, int price) throws A16aIllegalSizeException, A16aIllegalPriceException {
        setSize(size);
        setPrice(price);
    }

    private void setSize(int size) throws A16aIllegalSizeException {
        if (!checkSize(size)) throw new A16aIllegalSizeException("Illegal size for this type of real estate");
        this.size = size;
    }

    private void setPrice(int price) throws A16aIllegalPriceException {
        if (!checkPrice(price)) throw new A16aIllegalPriceException("Illegal price for this type of real estate");
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

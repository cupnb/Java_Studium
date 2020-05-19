package de.tefemuc.Uebung4.A14a;

public abstract class A14aGeometricObject {


    private A14aPoint pos;
    private static int count;

    protected A14aGeometricObject(A14aPoint pos){
        setPos(pos);
        A14aGeometricObject.count++;
    }

    public A14aPoint getPos() {
        return pos;
    }

    public void setPos(A14aPoint pos) {
        this.pos = pos;
    }

    public static int getCount() {
        return count;
    }

    public abstract double getArea();
}

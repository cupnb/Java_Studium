package de.tefemuc.Uebung4.A14a;

public abstract class GeometricObject {


    private Point pos;
    private static int count;

    protected GeometricObject(Point pos){
        setPos(pos);
        GeometricObject.count++;
    }

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }

    public static int getCount() {
        return count;
    }

    public abstract double getArea();
}

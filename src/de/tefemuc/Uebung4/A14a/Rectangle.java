package de.tefemuc.Uebung4.A14a;

public class Rectangle extends GeometricObject {

    private double length;
    private double height;
    private static int count = 0;

    public Rectangle(Point pos, double length, double height){
        super(pos);
        setHeight(height);
        setLength(length);

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) throw new IllegalArgumentException("Length cannot be negative");
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) throw new IllegalArgumentException("Height cannot be negative");
        this.height = height;
    }

    public double getArea(){
        return this.height * this.length;
    }

    public String toString(){
        return length + " x " + height + " Rect at " + getPos().toString();
    }

    public boolean equals(Object o){
        if (o == null) return false;
        if (o.getClass().equals(this.getClass())) return false;
        Rectangle a = (Rectangle) o;
        return (a.getPos().equals(this.getPos()) && a.getHeight() == this.height && a.getLength() == this.length);
    }
}

package de.tefemuc.Uebung4.A14a;

public class A14aCircle extends A14aGeometricObject {



    double radius;
    private static int count = 0;

    public A14aCircle(A14aPoint pos, double radius){
        super(pos);
        setRadius(radius);
        A14aCircle.count++;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative or zero");
        this.radius = radius;
    }

    public String toString(){
        return "Circle at " + getPos().toString() + " with radius " + radius;
    }

    public boolean equals(Object o){
        if (o == null) return false;
        if (o.getClass().equals(this.getClass())) return false;
        A14aCircle a = (A14aCircle) o;
        return (a.getPos().equals(this.getPos()) && a.getRadius() == this.radius);
    }
}

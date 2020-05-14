package de.tefemuc.Uebung4.A14a;

public class Circle extends GeometricObject {



    double radius;
    private static int count = 0;

    public Circle(Point pos, double radius){
        super(pos);
        setRadius(radius);
        Circle.count++;
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
        Circle a = (Circle) o;
        return (a.getPos().equals(this.getPos()) && a.getRadius() == this.radius);
    }
}

package de.tefemuc.Uebung4.A14a;

public class Point {



    private int x;
    private int y;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (!checkNegative(y)) this.x = x;
        else throw new IllegalArgumentException("Argument cannot be negative");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (!checkNegative(y)) this.y = y;
        else throw new IllegalArgumentException("Argument cannot be negative");
    }

    private static boolean checkNegative(int i){
        return i < 0;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object o){
        if (o == null) return false;
        if (o.getClass().equals(this.getClass())) return false;
        Point a = (Point) o;
        return (a.getX() == this.getX() && a.getY() == this.getY());
    }

}

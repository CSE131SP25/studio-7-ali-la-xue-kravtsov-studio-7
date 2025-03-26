package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public boolean isSmallerThan(Rectangle other) {
        return this.getArea() < other.getArea();
    }

    public boolean isSquare() {
        return length == width;
    }

    public void draw(double x, double y) {
        StdDraw.rectangle(x, y, length / 2, width / 2);
    }

    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 5);
       
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Is square? " + r1.isSquare());

        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);

        r1.draw(0, 0);
    }
}
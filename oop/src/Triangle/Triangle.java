package Triangle;

public class Triangle {
    private double a, b, c;

    public Triangle() {    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double x) {
        a = x;
    }

    public void setB(double y) {
        b = y;
    }

    public void setC(double z) {
        c = z;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    public boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public boolean isValid() {
        return isValidTriangle(a, b, c);
    }
}

class Program {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setA(3);
        t.setB(4);
        t.setC(5);

        System.out.println("Triangle is: " + t.getPerimeter());
        System.out.println("Area is: " + t.getArea());

        t.setA(t.getA() + 1);
        t.setB(t.getB() + 1);
        t.setC(t.getC() + 1);

        if (t.isValid()) {
            System.out.println("The new triangle is valid.");
            System.out.println("Perimeter of the new triangle: " + t.getPerimeter());
            System.out.println("Area of the new triangle: " + t.getArea());
        } else {
            System.out.println("The new triangle is not valid.");
        }
    }
}

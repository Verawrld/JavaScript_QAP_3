package Question3;

public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    public double getArea() {
        return Math.PI * a * b;
    }

    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
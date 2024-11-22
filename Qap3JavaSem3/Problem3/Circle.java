public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("%s, Circle[Radius: %.2f, Area: %.2f, Perimeter: %.2f]", super.toString(), radius,
                getArea(), getPerimeter());
    }
}

public class ScalableCircle extends Circle implements Scalable {
    public ScalableCircle(String name, double radius) {
        super(name, radius);
    }

    @Override
    public void scale(double factor) {
        if (factor <= 0)
            throw new IllegalArgumentException("Scaling factor must be positive.");
        setRadius(getRadius() * factor);
    }
}

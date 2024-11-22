public class Demo3And4 {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle A", 5.0);
        System.out.println(circle);

        ScalableCircle scalableCircle = new ScalableCircle("Scalable Circle A", 5.0);
        System.out.println("Before Scaling: " + scalableCircle);
        scalableCircle.scale(2.0);
        System.out.println("After Scaling: " + scalableCircle);
    }
}

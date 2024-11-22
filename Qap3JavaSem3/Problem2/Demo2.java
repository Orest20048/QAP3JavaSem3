public class Demo2 {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3, 4, 1, 1);
        System.out.println("Initial Point: " + point);

        point.move();
        System.out.println("After Moving: " + point);

        point.setXSpeed(2);
        point.setYSpeed(-1);
        point.move();
        System.out.println("After Moving Again: " + point);
    }
}

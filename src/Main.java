import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(5.0, 5.0);
        Circle circle = new Circle(center, 10.0);
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
        System.out.println("Pole koła: " + circle.getArea());
    }
}
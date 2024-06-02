import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[] {
                new Circle(new Point(1.0, 1.0), 2.0),
                new ColoredCircle(new Point(2.0, 2.0), 3.0, "Blue"),
                new Circle(new Point(3.0, 3.0), 4.0)
        };

        for (Circle circle : circles) {
            System.out.println("Pole koła: " + circle.getArea());
            if (circle instanceof ColoredCircle) {
                System.out.println("Kolor: " + ((ColoredCircle)circle).getColor());
            }
        }
    }
}
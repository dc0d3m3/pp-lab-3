import geometry.Point;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(10.0, 10.0);
        ColoredCircle coloredCircle = new ColoredCircle(center, 15.0, "Red");
        System.out.println("Kolor koła: " + coloredCircle.getColor());
        System.out.println("Pole kolorowego koła: " + coloredCircle.getArea());
    }
}
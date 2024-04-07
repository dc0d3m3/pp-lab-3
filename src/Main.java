class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Point punkt = new Point(3.5, 4.5);
        System.out.println("Współrzędna x: " + punkt.getX());
        System.out.println("Współrzędna y: " + punkt.getY());
    }
}

import java.util.Scanner;

class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Point(x, y);
    }

    public double distance(Point b) {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }

}

class Triangle {

    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid() {
        double A = a.distance(b);
        double B = b.distance(c);
        double C = c.distance(a);
        return A + B > C && A + C > B && B + C > A;
    }

    public String fomatString(double x) {
        return String.format("%.3f", x);
    }

    public String getPerimeter() {
        double A = a.distance(b);
        double B = b.distance(c);
        double C = c.distance(a);
        return fomatString(A + B + C);
    }
}

public class LopTriangle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}

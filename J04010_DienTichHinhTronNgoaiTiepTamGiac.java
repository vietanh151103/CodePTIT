
import java.util.Scanner;

public class J04010_DienTichHinhTronNgoaiTiepTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases-- != 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());

            double ab = a.distance(b);
            double ac = a.distance(c);
            double bc = b.distance(c);

            if (checkRec(ab, bc, ac)) {
                double s = Math.sqrt((ab + bc + ac)*(ab + bc - ac)*(bc + ac - ab)*(ab - bc + ac))*1/4;
                double r = (ab*bc*ac)/(4*s);
                double pi = Math.PI;
                double res = pi*Math.pow(r, 2);
                System.out.printf("%.3f\n", res);
            } else {
                System.out.println("INVALID");
            }
        }
    }

    public static boolean checkRec(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}

class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

import java.util.Scanner;

class Point{
    double x, y;

    public Point() {
    }
    
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
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y), 2));
    }

}
public class J04009_DienTichTamGiac {
    public static boolean check(double a, double b , double c){
        return a + b > c && a + c > b && b + c > a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- >0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ac = a.distance(c);      
            
            if(check(ac, bc, ac)){
                double res = Math.sqrt((ab + bc + ac)*(ab + bc - ac)*(bc + ac - ab)*(ab - bc + ac))*1/4;
                System.out.printf("%.2f\n", res);
            }
            else System.out.println("INVALID");
                
        }
    }
}

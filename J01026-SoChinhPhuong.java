import java.util.Scanner;

public class sochinhphuong {
    public static Scanner sc = new Scanner(System.in);
    public static int check(){
        long n = sc.nextLong();
        double sqrt = (long)Math.sqrt(n);
        if( sqrt * sqrt == n) return 1;
        return 0;
    }
    public static void testCase(){
        if (check() == 1) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t -- > 0){
            testCase();
        }
    }
}

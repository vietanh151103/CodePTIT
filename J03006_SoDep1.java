//J03006
import java.util.Scanner;

public class J03006_SoDep1 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean check(String s){
        int c = s.length() - 1;
        for(int i = 0 ; i <= c; i++){
            int a = s.charAt(i) - '0';
            if( a % 2 != 0 ) return false;
            if( s.charAt(i) != s.charAt(c - i)) return false;
        }
        return true;              
    }
    public static void TestCase(String s){
        if(check(s))
                System.out.println("YES");
            else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while( t -->0){
            String s = sc.next();
            TestCase(s);
        }
    }
}

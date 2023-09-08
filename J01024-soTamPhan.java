import java.util.Scanner;

public class sotamphan {
    public static Scanner sc = new Scanner(System.in);
    public static int check(){
        String a = new String();
        a = sc.next();
        for(int i = 0; i < a.length(); i++){
            if( a.charAt(i) != '0' && a.charAt(i) != '1' && a.charAt(i) != '2' ){
                return 0;
            }
        }
        return 1;
    }
    public static void testCase(){
        if(check() == 1) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t -- >0){
            testCase();
        }
    }   
}

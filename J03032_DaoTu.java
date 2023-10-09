
import java.util.Scanner;

public class J03032_DaoTu {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void testCase(){
        String s = sc.nextLine();
        String[] words = s.split("\\s");
        for(String i : words){
            StringBuilder res = new StringBuilder(i);
            System.out.print(res.reverse().toString() + " ");         
        }
    }
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t -- >0){
            testCase();
            System.out.println();
        }
    }
}

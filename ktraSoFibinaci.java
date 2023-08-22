
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class ktraSoFibinaci {
    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo = new long[100];
    public static void prepare(){
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i =2 ; i < 100 ; i++ ){
            fibo[i] = fibo[i-1 ]+ fibo[i - 2];
        }
    }
    public static boolean ktra(long n){       
        for(long i : fibo){
            if (i == n) return true;
            else if (i > n) 
                return false;
        }
        return false;     
    }
    
    public static void main(String arg[]){
        prepare();
        int t;
        t = sc.nextInt();
        while( t -- > 0){
            long n = sc.nextLong();
            if( ktra(n)== true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}

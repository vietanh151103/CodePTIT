
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Fibonaci{
    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo = new long[100];
    public static void fibonaci (int n){
            fibo[0] = 0;
            fibo[1] = fibo[2] =1;
        for(int i = 3; i <= 92; i++){
            fibo[i] = fibo[i-1 ]+ fibo[i-2 ];
            if (i == n ) fibo[i] =fibo[n];
        }
            System.out.println(fibo[n]);
        
       
    }
    public static void main(String[] args) {
        int t ;
        t = sc.nextInt();
        while (t-->0){
            int n;
            n = sc.nextInt();
            fibonaci(n);
        }                
    }            
}

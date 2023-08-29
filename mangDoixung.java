
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vieta
 */
public class mangDoixung {
    public static Scanner sc = new Scanner(System.in);
    public static int check(){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0 ; i< n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(a[i] != a[n - i -1]) return 0;
        }
        return 1;
    }
    public static void testCase(){
        if(check() ==  1) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while( t -- >0){
            testCase();
        }
    }
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class phantichthuasonguyento {
    public static Scanner sc = new Scanner(System.in);
    public static void phantich(int t){
        long n = sc.nextLong();
        //long n = N;
        System.out.print("Test "+ t +": " );
        for(int i = 2; i<= n; i++){           
            int dem = 0;
          
            while( n % i ==0){
                dem ++;
                n = n/i;
            }
            
            if( dem != 0)
                System.out.printf("%d(%d) ", i , dem); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i= 1 ; i <=t; i++){
            phantich(i);                      
        }
    }
}

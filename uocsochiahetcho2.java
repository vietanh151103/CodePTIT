/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class uocsochiahetcho2 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean ktrachanle(long n){
        if( n< 2 ) return false;
        if( n % 2 ==0) return true;
        return n>1;
    }
    public static void uocso(long n){         
        if(ktrachanle( n)== true) {
            int dem = 0;
            while( n>1){
                int i =2;
                if( n % i ==0){
                    n= n/i;
                    dem ++;
                }
                i += 2;
            }
            System.out.println(dem); 
        }
        if(ktrachanle(n)== false) System.out.println(0);         
    }
    public static void main(String[] args) {
        int t= sc.nextInt();
        while(t -->0){
            long a;
            a=sc.nextLong();
            uocso(a);
        }
        
    }
}

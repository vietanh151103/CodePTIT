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
public class tonguocso {
    public static Scanner sc = new Scanner(System.in);
    public static long sum=0;
    public static long[] check = new long[2000001];
    public static void sangsoNT(){
        
        //thuat toan sang so ngto
        for (long i =2 ; i<check.length; i++){
            check[(int)i] = 1; //khoi tao mang so ngto          
            }
        for (long i = 2; i <check.length; i++){
            if(check[(int)i] == 1){
                for (long j = 2*i; j<check.length;j += i){
                    check[(int)j] = 0;
                }
            }
        }
        
    }
    public static void tong(long n){
        
        long tong = 0;
        for(long i = 2; i<= n; i++){
            if(check[(int)i] == 1 ){
                while(n% i ==0){
                    n= n/i;
                    tong += i;
                }                  
            }
            if ( check[(int)n]== 1){
                tong += n;
                break;
            }
        }
        sum = sum + tong;
    }
    public static void main(String[] args){
        sum=0;
        sangsoNT();
        int t = sc.nextInt();       
        while(t-->0){
            long n;
            n = sc.nextLong();
            tong(n);
        }
        System.out.println(sum);       
      }
    }
    


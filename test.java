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
public class test {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n= sc.nextInt();
        int N= n;
        boolean[] check = new boolean[n+1];
        for( int i =2 ; i<=n; i++){
            check[i] = true;
        }
        for( int i=2 ;i<=n;i++){
            if(check[i]== true){
                for(int j = 2*i ; j<=n ; j = j + i){
                    check[j]= false;
                }
            }
        }
        for( int i= 2; i<= N;i++){
            while( n %i ==0){
                n = n/i;
                if( check[i] == true) System.out.println(i +" ");
                
            }
        }
    }
}

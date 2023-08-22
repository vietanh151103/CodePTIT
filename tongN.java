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
public class tongN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int i =0 ; i < t ; i++){
            long n ;
            n = sc.nextInt();
            long tong =0 ;
            tong = (n*( n+1))/2;
            
            System.out.println(tong);
            
        }
    }
}

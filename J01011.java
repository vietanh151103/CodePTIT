/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
//boi so chung lon nhat va uoc so chung nho nhat
import java.util.Scanner;

/**
 *
 * @author User
 */
public class J01011 {
    public static Scanner sc = new Scanner(System.in);
    public static long uocso(long a, long b){
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;       
    }
    public static void boiso(long a, long b){
        long boiso = (a * b)/uocso(a, b);
        System.out.print(boiso + " ");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t -->0){
            long a,b;
            a = sc.nextLong();
            b = sc.nextLong();           
            boiso(a, b);
            System.out.println(uocso(a, b));
        }
    }
}

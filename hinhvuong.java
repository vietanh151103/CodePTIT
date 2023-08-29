

import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vieta
 */
public class hinhvuong {
    public static int[] t = new int[4];
    public static int[] h = new int[4];
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        for(int i = 0; i < 4 ; i++){
            t[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        Arrays.sort(t);
        Arrays.sort(h);
        int tung = t[3] - t[0];
        int hoanh = h[3] - h[0];
        int max = ( tung > hoanh ) ? tung : hoanh;
        System.out.println(max*max);
    }
    public static void main(String[] args) {
            testCase();
        
    }
}
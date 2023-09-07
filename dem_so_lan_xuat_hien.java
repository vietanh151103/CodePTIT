
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vieta
 */
public class dem_so_lan_xuat_hien {
    public static Scanner sc = new Scanner(System.in);
    public static void TestCase(int j){
        int n = sc.nextInt();
        int a[] = new int[n];
        int dem[] = new int[10000];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();          
            dem[a[i]] ++;
        }
        System.out.println("Test " + j +":");
        for(int i = 0 ; i < n ; i++){
            if(dem[a[i]] >= 1){
                System.out.println(a[i] + " xuat hien " + dem[a[i]] +" lan");
                dem[a[i]] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        for(int i = 1 ; i <= t ; i++){    
            TestCase(i);
        }
    }
}

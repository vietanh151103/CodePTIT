
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vieta
 */
public class J02010_SapXepDoiChoTrucTiep {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[10000];
        for(int i = 0 ; i < n; i++)
            a[i] = sc.nextInt();
        for(int i = 0 ; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;                        
                }
            }
            System.out.printf("Buoc %d: ", i + 1);
            for(int j = 0; j < n; j++){
                System.out.print( a[j] + " ");
            }
            System.out.println();
        }
    }   
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vieta
 */
    public class hop_cua_hai_day_so {
        public static Scanner sc= new Scanner(System.in);
        public static void testCase(){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int demA[] = new int[1001];
            int b[] = new int[m];
            int demB[] = new int[1001];
            for(int i : a){
                  a[i] = sc.nextInt();
                  demA[a[i]] = 1;
             }
            for( int j : b){
                  b[j] = sc.nextInt();
                  demB[b[j]] = 1;
            }
            for(int i = 0 ; i < 1001 ; i++){
                if(demA[i] == 1 || demB[i] == 1) System.out.print(i + " ");
            }                   
        }
        public static void main(String[] args) {
                  testCase();
        }   
    }

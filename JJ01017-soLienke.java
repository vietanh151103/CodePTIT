/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
//J01017
import java.util.Scanner;

/**
 *
 * @author User
 */
public class soLienke {
    public static Scanner sc = new Scanner(System.in);
    public static boolean testCase(String s){
        for(int i = 0 ;i < s.length() - 1 ; i++) {
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1) return false;
        }
       return true;
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t -- >0){
            String s = sc.next();
            if(testCase(s) ==  false) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
//J01018
import java.util.Scanner;

/**
 *
 * @author User
 */
public class soKhonglienke {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(String s){     
        for (int i = 1 ; i < s.length();i++) {
            if(Math.abs(s.charAt(i) - s.charAt(i -1)) - 2 != 0) {
                System.out.println("NO");
                return;
            }
        }
        int tong = 0;
        for(int i = 0 ;i< s.length();i++){
            tong += s.charAt(i) - '0';
        }
        if(tong % 10 == 0)
            System.out.println("YES");
        else System.out.println("NO");
        
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t -- >0){
            String s = sc.next();
            testCase(s);
        }
    }
}

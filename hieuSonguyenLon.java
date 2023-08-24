/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
//J03013
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class hieuSonguyenLon {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase (){
            BigInteger n = new BigInteger(sc.next());
            BigInteger m = new BigInteger(sc.next());          
            int maxlegth = Math.max(n.toString().length(), m.toString().length());
            BigInteger res = n.subtract(m).abs();
            StringBuilder kq = new StringBuilder(res.toString());
            while( kq.length() < maxlegth){
                kq.insert(0, '0');            
            }
            System.out.println(kq);  
    }
    public static void main(String[] args) {      
        int t = sc.nextInt();
        while(t -->0){
            testCase();
        }
    }  
}

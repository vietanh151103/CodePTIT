/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
//J03014
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class hieusonguyenlon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger kq = a.subtract(b);
        System.out.println(kq);
    }
}

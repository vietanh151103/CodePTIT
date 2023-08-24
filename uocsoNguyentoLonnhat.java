/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
//J01014

import java.util.Scanner;
/**
 *
 * @author User
 */
public class uocsoNguyentoLonnhat {
    public static Scanner sc = new Scanner(System.in);
    public static boolean ktraSoNguyenTo (long k) {
	if(k<2) {
		return false;
	}else {
            int root = (int)Math.sqrt(k);
            for(long i=2; i<=root; i++) {
                if(k%i==0) {
                    return false;
                    }
                }
            }
	return true;          
    }
    public static void testCase(long n){
        long res =0;
        for(int i = 1 ;i <= Math.sqrt(n);i++){
            if(n % i ==0){
                if(ktraSoNguyenTo(n/i)){
                    System.out.println(n/i);
                    return;//thoat khoi vong lap
                }
                if(ktraSoNguyenTo(i))
                    res = i;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t -->0){
            long n = sc.nextLong();
            testCase(n);
        }
    }
}

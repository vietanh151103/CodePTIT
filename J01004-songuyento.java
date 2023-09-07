/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class songuyento {
    public static boolean ktraSoNguyenTo (int k) {
	if(k<2) {
		return false;
	}else {
            int root = (int)Math.sqrt(k);
            for(int i=2; i<=root; i++) {
                if(k%i==0) {
                    return false;
                    }
                }
            }
	return true;
           
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t-->0){
            
            long n;
            n = sc.nextLong();
            if (ktraSoNguyenTo((int) n)==true)
                System.out.println("YES");
            else System.out.println("NO");
            }
    }
}

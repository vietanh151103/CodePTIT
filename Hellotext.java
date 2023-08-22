/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class Hellotext {
    public static void main(String[] args)throws Exception {
        File file = new File("C:\\Users\\User\\Desktop\\Hello.txt");
        Scanner sc = new Scanner(file);
 
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}

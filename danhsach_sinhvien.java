
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vieta
 */

class sinhvien{
    public static int dem = 1;
    private String hoTen , lop , maSV , birthday ;
    private double gpa;  

    public sinhvien(String hoTen, String lop, String birthday, double gpa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.birthday = birthday;
        this.gpa = gpa;
        this.maSV = String.format("B20DCCN%03d", dem ++);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + birthday + " " + String.format("%.2f", gpa);  
    }
    
}
public class danhsach_sinhvien {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat a = new SimpleDateFormat("dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- >0){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String day = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            sinhvien sv = new sinhvien(ten, lop, day, gpa);
            Date d = a.parse(day);
            sv.setBirthday(a.format(d));
            System.out.println(sv);
        }          
    }   
}

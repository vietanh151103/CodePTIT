
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
class sinhvien2{
    public static int dem = 1;
    private String hoTen , lop , maSV , birthday ;
    private double gpa;  

    public sinhvien2(String hoTen, String lop, String birthday, double gpa) {
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
    public String chuanHoa(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    public String tenDep(){
        String[] a = hoTen.trim().split("\\s+");
        String kq = "";
        for(int i= 0; i < a.length ; i++){
            kq += chuanHoa(a[i]);
            if( i != a.length -1)
                kq += " ";
        }
        return kq;            
    }
    
    @Override   
    public String toString() {
        return maSV + " " + tenDep() + " " + lop + " " + birthday + " " + String.format("%.2f", gpa);  
    }
    
}
public class danhsach_sinhvien2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat a = new SimpleDateFormat("dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t -- >0){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String day = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            sinhvien2 sv = new sinhvien2(ten, lop, day, gpa);
            Date d = a.parse(day);
            sv.setBirthday(a.format(d));
            System.out.println(sv);
        }          
    }
    
}

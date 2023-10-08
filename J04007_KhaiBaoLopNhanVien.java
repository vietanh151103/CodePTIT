
import java.util.Scanner;

class NhanVien{
    private String ID, name , gender , birthday , address , tax , date ;

    public NhanVien(String ID, String name, String gender, String birthday, String address, String tax, String date) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + gender + " " + birthday + " " + address + " " + tax + " " + date;
    }
    
}
public class J04007_KhaiBaoLopNhanVien {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ID = "00001";
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String birthday = sc.nextLine();
        String address = sc.nextLine();
        String tax = sc.nextLine();
        String date = sc.nextLine();
        NhanVien s = new NhanVien(ID, name, gender, birthday, address, tax, date);
        System.out.println(s);
    }
}

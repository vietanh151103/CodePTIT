import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class sinhVien{
    private String maSV, ten , lop , ngaySinh;
    private float GPA;

    public sinhVien(String maSV,String ten, String lop, String ngaySinh, float GPA) {
        this.maSV = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", GPA);
    }
    
}
public class J04006_KhaiBaoLopSinhVien {
    public static Scanner sc = new Scanner(System.in);
    public static String chuanHoa(String ngaySinh){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        sdf.setLenient(false);
        
        try{
            Date date = sdf.parse(ngaySinh);
            return sdf.format(date);
        }
        catch(ParseException e){
            return "";
        }
    }
    public static void main(String[] args) {
        String ten = sc.nextLine();
        String lop = sc.nextLine();
        String ngaySinh = chuanHoa(sc.nextLine());
        float GPA = sc.nextFloat();
        sinhVien s = new sinhVien(lop, ten, lop, ngaySinh, GPA);
        System.out.println(s);    
    }
}

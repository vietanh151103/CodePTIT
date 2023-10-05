
import java.util.Scanner;

class thiSinh{
    private final String ten;
    private final String ngaySinh;
    private  double diem1 , diem2 , diem3 ;

    public thiSinh(String ten, String ngaySinh, double diem1, double diem2, double diem3) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    @Override
    public String toString() {
        return ten + " " + ngaySinh + " " + (diem1 + diem2 + diem3);
    }
}
public class J04005_LopThiSinh {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ten = new String(sc.nextLine());
        String ngaySinh = new String(sc.nextLine());
        double diem1 = sc.nextDouble();
        double diem2 = sc.nextDouble();
        double diem3 = sc.nextDouble();
        thiSinh s = new thiSinh(ten, ngaySinh, diem1, diem2, diem3);
        System.out.println(s);
        
    }
}

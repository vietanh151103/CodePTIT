
import java.util.Scanner;


class phanSo{
        private long tuSo , mauSo;
        
        public phanSo(long tuSo, long mauSo) {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
            rutGon();
        }
        public phanSo cong(phanSo ps){
            long tongTs = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
            long tongMs = this.mauSo * ps.mauSo;
            return new phanSo(tongTs, tongMs);
        }
        private long UCLN(long a, long b){
            while(b != 0){
                long temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        private void rutGon(){
            long UC = UCLN(this.tuSo, this.mauSo);
            this.tuSo = this.tuSo / UC;
            this.mauSo = this.mauSo / UC;
            }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
        
}
public class J04004_TongPhanSo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long t1 = sc.nextLong();
        long m1 = sc.nextLong();
        long t2 = sc.nextLong();
        long m2 = sc.nextLong();
        phanSo p1 = new phanSo(t1 , m1);
        phanSo p2 = new phanSo(t2, m2);
        phanSo tong = p1.cong(p2);
        System.out.println(tong);
    }
}

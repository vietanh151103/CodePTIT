import java.util.Scanner;

public class tongGiaiThua {
    public static Scanner sc = new Scanner(System.in);
    public static Long tinhgiaithua (int n){
        long giai_thua = 1;
        if (n ==0 || n ==1) return giai_thua;
        
        for (int i = 2 ; i <= n ; i++){
            giai_thua = giai_thua *i;
        }
        return giai_thua;
    }
    public static void tonggiaithua (int n){   
        long tong=0;
        for( int i= 1; i<=n; i++){
           tong += tinhgiaithua(i);   
        }
        System.out.println(tong);
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        tonggiaithua(n);
        
    }
}


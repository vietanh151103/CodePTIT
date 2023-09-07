import java.util.Scanner;

public class J01014_uocSochiahetcho2 {
    public static Scanner sc = new Scanner(System.in);
    public static void uocso(long n){
        int dem = 0;
        for(int i = 1; i<= Math.sqrt(n);i++){
            if(n % i == 0){
                if(i % 2 == 0)
                    dem ++;
                if((n / i) % 2 == 0 && i != Math.sqrt(n))
                    dem++;
            }
        }
        System.out.println(dem);
    }
    public static void main(String[] args) {
        int t= sc.nextInt();
        while(t -->0){
            long a;
            a=sc.nextLong();
            uocso(a);
        }       
    }
}

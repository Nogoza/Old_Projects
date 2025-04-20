package Donguler;
import java.util.Scanner;

public class DongulerP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1=1 , s2=1 , s3=1;

        System.out.print("eleman sayısını giriniz: ");
        int n = input.nextInt();

        System.out.print("Seçilecek eleman sayısını giriniz: ");
        int r = input.nextInt();

        for (int i=1;i<=n;i++){
            s1*=i;
        }

        for (int i=1;i<=r;i++){
            s2*=i;
        }

        for (int i=1;i<=n-r;i++){
            s3*=i;
        }
        int sonuc = s1/(s2*s3);
        System.out.printf("C(%d,%d)= %d",n,r,sonuc);

    }
}

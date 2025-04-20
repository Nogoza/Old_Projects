package Donguler;
import java.util.Scanner;

public class DongulerP5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int n = input.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        int r = input.nextInt();

        int total = 1;

        for(int i=1;i<=r;i++){
            total *= n;
        }
        System.out.println(total);
    }
}

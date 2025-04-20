package Donguler;
import java.util.Scanner;

public class DongulerP6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a = input.nextInt();

        for(int i=1;i<=a;i++){
            int z = a %10;
            System.out.print(z);
        }
    }
}

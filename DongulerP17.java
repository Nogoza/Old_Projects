package Donguler;
import java.util.Scanner;

public class DongulerP17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();

        for(int i = sayi; i > 0; i--){
            for(int j = 0; j < (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}

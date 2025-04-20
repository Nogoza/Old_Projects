package Donguler;
import java.util.Scanner;

public class DongulerP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i*= 4){
            System.out.println("4'ün katı:" + i);
            }
        for(int j = 1; j <= n; j*=5){
            System.out.println("5'in katı:" + j);
        }
    }
}

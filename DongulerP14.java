package Donguler;
import java.util.Scanner;

public class DongulerP14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EBOB - EKOK Hesaplama Programına Hoşgeldiniz.");

        System.out.print("1.Sayıyı Giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int i = 1;
        int min = Math.min(sayi1,sayi2);
        while(i <= min){
            if(sayi1 % i == 0 && sayi2 % i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob Değeri: " + ebob);
        int ekok = (sayi1 * sayi2) /ebob;
        System.out.print("Ekok Degeriniz: " + ekok);

        input.close();
        }
    }
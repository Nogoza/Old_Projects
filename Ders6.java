package Derler1;
import java.util.Scanner;

public class Ders6 {
    public static void main(String[] args){
        //Vücüt Kitle İndeksi Hesaplama

        Scanner input = new Scanner(System.in);
        double boy, kilo, index;

        System.out.print("Metre cinsinden boyunuzu giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilogram cinsinden kilonuzu giriniz: ");
        kilo = input.nextDouble();

        index = (kilo / (boy * boy));
        System.out.printf("%.2f\n", index);
    }
}

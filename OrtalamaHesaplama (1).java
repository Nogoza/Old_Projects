package Kosullu_ifadeler;
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        int total = 0, dersSayisi = 0;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (0 <= mat && mat <= 100) {
            total += mat;
            dersSayisi++;
        }
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if (0 <= fizik && fizik <= 100) {
            total += fizik;
            dersSayisi++;
        }
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        if (0 <= turkce && turkce <= 100) {
            total += turkce;
            dersSayisi++;
        }
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (0 <= kimya && kimya <= 100) {
            total += kimya;
            dersSayisi++;
        }
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if (0 <= muzik && muzik <= 100) {
            total += muzik;
            dersSayisi++;
        }
        int avarage = total/dersSayisi;
        if (avarage >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz <3 ");
        }else{
            System.out.print("Sınıfta Kaldınız! :(");
        }
        System.out.printf("Ortalama: %d",avarage);
    }
}

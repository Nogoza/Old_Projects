import java.util.Scanner;

public class Yolculuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, ytype;
        double fiyat, yfiyat, yyfiyat;

        // Kullanıcıdan veri alma
        System.out.print("Mesafeyi giriniz (km): ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Tek Yön (1) ya da Gidiş-Dönüş (2) seçiniz: ");
        ytype = input.nextInt();

        // Hatalı giriş kontrolü
        if (km <= 0 || yas < 0 || (ytype != 1 && ytype != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Mesafe başına ücret 0.10 TL
        fiyat = km * 0.10;

        // İndirim hesaplama
        if (yas < 12) {
            yfiyat = fiyat / 2;  // %50 indirim
        } else if (yas >= 12 && yas < 24) {
            yfiyat = fiyat * 0.9;  // %10 indirim
        } else if (yas >= 65) {
            yfiyat = fiyat * 0.7;  // %30 indirim
        } else {
            yfiyat = fiyat;
        }

        // Yolculuk tipi (gidiş-dönüş) için ek indirim
        if (ytype == 2) {
            yyfiyat = yfiyat * 0.8;  // %20 indirim
            System.out.println("Gidiş-Dönüş bilet fiyatı: " + yyfiyat + " TL");
        } else {
            System.out.println("Tek yön bilet fiyatı: " + yfiyat + " TL");
        }
    }
}
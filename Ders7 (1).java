package Derler1;
import java.util.Scanner;

public class Ders7 {
    public static void main(String[] args) {
       //Manav
       Scanner input = new Scanner(System.in);
       double pearPrice = 2.14,applePrice = 3.67, tomatoPrice = 1.11, bananaPrice  = 0.95, auberginePrice = 5.00;
       double pear,apple,tomato,banana,aubergine;
       System.out.print("Kaç kg armut aldınız: ");
       pear = input.nextDouble();
       System.out.print("Kaç kg elma aldınız: ");
       apple = input.nextDouble();
       System.out.print("Kaç kg domates aldınız: ");
       tomato = input.nextDouble();
       System.out.print("Kaç kg muz aldınız: ");
       banana = input.nextDouble();
       System.out.print("Kaç kg patlıcan aldınız: ");
       aubergine = input.nextDouble();

       double total = (pear * pearPrice) + (apple * applePrice) + (tomato * tomatoPrice) + (banana * bananaPrice) + (aubergine * auberginePrice);

       System.out.print("Toplam Tutar: " + total);

    }
}

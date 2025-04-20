package Kosullu_ifadeler;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,select;

        System.out.println("ilk Sayının Değerini Giriniz: ");
        a = input.nextInt();

        System.out.println("ikinci Sayının Değerini Giriniz: ");
        b = input.nextInt();

        System.out.println("Toplamak için 1 \n Çıkarmak için 2 \n Çarpmak için 3 \n Bölmek için 4");
        select = input.nextInt();

        int reply;

        switch (select) {
            case 1:
                reply = a + b;
                System.out.println("Toplama İşleminin Cevabı:" + reply);
                break;
            case 2:
                reply = a - b;
                System.out.println("Çıkarma İşleminin Cevabı: " + reply);
                break;
            case 3:
                reply = a * b;
                System.out.println("Çarpma İşleminin Cevabı: " + reply);
                break;
            case 4:
                if (b == 0){
                    System.out.println("Payda 0 olamaz");
                }else{
                    reply = a / b;
                    System.out.println("Bölme İşleminin Cevabı: " + reply);
                    break;
                }
            default:
                System.out.println("incorrect select");
        }
    }
}
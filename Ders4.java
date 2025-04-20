package Derler1;
import java.util.Scanner;

public class Ders4 {
    public static void main(String[] args) {
        //Taksimetre Ücret Hesaplama
        Scanner input = new Scanner(System.in);
        int km;
        double price = 10;

        System.out.print("Kaç Km gidildiğini yazınız: ");
        km = input.nextInt();
        price += km * 2.20;

        if (price <= 20)
        {
            price = 20;
        }

        System.out.print("Totap price: " + price);

    }
}

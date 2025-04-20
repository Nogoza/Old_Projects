package Kosullu_ifadeler;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter year: ");
        year = input.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Artik Yil");
        }
        else {
            System.out.println("Artik Yil Değil");
        }
    }
}

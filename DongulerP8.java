package Donguler;
//Scanner Kütüphanesini Tanımladık
import java.util.Scanner;

public class DongulerP8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = input.nextInt();

        int sum = 0;
        /*
        girilen sayı 987 olsun
        987 % 10 = 7
        987 / 10 = 98
        döngü başa döner
        98 % 10 = 8
        98 / 10 = 9
        döngü başa döner
        9 % 10 = 9
        9 / 10 = 0 olur
        sum = 7 + 8 + 9 = 24
        */
        while(number!=0){
            sum += number%10;
            number/=10;
        }
        System.out.println(sum);

    }
}

package Donguler;
import java.util.Scanner;

public class DongulerP15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Toplan Kaç Sayı Giriniz: ");
        int n = input.nextInt();

        int num;
        int min = 0;
        int max = 0;

        for(int i = 1; i <= n; i++){
            System.out.print(i + ".Sayıyı Giriniz: ");
            num = input.nextInt();

            if(i == 1){
                min = num;
                max = num;
            }else{
                if(num > max){
                    max = num;
                }
                if(num < min){
                    min = num;
                }
            }
        }
        System.out.println("Max Değer: " + max);
        System.out.print("Min Değer: " + min);

        input.close();
    }
}

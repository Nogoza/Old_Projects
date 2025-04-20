package Donguler;
import java.util.Scanner;

public class DongulerP16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int sum = 0;

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println(sum + " Mükemmel Sayıdır.");
        }else{
            System.out.print(sum + " Mükemmel Sayı Değğildir.");
        }

    }
}

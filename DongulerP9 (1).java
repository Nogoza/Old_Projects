package Donguler;
import java.util.Scanner;

public class DongulerP9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        double sum = 0;
        for(double i = 1; i<=number; i++) {
            sum += (1/i);
        }
        System.out.println(sum);
    }
}

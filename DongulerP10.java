package Donguler;
import java.util.Scanner;

public class DongulerP10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println("");
            for(int k = 0; k <= (number-i); k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2 * i) - 1;j++){
                System.out.print("*");

                }

            }
        }
    }


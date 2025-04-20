package Donguler;
import java.util.Scanner;

public class DongulerP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,sum = 0;
        do{
            System.out.print("Enter Number: ");
            k = input.nextInt();
            if(k % 2 != 0){
                break;
            }
            if(k % 4 == 0){
               sum += k;
            }
        }while(k % 2 == 0);
        System.out.println("Toplam: " + sum);
    }
}

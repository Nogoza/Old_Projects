package Donguler;
import java.util.Scanner;
public class DongulerP1 {
    public static void main(String[] args) {
        int k,sum=0,count=0,average;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        k = input.nextInt();
        for(int i = 0; i<=k; i++){
            if(i%3== 0 && i%4 == 0){
                System.out.println("i Değeri: " + i);
                sum+=i;
                count++;
            }
        }
        System.out.println("Toplam: " + sum);
        average = sum / count;
        System.out.print("Ortalama: " + average);

    }
}

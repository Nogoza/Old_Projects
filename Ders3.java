package Derler1;
import java.util.Scanner;

public class Ders3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("A değeri Gir: ");
        a = input.nextInt();
        System.out.print("B Değeri Gir: ");
        b = input.nextInt();
        System.out.print("C Değeri Gir: ");
        c = input.nextInt();

        double u = (a+b+c)/2.0;

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(alan);
    }
}

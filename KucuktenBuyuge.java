package Kosullu_ifadeler;
import java.util.Scanner;

public class KucuktenBuyuge
{
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        b = input.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        c = input.nextInt();

        if (a < b && a < c)
        {
            if (b < c)
            {
                System.out.print("A < B < C \n" + a + " < " + b + " < " + c);
            }
            else
            {
                System.out.print("A < C < B \n" + a + " < " + c + " < " + b);
            }
        }
        else if (b < a && b < c)
        {
            if (a < c)
            {
                System.out.print("B < A < C \n" + b + " < " + a + " < " + c);
            }
            else
            {
                System.out.print("B < C < A \n" + b + " < " + c + " < " + a);
            }
        }
        else
        {
            if (a < b)
            {
                System.out.print("C < A < B \n" + c + " < " + a + " < " + b);
            }
            else
            {
                System.out.print("C < B < A \n" + c + " < " + b + " < " + a);
            }
        }
    }
}

package Derler1;

import java.util.Scanner;

public class Ders5 {
    public static void main(String[] args)
    {
        //dairenin alanını ve çavresini hesaplama
        int radius;
        double area, perimeter, pi = 3.14, merkezAci, dilim;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap Değerini Giriniz: ");
        radius = input.nextInt();

        System.out.print("Merkez Açı Değerini Giriniz: ");
        merkezAci = input.nextInt();

        //Alanı Hesaplama
        area = pi * radius * radius;
        //Çevre Hesaplama
        perimeter = 2 * pi *radius;
        //Daire Dilim ALanı Bulma
        dilim = (pi * (radius * radius) * merkezAci) / 360;
        System.out.print("Daire Diliminin Alanı: " + dilim);
    }
}

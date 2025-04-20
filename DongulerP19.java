package Donguler;

public class DongulerP19 {
    public static void main(String[] args){
        int n = 10; //eleman sayısı
        int a = 0, b = 1;
        System.out.print("10 Elemanlı Fibonacci Serisi: ");
        System.out.print(a + " " + b + " ");

        for(int i = 1; i <= n; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

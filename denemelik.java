package Dongusel_ifadeler;

public class denemelik {
    public static void main(String[] args) {
        int i = 1;
        int k;

        while (i <= 5) {
            System.out.println(i);

            k = 1;
            while (k <= 10) {
                System.out.print(i + "," + k + "---");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}

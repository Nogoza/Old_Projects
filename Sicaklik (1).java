package Kosullu_ifadeler;
import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Öneri: Kayak");
        }else if (heat >= 5 && heat < 15){
            System.out.print("Öneri: Sinema");
        }else if ((heat >= 15) && (heat < 25)){
            System.out.print("Öneri: Piknik");
        }else if (heat >= 25 ){
            System.out.print("Öneri: Yüzme");
        }

    }
}





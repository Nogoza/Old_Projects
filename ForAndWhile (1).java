package DersDisi;
import java.util.Scanner;

public class ForAndWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        /*
        for(boolean run = true; run;){
            System.out.print("Enter number: ");
            int number = input.nextInt();

            if(number < 0){
                run = false;
                System.out.println("Number is negative");
            }
            else{System.out.println("the entered number is positive");}
        }*/
        // Do While ile yapımı

        do{
            System.out.print("Enter number: ");
            number = input.nextInt();
        }while(number > 0);System.out.print("number is negative");


    }
}

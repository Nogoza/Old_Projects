package Donguler;
import java.util.Scanner;

public class DongulerP12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int userChoice;
        int money;
        while(right >0){
            System.out.print("Enter the user name: ");
            String userName = input.nextLine();
            System.out.print("Enter the password: ");
            String password = input.nextLine();
            if(userName.equals("Tarık") && password.equals("168910")){
                System.out.println("Welcome to Patika Bank!");
                do{
                    System.out.println("Select the action you want to perform.");
                    System.out.println("1-Deposit money \n2-Withdraw money \n3-Check balance \n4-Exit");
                    System.out.print("Enter your choice : ");
                    userChoice = input.nextInt();

                    if(userChoice == 1){
                        do{
                            System.out.print("Çekmek istediğiniz ücreti giriniz: ");
                            money = input.nextInt();
                            if (money < 0 || money > balance){
                                System.out.println("---" +  money + " Bakiyeniz Bulunmamakta" + "---" +  "\n---" + "Bakiyeniz: " + balance +  "---");
                            }
                        }while(money < 0 || money > balance);


                        balance -= money;
                        System.out.println("Kalan Bakiye: " + balance);
                    }
                    else if(userChoice == 2){
                        System.out.print("Yatırmak istediğiniz ücreti giriniz: ");
                        money = input.nextInt();
                        balance += money;
                        System.out.print("Kalan Bakiye: " + balance);
                    }
                    else if(userChoice == 3){
                        System.out.print("Balance: " + balance);
                    }

                }while(userChoice != 4);
                break;

            }else{
                right--;
                System.out.println("Wrong password!");
                if(right == 0){
                    System.out.println("Username or password was entered incorrectly 3 times. Your account has been blocked.");
                }else{
                    System.out.println("You have " + right + " attempts left to log in.");
                }
            }
        }
    }
}
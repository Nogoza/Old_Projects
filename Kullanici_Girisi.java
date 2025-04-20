package Kosullu_ifadeler;
import java.util.Scanner;

public class Kullanici_Girisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password,newPassword;
        int newP;
        System.out.print("Enter your Username: ");
        userName = input.nextLine();
        System.out.print("Enter your Password: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("login succesful");
        }else{
            System.out.print("login failed");
            System.out.print("Would you like to change your password? (Yes:1/No:2)");
            newP = input.nextInt();
            input.nextLine();

            if (newP == 1) {
                System.out.print("Create new password: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("new password cannot be the same as old password");
                }else{
                    System.out.print("new password saved successfully");
                }
            }
        }
    }
}

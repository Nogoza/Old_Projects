package Donguler;
import java.util.Scanner;

public class DongulerP13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 3000;
        int userChoice;
        int money;

        while(right > 0){
            System.out.print("Kullanıcı Adı Giriniz: ");
            String userName = input.nextLine();
            System.out.print("Şifre Giriniz: ");
            String password = input.nextLine();

            if(userName.equals("T") && password.equals("1")){
                System.out.println("Sisteme Başaralı Giriş \n");
                do {
                    System.out.println("1-Para Çekme \n2-Para Yatırma \n3-Bakiye Kontrol \n4-Çıkış\n");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    userChoice = input.nextInt();

                    switch (userChoice) {
                        case 1:
                            System.out.print("Bakiyeniz " + balance + " TL\n" + "Çekmek istediğiniz para miktarını giriniz: ");
                            money = input.nextInt();
                            if (money <= balance && money > 0) {
                                balance -= money;
                                System.out.println(money + " TL Çekildi. \nKalan Bakiye: " + balance);
                            } else {
                                System.out.println("Para Tutarı Geçersiz.\n");
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz Para Tutarını Giriniz: \n");
                            money = input.nextInt();
                            if(money < 0){
                                System.out.print("Hatalı Para Girişi.");
                            }
                            balance += money;
                            System.out.println("Güncel Bakiye: " + balance);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " TL");
                            break;
                        case 4:
                            System.out.print("Sistemden Çıkılıyor...");
                            right = 0;
                            break;
                            default:
                                System.out.print("Hatalı Giriş.");
                    }
                }while (userChoice != 4);
                }else{
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Parolası");
                if(right == 0){
                    System.out.println("Hesabınız Bloke Edilmiştir.");
                }else{
                    System.out.println(right + " Deneme Hakkınız Kaldı.");
                }
            }
        }


    }
}

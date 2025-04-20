package Kosullu_ifadeler;
import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Doğduğunuz Ay (Sayı): ");
        a = input.nextInt();
        System.out.print("Doğduğunuz Gün: ");
        b = input.nextInt();

        if (a == 1) {
            if (b >= 1 && b <= 31) {
                if (b < 22) {
                    System.out.print("Burcunuz: Oğlak");
                } else {
                    System.out.print("Burcunuz: Kova");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 2) {
            if (b >= 1 && b <= 29) { // Artık yıl için 29 gün olmalı
                if (b < 20) {
                    System.out.print("Burcunuz: Kova");
                } else {
                    System.out.print("Burcunuz: Balık");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 3) {
            if (b >= 1 && b <= 31) {
                if (b < 21) {
                    System.out.print("Burcunuz: Balık");
                } else {
                    System.out.print("Burcunuz: Koç");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 4) {
            if (b >= 1 && b <= 30) {
                if (b < 21) {
                    System.out.print("Burcunuz: Koç");
                } else {
                    System.out.print("Burcunuz: Boğa");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 5) {
            if (b >= 1 && b <= 31) {
                if (b < 22) {
                    System.out.print("Burcunuz: Boğa");
                } else {
                    System.out.print("Burcunuz: İkizler");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 6) {
            if (b >= 1 && b <= 30) {
                if (b < 23) {
                    System.out.print("Burcunuz: İkizler");
                } else {
                    System.out.print("Burcunuz: Yengeç");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 7) {
            if (b >= 1 && b <= 31) {
                if (b < 23) {
                    System.out.print("Burcunuz: Yengeç");
                } else {
                    System.out.print("Burcunuz: Aslan");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 8) {
            if (b >= 1 && b <= 31) {
                if (b < 23) {
                    System.out.print("Burcunuz: Aslan");
                } else {
                    System.out.print("Burcunuz: Başak");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 9) {
            if (b >= 1 && b <= 30) {
                if (b < 23) {
                    System.out.print("Burcunuz: Başak");
                } else {
                    System.out.print("Burcunuz: Terazi");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 10) {
            if (b >= 1 && b <= 31) {
                if (b < 23) {
                    System.out.print("Burcunuz: Terazi");
                } else {
                    System.out.print("Burcunuz: Akrep");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 11) {
            if (b >= 1 && b <= 30) {
                if (b < 22) {
                    System.out.print("Burcunuz: Akrep");
                } else {
                    System.out.print("Burcunuz: Yay");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else if (a == 12) {
            if (b >= 1 && b <= 31) {
                if (b < 22) {
                    System.out.print("Burcunuz: Yay");
                } else {
                    System.out.print("Burcunuz: Oğlak");
                }
            } else {
                System.out.print("Geçersiz Gün");
            }
        } else {
            System.out.print("Geçersiz Ay");
        }
    }
}
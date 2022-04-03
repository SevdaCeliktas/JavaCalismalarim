package day03_java;

import java.util.Scanner;

public class UcusProjesi {
    public static void main(String[] args) {

        /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500 km, C şehrine 700 km, D şehrine 900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    Yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    Bilet gidis donus alinirsa 20% indirim uygulayan bi app create ediniz.
                                                                          */

        Scanner scan = new Scanner(System.in);
        System.out.print("JavaAirlines havayoluna hosgeldiniz \n B \n C \n D \n sehirlerinden birini seciniz : ");
        String sehir = scan.next().toUpperCase();
        System.out.print("Lutfen tek yöne gidecekseniz 1 i \ncift yöne gidecekseniz 2 yi seciniz : ");
        int secim = scan.nextInt();
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();
        double sehirB = 0.10 * 500;
        double sehirC = 0.10 * 700;
        double sehirD = 0.10 * 900;

        if (sehir.equals("B") || sehir.equals("C") || sehir.equals("D")){
        if (yas > 65) {
            if (sehir.equals("B")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirB * 0.70 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirB * 0.70 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            } else if (sehir.equals("C")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirC * 0.70 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirC * 0.70 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            } else if (sehir.equals("D")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirD * 0.70 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirD * 0.70 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            }
        }else if(yas<12) {
            if (sehir.equals("B")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirB * 0.50 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirB * 0.50 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            } else if (sehir.equals("C")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirC * 0.50 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirC * 0.50 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            } else if (sehir.equals("D")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirD * 0.50 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirD * 0.50 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }

        }
        } else if(yas>=12 && yas<24) {
            if (sehir.equals("B")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirB * 0.90 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirB * 0.90 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            } else if (sehir.equals("C")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirC * 0.90 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirC * 0.90 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            } else if (sehir.equals("D")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirD * 0.90 + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirD * 0.90 * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            }
    } else if (yas>=24 && yas<=65) {
            if (sehir.equals("B")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirB + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirB * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            } else if (sehir.equals("C")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirC + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirC * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            } else if (sehir.equals("D")) {
                if (secim == 1) {
                    System.out.println("Bilet ücretiniz: " + sehirD + "$");
                } else if (secim == 2) {
                    System.out.println("Bilet ücretiniz: " + (sehirD * 0.80)*2 + "$");
                } else {
                    System.out.println("Hatali giris yaptiniz");
                }
            }
        }
        } else {
            System.out.println("O sehre ucusumuz yoktur.");
        }
}
}

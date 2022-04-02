package day05_java;

import java.util.Scanner;

public class KarelerToplami {
    public static void main(String[] args) {
/*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den, girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=14
     */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = 1; i < sayi; i++) {

            toplam += i*i;

        }
        System.out.println("Sayıların kareleri toplamı: " + toplam);

    }
}



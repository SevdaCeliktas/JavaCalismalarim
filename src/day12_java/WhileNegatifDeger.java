package day12_java;

import java.util.Scanner;

public class WhileNegatifDeger {

    /*
    Negatif bir deger girilene kadar kullanicidan girisleri kabul eden ve girilen degerlerden tek sayilari toplayan
    bir while dongusu olusturunuz.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

       while(true) {
           System.out.print("Lutfen bir sayi giriniz : ");
           int sayi = scan.nextInt();

           if (sayi < 0) {
               System.out.println("Girilen sayi negatiftir");
               break;
           }

           if (sayi % 2 == 1) {
               toplam += sayi;
           }

       }
        System.out.println("Girilen tek sayilarin toplami : " + toplam);














    }

}

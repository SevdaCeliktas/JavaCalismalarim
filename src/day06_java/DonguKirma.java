package day06_java;

import java.util.Scanner;

public class DonguKirma {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        Ama  c harfine  gelirse döngüden çıkılsın.

        Bugün hava oldukca güzel> 2
         str.CharAt(0)

         */
        int aMiktar = 0;
        Scanner scan = new Scanner (System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a'){   // i bütün str deki harflere bakar.
                aMiktar++;
            } else if (str.toLowerCase().charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("aMiktar : " + aMiktar);


    }
}

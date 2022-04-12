package day13_java;

import java.util.Scanner;

public class StringiTerstenYazdirma {

   // Kullanicidan alacaginiz Stringi ters cevirmek icin bir java programi yazin.

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String str = scan.nextLine();

        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));

        }

    }
}

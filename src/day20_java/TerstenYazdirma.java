package day20_java;

import java.util.Scanner;

public class TerstenYazdirma {
    public static void main(String[] args) {

        // TASK : Kullanicidan 5 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 harfli bir kelime giriniz : ");
        String kelime = scan.nextLine();

        if(kelime.length() != 5 ) {
            System.out.println("Lutfen 5 harflik bir kelime giriniz. ");
        }else {
            System.out.print(kelime.substring(4));
            System.out.print(kelime.substring(3,4));
            System.out.print(kelime.substring(2,3));
            System.out.print(kelime.substring(1,2));
            System.out.print(kelime.substring(0,1));
        }

    }
}

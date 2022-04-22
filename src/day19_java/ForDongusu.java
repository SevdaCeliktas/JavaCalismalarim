package day19_java;

import java.util.Scanner;

public class ForDongusu {

    public static void main(String[] args) {

      /*
        Kullanıcıdan 5 adet sayı isteyiniz.
        Bu sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını bulunuz.
                                                                                     */

        Scanner scan = new Scanner(System.in);

        int toplam=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Lutfen 5 tane sayi giriniz : ");
            int sayi = scan.nextInt();

            if (sayi>5 && sayi<10){
                continue;
            }
            toplam+=sayi;
        }
        System.out.println("Sayilarin toplami : " + toplam);

    }
}

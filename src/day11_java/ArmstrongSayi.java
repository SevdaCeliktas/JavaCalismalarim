package day11_java;

import java.util.Scanner;

public class ArmstrongSayi {

    /*
    Armstrong sayi: Herhangi bir 3 basamakli sayinin rakamlarinin küpleri toplami o sayiyi veriyorsa sayi Armstrong sayidir.
    (0,1,153,370,371,407)
    153= 1*1*1 5*5*5 3*3*3 = 153
    370= 3*3*3 7*7*7 0*0*0 = 370
                                       */

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        armstrong(sayi);

    }

    private static void armstrong(int sayi) {
        int girilenSayi = sayi;
        int basamaktakiSayi= 0;
        int sayininKupleritoplami= 0;

        while(sayi>0) {
            basamaktakiSayi = sayi % 10;
            sayininKupleritoplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            sayi = sayi / 10;
        }

        if(girilenSayi==sayininKupleritoplami) {
            System.out.println(girilenSayi + " armstrong sayidir.");
        }else{
            System.out.println(girilenSayi + " armstrong sayi degildir.");
        }



    }
}

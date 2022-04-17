package day17_java;

public class ForDongusu {
    public static void main(String[] args) {

       /*
       0 dan 20 ye kadar olan tek ve cift sayıları for döngüsü ile yazdırınız.
        */

        for (int i = 1; i <20 ; i+=2) {
            System.out.print(i+ " ");
        }
        System.out.println();

        for (int i = 0; i <20 ; i+=2) {
            System.out.print(i+ " ");
        }


    }
}

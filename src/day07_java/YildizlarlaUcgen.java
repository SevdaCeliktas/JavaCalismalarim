package day07_java;

public class YildizlarlaUcgen {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

                */
        // Yıldızlarla yukaridaki sekli olusturunuz.
        // Not:Ucgen sekli vermek icin inner loop'un end pointini outher degiskenine bagli yapariz.

            int input =5 ;

        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 1; i <=input-1 ; i++) {
            for (int j = 1; j <=input-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

package day02_java;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        //Kullanıcıdan alacagınız bir tamsayinin faktoriyelini bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayi giriniz : ");
        int sayi = scan.nextInt();

        int faktoriyel = 1;
        for (int i = sayi; i>= 1 ; i--) {
            faktoriyel *= i;   // bu satıra dikkat
        }
        System.out.println(sayi + "! = " + faktoriyel);


    }

}


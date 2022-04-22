package day01_java;

import java.util.Scanner;

public class PalindromMethodlu {
    public static void main(String[] args) {

        //Kullanıcıdan bir String isteyin.
        //Kullanıcının girdiği Stringin palindrom olup olmadığını kontrol eden bir method yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String kelime = scan.nextLine();
        palindromKontrolEt(kelime);

    }

    public static void palindromKontrolEt(String kelime) {


        String tersKelime = "";
        for (int i = kelime.length()-1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }
        System.out.println("Kelimenin tersten yazılışı : " + tersKelime);

        if (kelime.equalsIgnoreCase(tersKelime)) {
            System.out.println("Bu kelime palindromdur.");
        } else {
            System.out.println("Bu kelime palindrom değildir.");
        }

    }
}

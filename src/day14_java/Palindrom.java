package day14_java;

import java.util.Scanner;

public class Palindrom {

    //Kullanicidan alacaginiz String bir ifadenin palindrom olup olmadigini yazdirin.

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir String ifade yaziniz : ");
        String str = scan.nextLine();

        String tersStr = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr += str.charAt(i);
        }
        if (tersStr.equalsIgnoreCase(str)){
            System.out.println("Girdiginiz ifade bir palindromdur.");
        }else {
            System.out.println("Girdiginiz ifade palindrom degildir.");
        }








    }
}

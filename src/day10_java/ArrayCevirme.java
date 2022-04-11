package day10_java;

import java.util.Arrays;

public class ArrayCevirme {
    public static void main(String[] args) {

        //HeySiri String'ini ByeSiri ye cevirip array seklinde yazdirin.

        String str = "HeySiri";
        str= str.replaceAll("Hey", "Bye");
        String arr[] = new String[1];    // Bir elemanli bi array olusturduk.
        arr [0] = str;

        System.out.println(Arrays.toString(arr));




    }
}

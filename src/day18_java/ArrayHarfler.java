package day18_java;

import java.util.Arrays;

public class ArrayHarfler {
    public static void main(String[] args) {

char[] alfabe = new char[26];

        char harf ='z';

        for (int i = 0; i < alfabe.length ; i++, harf--) {    // ileri dogru ++
           alfabe[i] = harf;
        }
        System.out.println(Arrays.toString(alfabe));


    }
}

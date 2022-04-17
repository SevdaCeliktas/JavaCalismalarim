package day16_java;
import java.util.Arrays;

public class ArraysYazdirma {
    public static void main(String[] args) {

        // String icinde verilen elemanları sort methodu ile sıralayın ve yazdırın.

        String arr [] = {"A", "F" , "T" , "B" , "H", "U", "Z"};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));







    }
}

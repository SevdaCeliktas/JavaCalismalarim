package day09_java;

import java.util.Arrays;

public class ArrayOrtalama {
    public static void main(String[] args) {

        // Dizi elemanlarinin ortalama degerini hesaplayan ve ortalamadan büyük olan elemanlari yazdıran bir java programi yazin.
        // Input[] = {1,2,3,4,5,6,7}
        // Output = 4
        
        
        int arr[] = {1,2,3,4,5,6,7};
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
          toplam += arr[i];
        }
        double ortalama = toplam/ arr.length;
        System.out.println("Elemanlarin ortalamasi : " + ortalama);

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > ortalama) {
                System.out.println("Ortalamadan büyük olan elemanlar : " + arr[i] + " ");
            }
        }
    }
}

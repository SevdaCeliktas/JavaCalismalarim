package day15_java;

import java.util.ArrayList;

public class ArrayListRenkler {
    public static void main(String[] args) {

        /*
       Stringlerden olusan bir Arraylist olusturun. Bu liste "Red, Green, Blue, Yellow, Black" ekleyin. Hiçbiri ayni
        satırda olmayacak sekilde bütün elementleri yazdirin. listeye yeni girecek bir elemani method olusturarak
        ilk siraya ekleyin. Yeniden bir method olusturun ve ekleyeceginiz eleman sondan bir önceki sırada yer alsın.
                                                                                                                 */

        ArrayList<String> renkler = new ArrayList<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Yellow");
        renkler.add("Black");

        for (int i = 0; i < renkler.size() ; i++) {
            System.out.println(renkler.get(i));       //Listede bir elemana get methodu ile ulasırız.
        }
        ilkIndexEkle(renkler, "White");
        sonIndextenOnceEkle(renkler, "Pink");

    }

    private static void sonIndextenOnceEkle(ArrayList<String> renkler, String pink) {
        renkler.add(renkler.size()-1, "Pink");  //Son eleman black in yerine gelir.
        System.out.println(renkler);
    }

    private static void ilkIndexEkle(ArrayList<String> renkler, String White) {
        renkler.add(0,White);
        System.out.println(renkler);
    }
}

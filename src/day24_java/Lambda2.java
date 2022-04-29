package day24_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {

        //Listin tek elemanlarinin karelerini kücükten büyüğe tekrarsiz olarak sıralayın.

        List<Integer> tekSayiSirala = new ArrayList<>(Arrays.asList(1,5,3,6,8,0,7,1,9,2,7,5,3));

        tekSayiSirala.
                stream().  // akışı al
                filter(t-> t%2==1).  // tek sayıları bul
                distinct().   // tekrar edenleri cıkar
                map(t-> t*t).   // karelerini al
                sorted().    // kücükten büyüge sırala
                forEach(t-> System.out.print(t+ " "));   // yazdır


    }
}

package day25_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda3 {

    public static void main(String[] args) {

        //List elemanlarini alfabetik büyük harf, sıralı ve tekrarsiz olarak yazdirin.

        List<String> menu = new ArrayList<>(Arrays.asList("borek","browni","dondurma","pasta","keskul","browni","corek","sutlac"));


        menu.
                stream().
                //map(String::toUpperCase).
                map(t-> t.toUpperCase()).
                sorted().
                distinct().
                forEach(t->System.out.print(t + " "));
    }
}

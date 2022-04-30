package day26_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda4 {

    public static void main(String[] args) {

        //List elemanlarinin karakterlerinden cift sayili olanlarin karelerini hesaplayip tekrarsiz olarak büyükten kücüge
        //siralayarak yazdiriniz.

        List<String> menu = new ArrayList<>(Arrays.asList("borek","browni","dondurma","pasta","keskul","browni","corek","sutlac"));

        menu.
                stream().
                filter(t->t.length()%2==0).
                map(t-> t.length()*t.length()).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t+ " "));

    }
}

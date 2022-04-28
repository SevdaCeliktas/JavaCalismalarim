package day22_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCalisma {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("A", "C", "E", "F"));

        System.out.println(harfler);

        harfler.add("B");
        System.out.println(harfler);

        harfler.add(1,"L");
        System.out.println(harfler);

        harfler.set(3,"D");
        System.out.println(harfler);

        harfler.remove("F");
        System.out.println(harfler);

        Collections.sort(harfler);
        System.out.println(harfler);

        System.out.println(harfler.contains("L"));
        System.out.println(harfler.contains("M"));

        System.out.println(harfler.size());

        harfler.clear();
        System.out.println(harfler.isEmpty());
        System.out.println(harfler.size());




    }
}

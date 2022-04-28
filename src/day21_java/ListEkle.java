package day21_java;

import java.util.ArrayList;
import java.util.List;

public class ListEkle {
    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>();

        renkler.add("yellow");
        renkler.add("pink");
        renkler.add("purple");
        renkler.add("orange");
        renkler.add("black");
        renkler.add("red");
        renkler.add("white");
        renkler.add("blue");
        renkler.add("green");

        System.out.println(renkler);
        System.out.println("Uzunluk : " + renkler.size());


    }
}

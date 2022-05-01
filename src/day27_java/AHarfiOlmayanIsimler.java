package day27_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AHarfiOlmayanIsimler {

    public static void main(String[] args) {

        //Input olarak verilen listteki isimlerden icinde 'a' harfi bulunanlari silen bir code create ediniz.

        //Input : List = {"Ali", "Veli", "Ayse", "Fatma", "Tugba", "Tugce"}
        //Output : [Veli, Tugce]

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Tugba", "Tugce"));
        List<String> aHarfiOlmayanIsimler = new ArrayList<>();

        for(String w: isimler) {
         if (!w.toLowerCase().contains("a")){
             aHarfiOlmayanIsimler.add(w);
         }
        }
        System.out.println(aHarfiOlmayanIsimler);

    }
}

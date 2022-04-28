package day23_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {

   //functional Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak yaziniz.

   public static void main(String[] args) {


      List<Integer> sayilar = new ArrayList<>(Arrays.asList(3, 4, 5, 8, 7, 6, 1, 0, 9, 6, 8, 4));


      sayilar.
              stream().
              filter(t -> t % 2 == 0).
              distinct().
              forEach(t -> System.out.print(t + " "));


   }
}





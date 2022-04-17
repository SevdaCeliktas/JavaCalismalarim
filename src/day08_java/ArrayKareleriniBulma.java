package day08_java;

import java.util.Arrays;

public class ArrayKareleriniBulma {

    public static void main(String[] args) {

        //Verilen bi int dizisi icin elemanlarin karelerini bulunuz.
        // Example: {2,6,4,5,8,9}
        //Output: {4,36,16,25,64,81}

                int arr[] = {2,6,4,5,8,9};
                for (int i = 0; i < arr.length ; i++) {
                    arr[i] *=  arr[i];
                    //arr[i] =  arr[i]* arr[i];
                }
                System.out.println("Elemanlarin karesi : " + Arrays.toString(arr));

            }
        }



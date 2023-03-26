package org.example;

import java.util.Arrays;
import java.util.Collections;

public class NewClass {

    public static void main(String[] args) {
        System.out.println("New Class");

        int[] arr = new int[]{1, 2, 3};

        int[] arr2 = {1, 2, 3};

        Integer[] arr3 = new Integer[3];
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;

//        Arrays.sort(arr3, Collections.reverseOrder());

//        Arrays.sort(arr3, (a, b) -> b - a);
//        System.out.println(Arrays.toString(arr3));
        
        int[] arr33 = new int[3];
//        System.out.println(arr33.length);
//        System.out.println(arr33[2]);
        System.out.println(Arrays.toString(arr33));


        for (int i = 0; i < arr33.length; ++i){
            arr33[i] = arr3[arr33.length -i-1];
        }

        System.out.println(Arrays.toString(arr33));

    }
}

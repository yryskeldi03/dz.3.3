package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] array = new int[]{-4, 42, 73, -1, 32, 53, 16, 216, 24, -5, 42, 74, 55, 36, 14};

        prinArray(array);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
            prinArray(array);
        }
    }
    private static void prinArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
        System.out.println();
    }
}

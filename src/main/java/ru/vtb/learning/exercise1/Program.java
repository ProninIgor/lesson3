package ru.vtb.learning.exercise1;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        SwapManager swapManager = new SwapManager();
        Integer[] integerArray = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        swapManager.Swap(integerArray, 0, 9);
        System.out.println(Arrays.toString(integerArray));

        String[] stringArray = new String[] {"0", "1", "2", "3", "4", "5", "6", "7","8", "9"};
        swapManager.Swap(stringArray, 5, 1);
        System.out.println(Arrays.toString(stringArray));
    }
}

package com.Vlad;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myArray = readIntegers(5);
        System.out.println("My new array is " + Arrays.toString(myArray));
        System.out.println("The smallest number in your array is " + findMin(myArray));
    }

    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[count];
        System.out.println("Enter " + count + " numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        return arr;
    }


    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}

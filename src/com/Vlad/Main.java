package com.Vlad;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myArray = readIntegers(5);
        System.out.println("Your new array is " + Arrays.toString(myArray));
        System.out.println("The smallest number in your array is " + findMin(myArray));
        System.out.println("Your reversed array is " + Arrays.toString(reverseArr(myArray)));
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

    public static int[] reverseArr(int[] arr) {
        int[] revArray = new int[arr.length];
        int x = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArray[x] = arr[i];
            x++;
        }
        return revArray;
    }

}

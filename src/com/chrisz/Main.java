package com.chrisz;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // Beggining of basic arrays
        int[] myVariable = new int[10]; // index 0 - 9 available
       // myVariable = new int[10];
        myVariable[5] = 50;

        int[] mySecondArray = {1,2,8,9};
        System.out.println(mySecondArray[1]);

        double[] myDoubleArray = new double[6];
        System.out.println(myVariable[5]);

        int[] loopArray = new int[8];
        for(int i = 0; i < loopArray.length; i++) {
            loopArray[i] = i*10;
            System.out.println("Index " + i + ": " + loopArray[i]);
        }

        //print(loopArray);
        //public static void print(int[] array) {
         //   for(int i = 0; i < array.length; i++) {
         //       System.out.println("Index " + i + ": " + array[i]);
         //   }
        //}


        // End of basic arrays

        //************* Take keyboard entries into array
        int[] myIntegers = getIntegers(5);
        for(int i=0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverege(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer valuves.\r"); // the \r is for next line
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverege(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}

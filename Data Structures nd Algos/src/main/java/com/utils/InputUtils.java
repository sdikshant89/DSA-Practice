package main.java.com.utils;

import java.util.Scanner;

public class InputUtils {
    public static Scanner input;
    // Used instead of constructor when we use static class variables
    static{
        input = new Scanner(System.in);
    }
    public static Integer[] inputIntArray(){
        System.out.println("Input the number of elements in array");
        Integer length_arr = (Integer) input.nextInt();
        Integer[] arr = new Integer[length_arr];
        System.out.println("Input numbers of array");
        for(int i=0;i<length_arr;i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static int inputNumber(){
        System.out.println("Input the number:");
        return input.nextInt();
    }
}

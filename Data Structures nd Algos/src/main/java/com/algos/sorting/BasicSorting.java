package main.java.com.algos.sorting;

import main.java.com.utils.Utils;

import java.util.Arrays;

public class BasicSorting {

    public static Integer[] bubbleSort(Integer[] arr){
        Integer len = arr.length;
        if(len<=1){
            return arr;
        }
        for(Integer i=0;i<len-1;i++){
            for(Integer j=0; j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    Integer temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static Integer[] selectionSort(Integer[] arr){
        Integer len = arr.length;
        if(len<=1){
            return arr;
        }
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    Integer temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static Integer[] insertionSort(Integer[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && temp<arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = Utils.inputIntArray();
        System.out.println("Bubble sort:" + Arrays.toString(bubbleSort(arr)));
        System.out.println("Selection sort:" + Arrays.toString(selectionSort(arr)));
        System.out.println("Insertion sort:" + Arrays.toString(insertionSort(arr)));
    }
}

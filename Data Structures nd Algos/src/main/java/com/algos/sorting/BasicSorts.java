package main.java.com.algos.sorting;

import main.java.com.utils.InputUtils;

import java.util.Arrays;
import java.util.Collections;

public class BasicSorts {

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
            int min_pos = i;
            for(int j=i+1;j<len;j++){
                if(arr[min_pos] > arr[j]){
                    //Updating min position unless we get the smallest number
                    min_pos = j;
                }
            }
            //Swap i with wherever is the smallest element
            Integer temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
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

    public static Integer[] countSort(Integer[] arr){

        int min = Collections.min(Arrays.asList(arr));
        int max = Collections.max(Arrays.asList(arr));
        int range = max - min;
        int[] cntArr = new int[range + 1];
        Integer[] srtArr = new Integer[arr.length];
        for (Integer integer : arr) {
            cntArr[integer - min]++;
        }
        int newCounter = 0;
        for(int i=0;i<cntArr.length;i++){
            int count = cntArr[i];
            while(count!=0){
                srtArr[newCounter] = i+min;
                newCounter++;
                count--;
            }
        }
        return srtArr;
    }

    public static void main(String[] args) {
        Integer[] arr = InputUtils.inputIntArray();
        System.out.println("Bubble sort:" + Arrays.toString(bubbleSort(arr)));
        System.out.println("Selection sort:" + Arrays.toString(selectionSort(arr)));
        System.out.println("Insertion sort:" + Arrays.toString(insertionSort(arr)));
        System.out.println("Count sort:" + Arrays.toString(countSort(arr)));
    }
}

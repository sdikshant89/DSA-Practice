package main.java.com.algos.sorting;

import main.java.com.utils.InputUtils;

import java.util.Arrays;

public class CyclicSort {

    static Integer[] cyclicSort(Integer[] arr){
        Integer len = arr.length;

        for(int i=0;i<len-1;i++){
            if(arr[i]!=(i+1)){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }else{
                continue;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = InputUtils.inputIntArray();
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
}

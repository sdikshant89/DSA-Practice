package main.java.com.algos.binarySearch;

import main.java.com.utils.InputUtils;

import java.util.Arrays;

public class SourceCode {

    public static int binarySearch(Integer[] arr, int num){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == num){
                return mid + 1;
            }
            if(arr[mid]<num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int orderAgnosticBinarySearch(Integer[] arr, int num) {
        int start = 0, end = arr.length - 1;
        if (arr.length == 0) return -1;
        boolean isDescending = arr[start] > arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if (!isDescending) {
                if (num < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (num > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int start, int end, int num, Integer[] arr){
            int mid = (start+end)/2;
            if(arr[mid] == num){
                return mid + 1;
            }
            if(arr[mid]<num){
                return recursiveBinarySearch(mid+1, end, num, arr);
            }
            else if(arr[mid]>num){
                return recursiveBinarySearch(start, mid-1, num, arr);
            }else{
                return -1;
            }
    }

    public static void main(String[] args) {
        Integer[] newArr = InputUtils.inputIntArray();
        int numToFind = InputUtils.inputNumber();

        //int result = binarySearch(newArr, numToFind);
        int result = recursiveBinarySearch(0, newArr.length-1, numToFind, newArr);

        System.out.print("Element found at index: " + result);
    }
}

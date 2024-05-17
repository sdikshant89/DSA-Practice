package main.java.com.algos.binarySearch;

import java.util.Objects;
import java.util.Scanner;
/*
    This Program is implementation of a question in which, given a sorted array and a number,
    have to find the ceil and floor of the number in that array

    eg: given array is {1,5,6,7,8,9,10} and number is 3
    So the output should be ceil - 5 and floor - 1

    for Ceil we need a number from array which is >= the actual input number
    for Floor we need a number from array which is <= the actual input number
*/
public class FloorAndCeil {
    static Integer numb;
    static Scanner input;
    public static Integer[] getSortedArray(){
        input = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = input.nextInt();

        System.out.println("Enter number to find it's ceil and floor");
        numb = input.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("Enter sorted (ascending) array");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = getSortedArray();
        int start = 0, end = arr.length - 1;

        while(start<=end){
            int mid = start + end/2;

            if (Objects.equals(arr[mid], numb)){
                System.out.println("Ceil and Floor is" + numb.toString());
                break;
            }
            else if(arr[mid]>numb){
                end = mid - 1;
            }
            else if(arr[mid]<numb){
                start = mid+1;
            }
        }
        // If at the end we find the number itself, we're gonna return the same in both
        // In this case the start = end
        System.out.println("Ceil is" + arr[start]);
        System.out.println("Floor is" + arr[end]);
    }
}

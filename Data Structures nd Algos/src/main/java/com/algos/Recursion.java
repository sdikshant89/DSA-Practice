package main.java.com.algos;

public class Recursion {
    static boolean fib(int[] arr, int idx){
        if(idx<arr.length){
            if(arr[idx-1]<arr[idx]){
                return fib(arr, idx+1);
            }
            else{
                return false;
            }
        }
        return true;
    }

    static int checkFirstOccurrence(int[] arr, int elem, int idx){
        if(idx<arr.length){
            if(arr[idx] == elem){
                return idx;
            }else{
                return checkFirstOccurrence(arr, elem, idx+1);
            }
        }
        return -1;
    }

    // Try without the last parameter
    static int checkLastOccurrence(int[] arr, int elem, int idx, int found){
        if(idx<arr.length){
            if(arr[idx] == elem){
                return checkLastOccurrence(arr, elem, idx+1, idx);
            }else{
                return checkLastOccurrence(arr, elem, idx+1, found);
            }
        }
        return found;
    }

    // for area of 2*n and tile of size 2*1
    static int tilingProblem(int n){
        if(n == 0 || n==1){
            return 1;
        }
        //vertical case
        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,12,5,6,7,12,8,9};
        //System.out.println(fib(arr,1));
        //System.out.println(checkFirstOccurrence(arr, 12, 0));
        //System.out.println(checkLastOccurrence(arr, 12, 0, -1));
    }
}

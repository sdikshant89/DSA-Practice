package main.java.com.basics;

import java.util.*;

public class TrialndError {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        double con = 0, pow = num.length;
        for(int i=0;i<num.length;i++){
            con = con + (num[i] * Math.pow(10, pow-1));
            pow --;
        }
        con = con+k;
        int abc = (int) con;
        List<Integer> lst = new ArrayList<Integer>();
        while(con>0){
            int rem = (int) con%10;
            lst.add(0, rem);
            con = con/10;
        }
        return lst;
    }
    public Integer[] removeDuplicates(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        Integer constt = nums[0];
        arr[0] = constt;
        Integer arr_ind = 1;
        for(int i=1;i<nums.length;i++){
            if(Objects.equals(constt, nums[i])){
                continue;
            }else{
                arr[arr_ind] = nums[i];
                arr_ind++;
                constt = nums[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        List<Integer> arr = addToArrayForm(num, 1);
    }
}

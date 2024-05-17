package main.java.com.basics;

import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        List<Integer> arr = addToArrayForm(num, 1);
    }
}

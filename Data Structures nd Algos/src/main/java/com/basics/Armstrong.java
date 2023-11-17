package main.java.com.basics;

import java.util.Scanner;

/*
    If we take the sum of cube of each digit in a number and
    if the sum is same as that of the number then the number is armstrong
*/
@SuppressWarnings({"WrapperTypeMayBePrimitive", "ReassignedVariable"})
public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        Integer d = input.nextInt();
        Integer n = d, sum = 0;

        while(n>0){
            Integer rem = n%10;
            sum = (int) (sum + Math.pow(rem,3));
            n = n/10;
        }
        System.out.println(sum.equals(d));
    }
}

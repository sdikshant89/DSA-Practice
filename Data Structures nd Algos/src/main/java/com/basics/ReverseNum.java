package main.java.com.basics;

import java.util.Scanner;

@SuppressWarnings({"WrapperTypeMayBePrimitive", "ReassignedVariable"})
public class ReverseNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        Integer d = input.nextInt();
        Integer ans = 0;

        while(d>0){
            Integer rem = d % 10;
            ans = (ans * 10) + rem;
            d = d/10;
        }
        System.out.println(ans);
    }
}

package main.java.com.basics;

import java.util.Scanner;

@SuppressWarnings({"WrapperTypeMayBePrimitive", "SpellCheckingInspection", "ReassignedVariable"})
public class NumberofDigitinNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        Integer d = input.nextInt();
        System.out.println("Enter digit to search");
        Integer numb = input.nextInt();
        Integer count = 0;

        while(d>0){
            Integer rem = d%10;
            if(rem.equals(numb)){
                count++;
            }
            d = d/10;
        }
        System.out.println(count);

    }
}

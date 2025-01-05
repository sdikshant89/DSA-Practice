package main.java.com.basics;

import main.java.com.utils.InputUtils;

public class Patterns {
    public static void printButterfly(int size){
        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(j<=count || j>=size-1-count){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            if(i>=(size-1)/2){
                count--;
            }else{
                count++;
            }
        }
    }

    public static void printFloydsTriangle(int size){
        int count = 5;
        int printNum = 1;
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print(printNum);
                printNum++;
            }
            count--;
            System.out.print("\n");
        }
    }

    public static void printRevTriangle(int size){
        int count = 4;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(count<=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            count--;
            System.out.print("\n");
        }
    }

    public static void printDiamond(int size){
        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(j<=(size/2)+count && j>=(size/2)-count){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            if(i>=(size-1)/2){
                count--;
            }else{
                count++;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int num = InputUtils.inputNumber();
        printDiamond(num);
    }
}

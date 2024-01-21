package main.java.com.basics;
import java.util.Arrays;
/*
    This class indicates the use of variable arguments for a function
    When we're not sure how many parameters to pass in a method, we can use this
    Variable args should be coming at the end of the parameter lists

    These arguments can be read like a list of arguments (which the function definition does)
    The function definition instead of reading them as separate parameters, reads the arguments as array of elements
*/
public class VarArgs {
    static String abc = "abc";
    public static void main(String[] args) {
        // Var Args with no vars
        fun();

        // Var Args just by one variable
        fun(1,2,3,4);

        // Multiple type var args
        fun(abc,1,2,3,4,5,4);
    }
    static void fun(Integer ...a){
        System.out.println("\n Method with 1 variable arg");
        System.out.println(Arrays.toString(a));
    }
    // Overloaded method
    static void fun(String x, Integer ...a){
        System.out.println("\n Method with 2 args");
        System.out.println(Arrays.toString(a));
        System.out.println(x);
    }
}

package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 5;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;


        }
        System.out.println(" Factorial of :" + " " + num + " = " + factorial);

    }
}
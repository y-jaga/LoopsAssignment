//Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series

package Code;
import java.util.*;
public class q5FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        System.out.println("enter num of terms:- ");
        int n = scn.nextInt();
        System.out.println("First " + n + " terms of Fibonacci series is:- ");
        for(int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

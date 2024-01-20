package Code;

import java.util.*;
public class q1NaturalNumSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a positive natural number: ");
        long n = scn.nextInt();

        long sumUpToN = n * (n + 1)/2;
        System.out.println("sum of natural numbers up to n is: \n" +sumUpToN);
    }
}

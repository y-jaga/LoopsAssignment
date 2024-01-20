package Code;

import java.util.*;
public class q2MultiplicationTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number:- ");
        int n = scn.nextInt();
        System.out.println("Multiplication table for " + n + " is:-");

        for(int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }
    }
}

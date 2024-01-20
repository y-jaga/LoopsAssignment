//Q3. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.

package Code;

import java.util.*;
public class q3GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter two numbers:- ");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int minNum = Math.min(n1, n2);


        System.out.println("The GCD of " + n1 + " and " + n2 + " is: ");
        for(int i = minNum; i >= 1; i--) {
            if(n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}

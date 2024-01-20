//Q4. Write a Java program to check if a given string is a palindrome or not using a loop.

package Code;
//import java.lang.*;
import java.util.*;
public class q4IsPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string:- ");
        String str = scn.nextLine();
        int len = str.length();
        boolean check = true; //means string is a palindrome

        for(int i = 0; i < (len - 1) / 2; i++) {
            if(str.charAt(i) != str.charAt(len - i - 1)) {
                System.out.println(str + " is not a palindrome");
                check = false;  //means string is not a palindrome
                break;
            }
        }
        if(check) System.out.println(str + " is a palindrome");
    }
}

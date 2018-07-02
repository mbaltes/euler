/* 
 * Project Euler Problem: 004
 * Link: Link: https://projecteuler.net/problem=4
 *
 * A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 * 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * Completed 2016/04/29 
 */

import java.util.*;

public class Euler004 {

    // One line palindrome check.
    public boolean isPalindromeOneLiner(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    // Palindrome using custom algorithm. Faster than one liner.
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        long start = System.nanoTime(); // Start timer.
        int largest = 0;

        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                Integer in = new Integer(i * j);
                String s = in.toString();
                if (isPalindrome(s)) {
                    if (in > largest) {
                        largest = in;
                    }
                    break;
                }
            }
        }
        
        System.out.println(largest);

        long end = System.nanoTime(); // End timer.
        double time = (double)(end - start) / 1000000000;
        
        System.out.println("Time: " + time + " sec.");
    }
}
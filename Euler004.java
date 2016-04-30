// Project Euler Problem: 004

// A palindromic number reads the same both ways. The largest palindrome made 
// from the product of two 2-digit numbers is 9009 = 91 × 99.

// Find the largest palindrome made from the product of two 3-digit numbers.

// Completed 2016/04/29

import java.util.*;

public class Euler004 {
    // Off top of head.
    // public boolean isPalindrome(String s) {
    //     Stack<Character> st = new Stack<Character>();
    //     for (int j = 0; j < s.length() / 2; j++) {
    //         st.push(s.charAt(j));
    //     }
    //     if (s.length() % 2 == 0) {
    //         for (int j = s.length() / 2; j < s.length(); j++) {
    //             Character c;
    //             c = st.pop();
    //             if (c != s.charAt(j)) {
    //                 return false;
    //             }
    //         }
    //         return true;
    //     } else {
    //         for (int j = (s.length() / 2) + 1; j < s.length(); j++) {
    //             Character c;
    //             c = st.pop();
    //             if (c != s.charAt(j)) {
    //                 return false;
    //             }
    //         }
    //         return true;
    //     }
    // }

    // Nice one liner.
    // public boolean isPalindrome(String s) {
    //     return s.equals(new StringBuilder(s).reverse().toString());
    // }

    // Faster than one liner, and no stack or extra objects. I like this.
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
        // Timing
        long start = System.nanoTime();


        //Euler004 e = new Euler004();
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

        // Timing
        long end = System.nanoTime();
        double time = (double)(end - start) / 1000000000;
        System.out.println("Time: " + time + " sec.");
    }
}
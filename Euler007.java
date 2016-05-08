// Project Euler Problem: 007

// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see 
// that the 6th prime is 13.

// What is the 10,001st prime number?

// Completed 2016/05/07

import java.util.*;

public class Euler007 {
    public static void main(String[] args) {
        Sieve_of_Eratosthenes s = new Sieve_of_Eratosthenes();
        ArrayList<Integer> p = s.primes(200000);
        System.out.println(p.size());
        System.out.println(p.get(10000));
    }
}
// Project Euler Problem: 003
//
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?
//
// Completed 2016/04/29

import java.util.*;

public class Euler003 {
    public static void main(String[] args) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        long n = 600851475143L;
        int stop = (int)Math.sqrt(n); // The key.
        for (int i = 2; i < stop; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        int largestFactor = factors.get(factors.size() - 1);
        Sieve_of_Eratosthenes s = new Sieve_of_Eratosthenes();
        ArrayList<Integer> primes = s.primes(largestFactor);

        for (int x : factors) {
            if (primes.contains(x)) {
                primeFactors.add(x);
            }
        }

        System.out.println(primeFactors.get(primeFactors.size()-1));
    }
}
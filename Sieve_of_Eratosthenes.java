// Sieve of Eratosthenes
// Returns ArrayList of prime numbers <= n
//
// Adapted from Sedewick and Wayne
// http://introcs.cs.princeton.edu/java/14array/PrimeSieve.java.html

import java.util.*;

public class Sieve_of_Eratosthenes {
    public ArrayList<Integer> primes(int n) {
        ArrayList<Integer> p = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= n; j++) {
                    isPrime[i*j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                p.add(i);
            }
        }
        return p;
    }
}
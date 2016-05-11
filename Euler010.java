// Project Euler Problem: 010
//
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
// Find the sum of all the primes below two million.
//
// Completed 2016/05/11
// Notes: The sieve strikes again.

import java.util.*;

public class Euler010 {
    public static void main(String[] args) {
        Sieve_of_Eratosthenes s = new Sieve_of_Eratosthenes();
        ArrayList<Integer> primes = s.primes(2000000);
        System.out.println(primes.stream().mapToLong(i -> i).sum());
    }
}
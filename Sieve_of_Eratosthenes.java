// Sieve of Eratosthenes
// Returns ArrayList of prime numbers

import java.util.*;

public class Sieve_of_Eratosthenes {
    public ArrayList<Integer> primes(int n) {
        int[] a = new int[n + 1];
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }

        a[0] = 0;
        a[1] = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                primes.add(i);

                for (int j = i * i; j < a.length; j += i) {
                    a[j] = 0;
                }
            }
        }
        return primes;
    }
}
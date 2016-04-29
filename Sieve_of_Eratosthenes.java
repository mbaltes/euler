// Sieve of Eratosthenes
// Returns ArrayList of prime numbers

import java.util.*;

public class Sieve_of_Eratosthenes {
    public ArrayList<Integer> primes(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            a.add(1);
        }

        a.set(0, 0);
        a.set(1, 0);

        for (int i = 0; i <= n; i++) {
            if (a.get(i) == 1) {
                primes.add(i);

                for (int j = 0; j <= n; j += i) {
                    a.set(j, 0);
                }
            }
        }
        return primes;
    }

    // public static void main(String[] args) {
    //     Sieve_of_Eratosthenes s = new Sieve_of_Eratosthenes();
    //     ArrayList<Integer> p = s.primes(25);
    //     for (int x : p) {
    //         System.out.print(x + " ");
    //     }
    // }
}
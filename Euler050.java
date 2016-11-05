package hackerrank;

import java.util.ArrayList;
import java.util.Set;

// Brute forced for sure.
// Uses lots of space, but works.
public class Euler050 {
  public static void main(String[] args) {
    int n = 1000000;
    SieveOfEratosthenes s = new SieveOfEratosthenes();
    Set<Integer> pSet = s.primeSet(n);
    ArrayList<Integer> pArray = s.primes(n);
    int sum = 0, largest = 0, longest = 0, consec = 0;
    // Guessed upper bound. 
    for (int i = 0; i < Math.sqrt((int) pArray.size()); i++) {
      sum = 0;
      consec = 0;
      // 2nd loop does most of work.
      for (int j = i; j < pArray.size(); j++) {
        int k = pArray.get(j);
        sum += k;
        consec++;
        if (sum > largest && consec > longest && pSet.contains(sum)) {
          largest = sum;
          longest = consec;
        } 
      }
    }
    System.out.println(largest);
    System.out.println(longest);
  }
}

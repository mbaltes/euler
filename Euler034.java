/*
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 *
 * Find the sum of all numbers which are equal to the sum of the factorial of
 * their digits.
 *
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 *
 * Personal note after solving: These numbers are called Factorions and there
 * are only 4 of them: 1, 2, and the two that this program finds.
 * http://mathworld.wolfram.com/Factorion.html
 */

package me.mcb;

import java.util.Map;

public class Euler_0034 {
    Map<Integer, Integer> db = Map.of(
            1, 1,
            2, 2,
            3, 6,
            4, 24,
            5, 120,
            6, 720,
            7, 5040,
            8, 40320,
            9, 362880,
            0, 1
    );

    public void printCuriousNumbers() {
        for (int i = 3; i < 2_000_000; i++) {
            if (factorialSum(i) == i) {
                System.out.println(i);
            }
        }
    }

    public int factorialSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += db.get(n % 10);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Euler_0034 e = new Euler_0034();
        e.printCuriousNumbers();
    }
}

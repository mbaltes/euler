// Project Euler Problem: 006
//
// The sum of the squares of the first ten natural numbers is,
// 12 + 22 + ... + 102 = 385
//
// The square of the sum of the first ten natural numbers is,
// (1 + 2 + ... + 10)2 = 552 = 3025
//
// Hence the difference between the sum of the squares of the first ten natural 
// numbers and the square of the sum is 3025 − 385 = 2640.
//
// Find the difference between the sum of the squares of the first one hundred 
// natural numbers and the square of the sum.
//
// Completed 2016/05/06
//
// Notes: The answer given in the related pdf is lovely. From O(n) to O(1).

public class Euler006 {
    public static long sumSqDiff(int limit) {
        long sumOfSq = 0;
        long sum = 0;
        for (int i = 1; i <= limit; i++) {
            sumOfSq += (long)Math.pow(i, 2);
            sum += i;
        }
        return (long)Math.pow(sum, 2) - sumOfSq;
    }

    public static void main(String[] args) {
        System.out.println(sumSqDiff(100));
    }
}
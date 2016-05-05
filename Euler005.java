// Project Euler Problem: 005
//
// 2520 is the smallest number that can be divided by each of the numbers from 1 
// to 10 without any remainder.
//
// What is the smallest positive number that is evenly divisible by all of the 
// numbers from 1 to 20?
//
// Completed 2016/05/05
//
// Notes: I did it brute force, but need to make more efficient.
public class Euler005 {
    // Methods
    public static int smallestMultiple(int n) {
        int count = 2522;
        do {
            for (int i = 2; i <= n; i++) {
                if (count % i != 0) {
                    count = count + 2; // Odd #'s aren't divisible by 2.
                    break;
                }
                if (i == n) {
                    return count;
                }
            }
        } while (count < Integer.MAX_VALUE);
        return -1;
    }
    // Main
    public static void main(String[] args) {
        int answer = smallestMultiple(20);
        System.out.println(answer);
    }
}

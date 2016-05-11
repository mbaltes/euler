// Project Euler Problem: 009
//
// A Pythagorean triplet is a set of three natural numbers, a < b < c, for 
// which, a^2 + b^2 = c^2
//
// For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.
//
// Completed 2016/05/10
//
// Notes: Absolutely disgusting brute force, but it got the job done.
//
// Todo: Read up on the math behind the more efficient version.



public class Euler009 {
    public static void main(String[] args) {
        for (int c = 0; c < 1000; c++) {
            for (int b = 0; b < 1000; b++) {
                for (int a = 0; a < 1000; a++) {
                    if (a < b && b < c) {
                        if (a + b + c == 1000) {
                            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                                System.out.println("A: " + a);
                                System.out.println("B: " + b);
                                System.out.println("C: " + c);
                                System.out.println("Product: " + (a*b*c));
                            }
                        }
                    }
                }
            }
        }
    }
}
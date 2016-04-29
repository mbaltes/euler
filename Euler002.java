// Project Euler Problem: 002
//
// Each new term in the Fibonacci sequence is generated by adding the previous 
// two terms. By starting with 1 and 2, the first 10 terms will be:
//
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
// By considering the terms in the Fibonacci sequence whose values do not exceed 
// four million, find the sum of the even-valued terms.
//
// Completed 


public class Euler002 {
    public static void main(String[] args) {
        final int maxValue = 4000000;
        int x = 1;
        int y = 1;
        int sum = 0;

        while (x <= maxValue && y <= maxValue) {
            x = x + y;
            //System.out.print(y + " ");
            if (y % 2 == 0) {
                sum += y;
            }
            //System.out.print(x + " ");
            if (x % 2 == 0) {
                sum += x;
            }
            y = y + x;
        }
        //System.out.println();
        System.out.println(sum);
    }
}
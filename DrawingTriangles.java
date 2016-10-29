/*
  Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

  Say you have an array for which the ith element is the price of a given stock 
  on day i. If you were only permitted to complete at most one transaction 
  (ie, buy one and sell one share of the stock), design an algorithm to find 
  the maximum profit.

*/

package hackerrank;

public class Staircase {
  // Draws right-justified triangles of base and height n.
  public static void triangle(int n) {
    int numSpaces = n - 1;
    while (numSpaces >= 0) {
      int i = 0;
      for (; i < numSpaces; i++) {
        System.out.print(" ");
      }
      int length = n - numSpaces;
      for (int j = 0; j < length; j++) {
        System.out.print("#");
      }
      System.out.println();
      numSpaces--;
    }
  }
  
  public static void main(String[] args) {
    triangle(7);
  }
}

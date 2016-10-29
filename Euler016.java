// Project Euler Problem: 016
//
// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

// What is the sum of the digits of the number 2^1000?
//
// Completed 2016/10/28

package hackerrank;

import java.math.BigInteger;

public class Euler016 {
  
  public static void main(String[] args) {
    
    BigInteger n = new BigInteger("2").pow(1000);
    String num = n.toString();
    
    int sum = 0;
    for (char x : num.toCharArray()) {
      sum += Character.getNumericValue(x);
    }
    System.out.println(sum);
  }
}

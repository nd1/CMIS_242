/* Nicole Donnelly
 * 20170927
 * Week06 - discussion
 * 
 * AddNextEven creates a number sequence that adds the next even number to
 * the prior number in the sequence. The sequence looks like:
 * 0, 2, 6, 12, 20...
 * i.e.- 0(+2), 2(+4), 6(+6), 12(+8), 20(+10)
 */

import java.util.Scanner;

public class AddNextEven {

  public static void main(String[] args) {
    
    int n = 0;
    Scanner input = new Scanner(System.in);
    do {
      System.out.print("Enter a positive integer: ");
      n = input.nextInt();
    } while(n<0);
    
    int addNe_1 = iterativeAddNextEven(n);
    System.out.println("Iterative AddNextEven = " + addNe_1);
    
    int addNe_2 = recursiveAddNextEven(n);
    System.out.println("Recursive AddNextEven = " + addNe_2);
    input.close();
    
  } // end main
  
  private static int iterativeAddNextEven(int n) {
    
    int value = 0;
    for(int i = 0; i <= n; i++) {
      value += (i*2);
    }
    
    return value;
      
  } // end iterativeAddNextEven
  
  private static int recursiveAddNextEven(int n) {
    
    if (n == 0) {
      return n;
    }
    
    else {
      return recursiveAddNextEven(n-1) + (n*2);
    }
    
  } // end recursiveAddNextEven
  
} // end class

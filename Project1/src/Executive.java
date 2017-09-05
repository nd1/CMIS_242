/***
 * Nicole Donnelly
 * 20170903
 * Project 1 - Executive.java
 *
 * This class extends the employee class. An Executive has a current stock price in addition to
 * name and monthly salary. An annualSalary method overrides the superclass to compute a
 * base salary + bonus based on the stock price.
 */

public class Executive extends Employee {
  
  private final int BONUS = 30_000;
  private final int STOCK_BONUS_THRESHOLD = 50;
  
  private int currentStockPrice = 0;

  public Executive(String name, int monthlySalary, int currentStockPrice) {
    super(name, monthlySalary);
    this.currentStockPrice = currentStockPrice;
  } // end constructor
  
  @Override
  public int annualSalary() {
    // if the current stock price is over threshold, salary is base + bonus
    // otherwise the salary is just the base
    
    if (currentStockPrice > STOCK_BONUS_THRESHOLD) {
      return super.annualSalary() + BONUS;
    } // end if
    else {
      return super.annualSalary();
    } // end else
  } //end annualSalary 
  
  @Override
  public String toString() {
    return super.toString() + " Current Stock Price: " + currentStockPrice;
  } // end toString

} // end class

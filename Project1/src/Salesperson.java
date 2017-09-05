/***
 * Nicole Donnelly
 * 20170903
 * Project 1 - Salesperson.java
 *
 * This class extends the employee class. A Salesperson has annual sales in addition to
 * name and monthly salary. An annualSalary method overrides the superclass to compute a
 * base salary + commission.
 */

public class Salesperson extends Employee {

  private final double COMMISSION_RATE = .02;
  private final int MAX_COMMISSION = 20_000;
  
  private int annualSales = 0;
  
  public Salesperson(String name, int monthlySalary, int annualSales) {
    super(name, monthlySalary);
    this.annualSales = annualSales;
    } // end constructor
  
  @Override
  public int annualSalary() {
    // if the commission is lower than the max allowed, salary is base + commission
    // otherwise the salary is base + the maximum commission
    
    if (annualSales * COMMISSION_RATE < MAX_COMMISSION) {
      return (int)(annualSales * COMMISSION_RATE + super.annualSalary());
    } // end if
    else {
      return super.annualSalary() + MAX_COMMISSION;
    } // end else
  } //end annualSalary 
  
  @Override
  public String toString() {
    return super.toString() + " Annual Sales: " + annualSales;
  } // end toString
 } // end class

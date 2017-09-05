/***
 * Nicole Donnelly
 * 20170903
 * Project 1 - Employee.java
 *
 * This class defines the employee class. An employee has a name and monthly salary.
 * There is a method to compute the annual salary and a toString method.
 */

public class Employee {
  
  private static final int MONTHS_IN_YEAR = 12;
  
  private String name;
  private int monthlySalary = 0;
  
  public Employee(String name, int monthlySalary) {
    this.name = name;
    this.monthlySalary = monthlySalary;
    } // end constructor

  public int annualSalary() {
    return monthlySalary * MONTHS_IN_YEAR;
    } //end annualSalary
  
  @Override
  public String toString() {
    return "Name: " + name + " Monthly Salary: " + monthlySalary;
    } // end toString
  
} // end class

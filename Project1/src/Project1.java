/***
 * Nicole Donnelly
 * 20170903
 * Project 1 - Project1.java
 *
 * This class reads a file called employees.txt, creates the appropriate object for the
 * employee type, and adds the employee to an array based on the year for the salary 
 * information
 */

import java.io.File;
import java.util.Scanner;

public class Project1 {

  public static void main(String[] args) throws Exception {
   
    final int MAX_EMPLOYEES = 10; // size to initialize array to
    
    Employee [] year2014 = new Employee[MAX_EMPLOYEES]; // array of employees for 2014
    Employee [] year2015 = new Employee[MAX_EMPLOYEES]; // array of employees for 2015
    
    Scanner file = new Scanner(new File("employees.txt")); // scanner to read file
    
    int count2014 = 0; // counter, initialized to 0
    int count2015 = 0; // counter, initialized to 0
    
    while(file.hasNext()) {
      // while the file has data, parse the data based on specified file format
      int year = Integer.parseInt(file.next());
      String employeeType = file.next();
      String name = file.next();
      int monthlySalary = Integer.parseInt(file.next());
      Employee employee = null;
      
      switch (employeeType) { // create the correct object type based on file input
        case "Employee":
          employee = new Employee(name, monthlySalary);
          break;
        case "Salesman": // read in additional annual sales data
          int annualSales = Integer.parseInt(file.next());
          employee = new Salesperson(name, monthlySalary, annualSales);
          break;
        case "Executive": // read in additional stock price data
          int currentStockPrice = Integer.parseInt(file.next());
          employee = new Executive(name, monthlySalary, currentStockPrice);
          break;
      } // end employeeType switch
      
      switch (year) { // add object to correct array based on year data
        case 2014:
          year2014[count2014++] = employee;
          break;
        case 2015:
          year2015[count2015++] = employee;
          break; 
      } // end year switch
      
    } // end while
    
    // display program output
    display(2014, year2014, count2014); 
    display(2015, year2015, count2015);
    
    // close file
    file.close();

  } // end main

  private static void display(int year, Employee [] employees, int count) {
    
    int totalSalary = 0; // initialize variable for computing annual average salary amount
    
    System.out.printf("\nInformation for %d Employees\n\n", year);
    for (int i = 0 ; i < count; i++)
    {
        Employee employee = employees[i];
        System.out.println(employee + " Annual Salary: " + employee.annualSalary());
        totalSalary += employee.annualSalary();
    }
    System.out.printf("\nAverage Annual Salary = %d\n\n", totalSalary/count);
  } // end display
} // end class

/*
 * Nicole Donnelly
 * 20171015
 * Project 4 - Student.java
 *
 * This class defines the Student object
 */

import java.text.DecimalFormat;

class Student
{
    private String name;
    private String major;
    private int creditHours; 
    private int qualityPoints;
    
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
        creditHours = 0;
        qualityPoints = 0;
    } // end constructor

    public void courseCompleted(int creditHours, char grade) {
        this.creditHours += creditHours;
        
        switch(grade){
          case 'A':
            qualityPoints += creditHours * 4;
            break;
          case 'B':
            qualityPoints += creditHours * 3;
            break;
          case 'C':
            qualityPoints += creditHours * 2;
            break;
          case 'D':
            qualityPoints += creditHours * 1;
            break;
          case 'F':
            qualityPoints += 0;
            break;
        }
       
    } // end courseCompleted
    
    private double computeGPA(){
      
      if (creditHours == 0){
        return 4.0;
      }
      else {
        return (double) qualityPoints / creditHours;
      }
      
    } // end computeGPA
    
    @Override
    public String toString(){
      DecimalFormat numberFormat = new DecimalFormat("#.00");
      return "Name = " + name.toUpperCase() + "\nMajor = " + major.toUpperCase() + "\nGPA = " 
          + numberFormat.format(computeGPA());
    } // end toString

} // end class
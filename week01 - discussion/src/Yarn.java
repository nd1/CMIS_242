// CMIS 242 
// Nicole Donnelly
// 20170824
// Week 1 Discussion

// This class defines a yarn object. It illustrates the use class variables that 
// give each new object a successive ID and counts groups of objects based on 
// one attribute (yarn weight).

public class Yarn {
  
  private static int yarnId = 0;
  private static int laceCount = 0;
  private static int fingeringCount = 0;
  private static int sportCount = 0;
  private static int dkCount = 0;
  private static int worstedCount = 0;
  private static int aranCount = 0;
  private static int bulkyCount = 0;
  
  
  public static final String [] WEIGHTS = {"Lace", "Fingering", "Sport", "DK", "Worsted",
      "Aran", "Bulky"};
  
  private int weight;
  private String color;
  private String brand;
  private String name;
  private double amount;
  private String amountType;
  private String location;
  
  public Yarn (int weight, String color, String brand, String name, double amount,
      String amountType, String location) {
    
    this.weight = weight;
    this.color = color;
    this.brand = brand;
    this.name = name;
    this.amount = amount;
    this.amountType = amountType;
    this.location = location;
    
    yarnId++;
    
    switch (weight){
      case 0: laceCount++;
        break;
      case 1: fingeringCount++;
        break;
      case 2: sportCount++;
        break;
      case 3: dkCount++;
        break;
      case 4: worstedCount++;
        break;
      case 5: aranCount++;
        break;
      case 6: bulkyCount++;
        break;
    } // end switch
    
  } // end constructor
  
  //getter and setter methods would go here
  // at a minimum, setter methods are appropriate for amount, amountType, and location
  // as these attributes can change over time
  
  // class methods referencing class variables
  public static int totalSkeins() {
    return yarnId;
  }
  
  public static int laceSkeins() {
    return laceCount;
  }
  
  public static int fingeringSkeins() {
    return fingeringCount;
  }
  
  public static int sportSkeins() {
    return sportCount;
  }
  
  public static int dkSkeins() {
    return dkCount;
  }
  
  public static int worstedSkeins() {
    return worstedCount;
  }
  
  public static int aranSkeins() {
    return aranCount;
  }
  
  public static int bulkySkeins() {
    return bulkyCount;
  }
  
  // return a string representation of the yarn
  public String toString() {
    return String.format("%.2f %s %s %s weight %s %s in %s", this.amount, this.amountType,
        this.color, WEIGHTS[this.weight], this.brand, this.name, this.location);
  } // end toString
  
} // end class

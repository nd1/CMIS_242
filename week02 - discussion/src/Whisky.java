// CMIS 242 
// Nicole Donnelly
// 20170901
// Week 2 Discussion

// This class defines a whisky object. 
// Whisky distilled alcoholic beverage made from fermented grain mash.
// The typical unifying characteristics of the different classes and 
// types are the fermentation of grains, distillation, and aging in wooden barrels.
// https://en.wikipedia.org/wiki/Whisky

public class Whisky {
  
  // create a whisky super class
  
  private String distiller;
  private String name;
  private String primaryGrain;
  private String stillType;
  private String barrelType;
  private int releaseYear;
  private int age;
  private float abv;
  private boolean spellWithE;
  
  public Whisky(String distiller, String name, String primaryGrain, String stillType, 
      String barrelType, int releaseYear, int age, float abv, boolean spellWithE) {
    
    this.distiller = distiller;
    this.name = name;
    this.primaryGrain = primaryGrain;
    this.stillType = stillType;
    this.barrelType = barrelType;
    this.releaseYear = releaseYear;
    this.age = age;
    this.abv = abv;
    this.spellWithE = spellWithE;
    
  } // end constructor
  
  @Override
  public String toString() {
    return "Distiller: " + distiller + " Name: " + name + " Primary Grain: " + primaryGrain
        + " Still Type: " + stillType + " Barrel Type: " + barrelType + " Release Year " + releaseYear
        + " Age: " + age + " Alcohol by Volume: " + abv + "% Spelled with an E?: " + spellWithE;
  } // end toString
  

} // end class

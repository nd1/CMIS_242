// CMIS 242 
// Nicole Donnelly
// 20170901
// Week 2 Discussion

// This class defines a scotch object. Scotch is a whisky.
// The scotch subclass extends whisky to capture the unique attributes of 
// scotch including number of distillations, production region, if it is peated, 
// the type (single malt, blend, etc.), and whether it is chill filtered.

public class Scotch extends Whisky{
  
  private int numDistillations; 
  private String region;
  private boolean peated;
  private String type; 
  private boolean chillFiltered;

  public Scotch(String distiller, String name, String primaryGrain, String stillType, 
      String barrelType, int releaseYear, int age, float abv, boolean spellWithE, int numDistillations,
      String region, boolean peated, String type, boolean chillFiltered) {
    
    super(distiller, name, primaryGrain, stillType, barrelType, releaseYear, age, abv, spellWithE);
    this.numDistillations = numDistillations;
    this.region = region; 
    this.peated = peated; 
    this.type = type; 
    this.chillFiltered = chillFiltered;
    
  } // end constructor
  
  @Override
  public String toString() {
    return super.toString() + " Number of Distillations: " + numDistillations + " Region: "
        + region + " Peated: " + peated + " Type: " + type + " Chill Filtered: " + chillFiltered;
  } // end toString

} // end class

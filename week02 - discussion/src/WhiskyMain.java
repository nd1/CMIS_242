// CMIS 242 
// Nicole Donnelly
// 20170901
// Week 2 Discussion

// This class contains a main method to test the whisky 
public class WhiskyMain {

  public static void main(String[] args) {
    
    Whisky[] bottles = {
        new Scotch("Ardbeg", "Supernova", "barley", "pot", "bourbon", 2015, 3, (float) 54.3, false, 
            2, "Islay", true, "single malt", false),
        new Scotch("Laphroaig", "Quarter Cask ", "barley", "pot", "bourbon and quarter cask", 2004, 3,
            48, false, 2, "Islay", true, "single malt", false),
        new Whisky("Willet", "Pot Still Reserve", "corn", "pot", "new oak", 2008, 8, 47, true)
    }; // end bottles
    
    for (Whisky bottle: bottles){
      System.out.println(bottle);
    } // end for

  } // end main

} // end class

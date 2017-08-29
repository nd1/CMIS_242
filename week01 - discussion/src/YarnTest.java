// CMIS 242 
// Nicole Donnelly
// 20170824
// Week 1 Discussion

// This class contains a main method that is used to test the Yarn class.

public class YarnTest {

  public static void main(String[] args) {
    
    Yarn skein1 = new Yarn(0, "Corn Dolly", "Juno Fibre Arts", "Alice Lace", 100, "grams", "Bin 01");
    Yarn skein2 = new Yarn(0, "Treehouse", "Brooklyn Tweed", "Plains", 150, "grams", "Bin 01");
    Yarn skein3 = new Yarn(1, "Amethyst", "A Verb For Keeping Warm", "Entwined", 4, "ounces", "Bin 02");
    Yarn skein4 = new Yarn(3, "Shaela", "Clara Yarn", "Shetland 1.0", 300, "yards", "Bin 04");
    Yarn skein5 = new Yarn(0, "Corn Dolly", "Juno Fibre Arts", "Alice Lace", 100, "grams", "Bin 01");
    
    System.out.println(skein1);
    System.out.println(skein2);
    System.out.println(skein3);
    System.out.println(skein4);
    System.out.println(skein5);
    System.out.println();
    System.out.println("Total skeins: " + Yarn.totalSkeins());
    System.out.println("Lace skeins: " + Yarn.laceSkeins());
    System.out.println("Fingering skeins: " + Yarn.fingeringSkeins());
    System.out.println("Sport skeins: " + Yarn.sportSkeins());
    System.out.println("DK skeins: " + Yarn.dkSkeins());
    System.out.println("Worsted skeins: " + Yarn.worstedSkeins());
    System.out.println("Aran skeins: " + Yarn.aranSkeins());
    System.out.println("Bulky skeins: " + Yarn.bulkySkeins());
    

  } // end main

} // end class

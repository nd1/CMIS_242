import java.io.FileInputStream;

public class ExceptionPropogation {

  public static void main(String[] args) {
    
    getMyFile();
    
  } // end main

  public static void getMyFile() {
    
    FileInputStream myFile = null;
    
    myFile = new FileInputStream("myFile.txt");
    writeMyFile(myFile);
    
  } // end readMyFile
  
  public static void writeMyFile(FileInputStream writeFile) {
    
    int fileChar;
    
    while((fileChar = writeFile.read()) != -1){
      
      System.out.print((char)fileChar);
      
    }
  } // end writeMyFile

}  // end class

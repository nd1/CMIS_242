import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionPropogationCaught {

  public static void main(String[] args) {
    
    try{
      getMyFile();
    }
    catch(FileNotFoundException fnf){
      System.out.println("File Not Found Exception occurred: "+fnf);
    }
  } // end main

  public static void getMyFile() throws FileNotFoundException {
    
    FileInputStream myFile = null;
    
    myFile = new FileInputStream("myFile.txt");
    
    try{
      writeMyFile(myFile);
    }
    catch(IOException ioe){
      System.out.println("I/O error occurred: "+ioe);
    }
  } // end readMyFile
  
  public static void writeMyFile(FileInputStream writeFile) throws IOException {
    
    int fileChar;
    
    while((fileChar = writeFile.read()) != -1){
      
      System.out.print((char)fileChar);
      
    }
  } // end writeMyFile

}  // end class

// CMIS 242 
// Nicole Donnelly
// 20171006
// week 7 discussion

// This program rewrites the week 2 example "ReverseForward" implementing generics.


import java.util.ArrayList;
import java.util.Scanner;

public class GenericReverseForward {
  
  public static void main(String[] args)
  {
      Scanner stdin = new Scanner(System.in);
      ArrayList<String> names = new ArrayList<String>();
      String name;
      
      while (true)
      {
          System.out.print("Enter a name, enter return to stop: ");
          name = stdin.nextLine();
          if (name.length() == 0)
              break;
          names.add(name);
      }
      for (int i = names.size() - 1; i >= 0; i--)
      {
          name = names.get(i);
          System.out.println(name);
      }
      for (String n: names)
          System.out.println(n);
      
      // close stdin
      stdin.close();
  } // end main

} // end class

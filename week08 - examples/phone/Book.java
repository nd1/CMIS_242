// CMIS 242 
// Duane J. Jarc
// July 7, 2015
// Week 8 Examples

// This program allows the user to add, remove and find entries in a phone
// book that is implemented using a TreeMap. It uses a command-line interface.

package phone;

import java.util.*;

class Book
{
	private static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Map<String, Entry> phoneBook = new TreeMap();
		String name, address, number, response;
		Entry phoneEntry;
		
		loop: while(true)
		{
			System.out.print("Enter a for add, r for remove, f for find, or q for quit: ");			                  
			
			response = stdin.nextLine();
			switch(response.charAt(0))
			{
		 		case 'a':
					System.out.print("Enter name: ");
					name = stdin.nextLine();
					System.out.print("Enter address: ");
					address = stdin.nextLine();
					System.out.print("Enter phone number: ");
					number = stdin.nextLine();
					phoneBook.put(name, new Entry(address, number));
					break;
				case 'r':
					System.out.print("Enter name: ");
					name = stdin.nextLine();
					phoneBook.remove(name);
					break;
			  case 'f':
					System.out.print("Enter name: ");
					name = stdin.nextLine();
					phoneEntry = phoneBook.get(name);
					System.out.println(phoneEntry);
					break;
				case 'q':
					break loop;
			}
	   }
   }
}
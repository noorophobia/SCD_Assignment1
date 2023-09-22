  
package scdC;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner obj=new Scanner(System.in);

	public static   int getValidId(List<Item> items ) {
 			boolean validInput = false;
			int id = 0;
			while (!validInput) {
				 
 					id = obj.nextInt();
					for(int i=0 ; i<items.size();i++) {
						if(id==items.get(i).getID()) {
							validInput = true;
						}
					}
					 
				 if(!validInput) {
					System.out.println("Invalid ID.");
					//id=obj.nextInt();
				}
			}
			return id;
			 
	}

	 public static void main(String args[]) throws IOException {
		 
 		 
		 int x=0;
		 Library library=new Library();
	 
				 while(x!=10) {
 					 
				 System.out.println("\n\n Library Management System Menu: ");
					 System.out.println("1. Add Item ");
					 System.out.println("2. Edit Item ");
					 System.out.println("3. Delete Item ");
					 System.out.println("4. View All Items ");
					 System.out.println("5. View Item by ID ");
					 System.out.println("6. Borrow Item by ID ");
					 System.out.println("7. Return Borrowed Item by ID ");
					 System.out.println("8. View Borrowers List  ");
					 System.out.println("9. Hot Picks ");
					 
					 System.out.println("10. exit ");
					 System.out.println("Enter your choice");
						boolean validInput = false;
						int id = 0;
						   while (!validInput) {
				                // Check if the next token entered is an integer
				                if (obj.hasNextInt()) {
				                    x = obj.nextInt();

				                    if (x >= 1 && x <= 10) {
				                        validInput = true;
				                    } else {
				                        System.out.println("Invalid input. Please enter a valid menu option (1-6).");
				                    }
				                } else {
				                    // Clear the scanner buffer if non-integer input is provided
				                    obj.next();
				                    System.out.println("Invalid input. Please enter an integer.");
				                }
				            }
 					 switch(x) {
					 case 1:
  						 library.addItem( );
						 
						 break;
					 case 2:
						 
						 library.displayall();
						 System.out.println("Enter id of item to edit ");
                   if(library.items.size() !=0) {
							  id =  getValidId( library.items ); 
 
						 library.editItem(id);}
                   else {
						 System.out.println(" library is emp");

                   }
                   
						 break;
					 case 3:
						System.out.print("Enter id of item to delete ");
						  id =  getValidId( library.items ); 

						 library.deleteItem(id);
						 break;
					 case 4:
						 library.displayall();
						 break;
					 case 5:
							System.out.print("Enter id of item to view ");
	 						  
							  id =  getValidId( library.items ); 

						 library.displayItemWithID(id);
						 break;
					 case 6:
						 System.out.print("Enter id of item to Borrow ");
						  
						  id =  getValidId( library.items ); 
						  library.BorrowItem(id);
 
						  break;
					 case 7:
						 System.out.print("Enter id of item to return ");
						  
						  id =  getValidId( library.items ); 
						  library.returnItem(id);
						  
						 
					 case 8:
						 library.displayBorrrowers();
						 break;
					 case 9:
						 System.out.println("Hot Picks");
						 library.hotPicks();
						 break;
					 case 10:
						 System.out.println("exiting");
						 break;
						 default:
							 break;
						 
						 
						 
					 }



 


			 	 }
}}
		  
	 		 
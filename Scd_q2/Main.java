package scd;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	 public static void main(String args[]) throws IOException {
		 
		 
		 
		 int x=0;
				 while(x!=6) {
					 Library library=new Library();
					 
					 System.out.println("\n\n Library Management System Menu: ");
					 System.out.println("1. Add Book ");
					 System.out.println("2. Edit Book ");
					 System.out.println("3. Delete Book ");
					 System.out.println("4. View All Books ");
					 System.out.println("5. View Book by ID ");
					 System.out.println("6. exit ");
					 System.out.println("Enter your choice");
					 x=library.obj.nextInt();
					 
					 switch(x) {
					 case 1:
						 Book book=new Book().getBook();
						 library.addBook(book);
						 
						 break;
					 case 2:
						 
						 library.displayBook();
						 library.editBook();
						 break;
					 case 3:
						 library.displayBook();

						 library.deleteBook();
						 break;
					 case 4:
						 library.displayBook();
						 break;
					 case 5:
 
						 library.display();
						 break;
					 case 6:
						 System.out.println("exiting");
						// fileReadWrite.addId();

						 break;
						 default:
							 break;
						 
						 
						 
					 }






				 }
		 
		  
	 		 }
}

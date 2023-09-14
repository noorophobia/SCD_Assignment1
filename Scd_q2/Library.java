package scd;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//Create a new Library class that can store multiple Book objects.
//Implement methods to add, edit, delete books in the library and also display all books in
//the library.
public class Library {
	static List<Book> books ;
	public static Scanner obj ;

	public Library() throws IOException{
	books= new ArrayList<>();
	   obj=new Scanner(System.in);
	   books=fileReadWrite.readBooks();
	   
  }
 	   
	  
	
  
    public void addBook(Book book) throws IOException {
         
    	
    	fileReadWrite.addBook(book); 

    	 
    	books.add(book);
    	
    	
    }
    public static void editBookTitle(int id) throws IOException {
    	 
    	if(books.isEmpty()==false) {
   	 	 if(books.get(id)!=null) {

 			 
			 System.out.println("Enter the title of the book: ");

			 String title=obj.next();
			 books.get(id).setTitle(title);
			 fileReadWrite.writeEditTitle(title, id);
    	}
   	 	else {
			  System.out.println( "Book with ID: "+id+" not found");}

	   }
    	else {
			  System.out.println( "Library is empty ");}
    	
    	
    	
    	
    	
    	

    	}
    	
    
    	
    
    public static void editBookAuthor(int id) throws IOException {
   	 
    	if(books.isEmpty()==false) {
   	 	 if(books.get(id)!=null) {

 
				  System.out.println( "Enter the author of the book: ");
				  String author=obj.next();
				  books.get(id).setAuthor(author);
				  fileReadWrite.writeEditAuthor(author, id);
   		  }
   	 	else {
			  System.out.println( "Book with ID: "+id+" not found");}

	   }
    	else {
			  System.out.println( "Library is empty ");}
    	}
  	  
    public static void editBookYear(int id) throws IOException {
    	if(books.isEmpty()==false) {
        	 	 if(books.get(id)!=null) {
  				  System.out.println( "Enter the author of the book: ");
  				  int year=obj.nextInt();
  				  books.get(id).setYear(year);
  				fileReadWrite.writeEditYear(year, id);
     		  
    	  }
        	 	else {
      			  System.out.println( "Book with ID: "+id+" not found");}

      	   }
    	else {
			  System.out.println( "Library is empty ");}
    	
    }
    public static  void display(  ) {
		 System.out.println("Enter Book id");
		 int id=obj.nextInt();

    	for(Book book:books) {
    		if(book.getID()==id)
    		{
    			book.display();
    			break;
    		}
		 }}
   public void deleteBook() {
	   System.out.println( "Enter the ID of the book: ");
		  int id=obj.nextInt();
   	if(books.isEmpty()==false) {
		   Book bookRemove = null;

 	   if(books.get(id)!=null ) {
 		   for(Book b :books) {
 			   if(b.getID()==id) {
 				   bookRemove=b;
 				   break;
 			   }
 		   }
  		  fileReadWrite.delete(bookRemove);
	   books.remove(bookRemove);
		  System.out.println( "Book with ID: "+id+" removed");}
	   else {
			  System.out.println( "Book with ID: "+id+" not found");}}
	   else {
			  System.out.println( "Library is empty ");}

	   }
	   
   
   public static void editBook() throws IOException {
		  System.out.println( "Enter Book ID");
         int id=obj.nextInt();
		 int option=0;

         while(option<1 && option>=4) {
         System.out.println("1. Edit book title");
		 System.out.println("2. Edit Book Author ");
		 System.out.println("3. Edit Book Published Year ");
		 System.out.println("4. Close ");
		 
		   option=obj.nextInt();
		    if(option==1) {
		    	editBookTitle(id);
		    }
 if(option==2) {
	    editBookAuthor(id);
		    	
		    }
 if(option==3) {
	 editBookYear(id);
	 
 	
 }
 if(option==4) {
 	break;
 }     else {
	 System.out.println("Invalid option ");

 }
         
         }
		   
		 
         
   }
   
    public void displayBook() {
    	if(books.isEmpty()==false) {
			  System.out.println( "_________________________________________");
			 

    	for (Book book:books){
    		  System.out.print( "");
    		 book.display();
			  System.out.print( "\n");

    	 }
		  System.out.println( "_________________________________________");
}
    	 else {
			  System.out.println( "Library is empty ");}
    }
}

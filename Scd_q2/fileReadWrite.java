 package scd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

 
public class fileReadWrite {

	static Book getStringTokenizer(String s) {
		
    	
	   	 StringTokenizer st1 = new StringTokenizer(s);
			//  Book book=new Book();
	   	 int id_temp=0;
	   	  String author_temp="";
	   	  String title_temp="";
	   	  int ear_temp=0;
	   	  Book newbook;
	   	  if (st1.countTokens() >= 4) {
	   	      try {
	   	            id_temp = Integer.parseInt(st1.nextToken());
	   	            author_temp = st1.nextToken();
	   	            title_temp = st1.nextToken();
	   	            ear_temp = Integer.parseInt(st1.nextToken());
	   	              newbook=new Book();
	   	              newbook.setAuthor(author_temp);
	   	              newbook.setTitle(title_temp);
	   	              newbook.setYear(ear_temp);
	   	            newbook.setId(id_temp);
	   	            return newbook;
	  	            
	  	        } catch (NumberFormatException e) {
	  	          System.out.println("Error parsing integers in the line: " + s);
	  	      }
	   	  }
		return null;
	   	    
	}
	

	


	static  void writeEditAuthor(String author,int id) throws IOException {
		  
		    
 	        StringBuilder modifiedContent = new StringBuilder();

	        
	        	  File file = new File("books.txt");
	    		  // file.createNewFile();
	    		   if(file.isFile()) {
	    	       BufferedReader reader= new BufferedReader(new FileReader(file));
 	            String line;

	            while ((line = reader.readLine()) != null) {
	            	
	            	Book newbook=getStringTokenizer( line); 

	                      if(newbook.getID()==id) {
	        	            	  line = line.replaceAll(newbook.getAuthor(), author);

 	                       modifiedContent.append(line).append("\n");}
	        	            reader.close();

 	        	            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	        	            writer.write(modifiedContent.toString());

 	        	            writer.close();
	        	            
	        	            System.out.println("Existing content in the file has been edited.");}
	            }

	         	 	 else {
	         	    System.out.println("File does not exist ");
	        	        
	         	 	 }}
	         		   


	  static void writeEditTitle(String title,int id) throws IOException {
	  
    
     StringBuilder modifiedContent = new StringBuilder();

    
    	  File file = new File("books.txt");
		  // file.createNewFile();
		   if(file.isFile()) {
	       BufferedReader reader= new BufferedReader(new FileReader(file));
         String line;

        while ((line = reader.readLine()) != null) {
        	
        	Book newbook=getStringTokenizer( line); 

                  if(newbook.getID()==id) {
    	            	  line = line.replaceAll(newbook.getTitle(), title);

                    modifiedContent.append(line).append("\n");}
    	            reader.close();

     	            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    	            writer.write(modifiedContent.toString());

     	            writer.close();
    	            
    	            System.out.println("Existing content in the file has been edited.");}
        }

     	 	 else {
     	    System.out.println("File does not exist ");
    	        
     	 	 }}
     		   
	            	
     	 	static void writeEditYear(int year,int id) throws IOException {
     	 	  
     	 	    
     	 	     StringBuilder modifiedContent = new StringBuilder();

     	 	    
     	 	    	  File file = new File("books.txt");
     	 			  // file.createNewFile();
     	 			   if(file.isFile()) {
     	 		       BufferedReader reader= new BufferedReader(new FileReader(file));
     	 	         String line;

     	 	        while ((line = reader.readLine()) != null) {
     	 	        	
     	 	        	Book newbook=getStringTokenizer( line); 

     	 	                  if(newbook.getID()==id) {
     	 	                	  
     	 	                	  
     	 	    	            	  line = line.replaceAll(Integer.toString(newbook.getYear()),Integer.toString(year));

     	 	                    modifiedContent.append(line).append("\n");}
     	 	    	            reader.close();

     	 	     	            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
     	 	    	            writer.write(modifiedContent.toString());

     	 	     	            writer.close();
     	 	    	            
     	 	    	            System.out.println("Existing content in the file has been edited.");}
     	 	        }

     	 	     	 	 else {
     	 	     	    System.out.println("File does not exist ");
     	 	    	        
     	 	     	 	 }}
     	 	
     	 	
     	   public static 	List<Book>readBooks() throws IOException {
     			List<Book> 	books= new ArrayList<>();

    		   File file = new File("books.txt");
    		  // file.createNewFile();
    		   if(file.isFile()) {
    	       try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String s;
    	 
    	           while ((s = br.readLine()) != null)
    	{   
    	 	        	Book newbook=getStringTokenizer( s); 

    	            books.add(newbook);
    	            

    	       }
			}}  
    	 	 else {
    	    System.out.println("File does not exist ");
    		   
    	   }
				 System.out.println("Loaded books from file books.txt ");

    		   return books;
    		   
     	   }

     	   
     	   static void addBook(Book b) throws IOException {
     	   
     	   String line=b.getID()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getYear()+"\n";
	    	File file =new File("books.txt");

	    	if(!file.exists()){
  	    	   file.createNewFile();
  	    	}
     		FileWriter fWriter = new FileWriter(file,true);

     		BufferedWriter w=new BufferedWriter(fWriter);

     		w.write(line);

     		//System.out.println(text);

     		w.close();}
     	   static void addId(Library l) throws IOException {
   	    	File file =new File("books.txt");

  	    	if(file.exists()){
    	    	    
       		FileWriter fWriter = new FileWriter(file,true);

       		BufferedWriter w=new BufferedWriter(fWriter);

       		w.write(l.books.get(0).getID());

       		//System.out.println(text);

       		w.close();}
     		   
     	   }
     	   
     	      
          static void delete(Book newbook) {
      	         String lineToDelete = newbook.getID()+" "+newbook.getAuthor()+" "+newbook.getTitle()
+" "+newbook.getYear();     	         
     			  System.out.println( lineToDelete);

     	         try {
     	             String filePath="books.txt";
					File inputFile = new File(filePath);
     	             File tempFile = new File("tempFile.txt");

     	             BufferedReader reader = new BufferedReader(new FileReader(inputFile));
     	             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

     	             String currentLine;

     	             while ((currentLine = reader.readLine()) != null) {
     	                 if (currentLine.equals(lineToDelete)) {
     	                     // Skip the line you want to delete
     	                     continue;
     	                 }
     	                 
     	                 writer.write(currentLine);
     	                 writer.newLine(); // Add a newline after each line
     	             }

     	             writer.close();
     	             reader.close();

     	            // Delete the original file
     	             if (inputFile.delete()) {
     	                 // Rename the temporary file to the original file name
     	                 if (tempFile.renameTo(inputFile)) {
     	                     System.out.println("Line deleted successfully.");
     	                 } else {
     	                     System.out.println("Error renaming the temporary file.");
     	                 }
     	             } else {
     	                 System.out.println("Error deleting the original file.");
     	             }
     	         } catch (IOException e) {
     	             e.printStackTrace();
     	         }
     	     }
     	 }

     	
     	 	     	 	 
     	 	     	 	 
     	 	     	 	 
     	 	     		   
	            	
	            	
	            	
	            	
	            	
	  
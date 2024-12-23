package scd;

import java.util.*;
 
	 public class Book {
		//we can make data members public b using public keword before data tpes
		 // but to achieve encapsulation , getters and setters are implemented
			  static int nextId; // Static variable to auto-increment the ID
		private   int id;
		 private String title;
		private String author;
		private  int year;
		  static Scanner obj;
		public  Book(String t, String a, int y) {
		 id = nextId++; // Assign the next available ID and increment it
		 title = t;
		 author = a;
		 year = y;
		 obj=new Scanner(System.in);
		 }
		 public //static
		 void display() {
		 System.out.print("ID: " + id + " Title: " + title + " by " + author + "(" + year +
				 ")" );
		 }
		 /*****************ADDED FUNCS******************/
		 
		 static {
				nextId=1;
			}
		 
		public  Book() {
 		//	nextId=1; // Static variable to auto-increment the ID
		id=nextId;
		 title="";
		  author="";
		  year=0;
			 obj=new Scanner(System.in);

		}
		 
		public void setTitle(String title) {
			this.title=title;
		}
		public String getTitle() {
			return this.title;
		}
		public void setAuthor(String author) {
			this.author=author;
		}
		public String getAuthor() {
			return this.author;
		}
		public void setYear(int year) {
			this.year=year;
		}
		public int getYear() {
			return this.year;
		}
		public void setId(int id) {
			this.id=id;
		}
		 public int getID() {
			 return this.id;
		 }
		public static Book getBook() {
			 System.out.println("Enter the title of the book: ");

			  String title=obj.next();
			 
			  System.out.println( "Enter the author of the book: ");
			String author=obj.next();
			 
			 System.out.println("Enter the year of publication of the book: ");
			 int year=0;
			 
			  boolean validInput = false;

		        while (!validInput) {
		            System.out.print("Enter an integer: ");
		            if (obj.hasNextInt()) {
		            	year = obj.nextInt();
		            	if(year>0) {
		                validInput = true;  
		                }
		            } else {
		                System.out.println("Invalid input. Please enter an integer.");
		                obj.next(); 
		            }
		        }
			 
			 
			 
			 
			 
			 
			 Book  book= new Book(title, author, year);
			  
			 return book;
 		} 
		 }
		 


package scdC;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Newspaper extends Item {

	private static String publisher;
	private Date date;
	static Scanner obj = new Scanner(System.in);

	public Newspaper(String t, boolean b, int p, int c, String pp, Date d) {

		super(t, b, p, c);
		id = nextId++; // Assign the next available ID and increment it

		date = d;
 
		publisher = pp;
	}

	@Override
	public void displayInfo() {

		super.displayInfo();
		System.out.println("Date of publishing: " + date);
		System.out.println("Publisher name " + publisher+"\n\n");

	}

	/***************** ADDED FUNCS ******************/

	 

	public Newspaper() {
		// nextId=1; // Static variable to auto-increment the ID
		super();
		date = new Date();
		this.publisher = " ";

	}

	public void setDate(Date d) {
		date = d;
	}

	public Date getDate() {
		return this.date;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String p) {
		this.publisher = p;
	}

	 @Override
	 public double calculate() {
		 
		 	double 	ncost=10+5;
		return ncost;
		

	}

	public static Newspaper getNewspaper() {
		System.out.println("Enter the title of the Newspaper: ");

		String title1 = obj.next();

		System.out.println("Enter the name of Publisher of the Newspaper: ");
		String publisher1 = obj.next();

		Date parsedDate = null;

		System.out.println("Enter the Cost of Newspaper ");
		boolean validInput = false;
		int cost = 0;
		while (!validInput) {
			System.out.print("Enter an integer: ");
			if (obj.hasNextInt()) {
				cost = obj.nextInt();
				if (cost > 0) {
					validInput = true;
				}
			} else {
				System.out.println("Invalid input. Please enter an integer.");
				obj.next();
			}
		}

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		boolean flag = true;
		while (flag == true) {
			System.out.print("Enter a date (dd/MM/yyyy) ");
			String input = obj.next();
			try {
				parsedDate = sdf.parse(input);
				System.out.println("Input date: " + sdf.format(parsedDate));

				flag = false;

			} catch (ParseException e) {
				System.out.println("Invalid date format. Please enter a date in dd/MM/yyyy format.");
				flag = true;
			}
		}

		Newspaper n = new Newspaper(title1, false, 0, cost, publisher1, parsedDate);

		return n;
	}
}

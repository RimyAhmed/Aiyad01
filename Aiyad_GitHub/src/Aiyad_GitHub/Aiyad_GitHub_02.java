package Aiyad_GitHub;

import java.util.Scanner;

public class Aiyad_GitHub_02 {

	public static void main(String[] args) {
			// predefined standard input object
			Scanner Identity = new Scanner(System.in);
			
			System.out.println("Write your Name only !");		
			String name = Identity.nextLine();
			System.out.println("Gender !");
			char gender = Identity.next().charAt(0);
			System.out.println("Write your Age !");
			int age = Identity.nextInt();
			System.out.println("Write your phone Num !");
			long mobileNo = Identity.nextLong();
			System.out.println("Write your CGPA !");
			double cgpa = Identity.nextDouble();
			System.out.println();
	  // Print the values to check if input was correctly obtained.
			System.out.println("Name: "+name);
			System.out.println("Gender: "+gender);
			System.out.println("Age: "+age);
			System.out.println("Mobile Number: "+mobileNo);
			System.out.println("CGPA: "+cgpa);
			
		} //main
	
	} //class

		



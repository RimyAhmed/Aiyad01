package Aiyad_GitHub;

import java.util.Scanner;

public class Aiyad_GitHub_01 {   // https://github.com/AiyadAhmed/Aiyad01.git

	public static void main (String args[]){
		
		System.out.println("My first GIT project"+"\n");
		System.out.println("Welcome to my IT World"+"\n");
		
		int g []= new int [5];
		
		g [1]= 80;
		g [2]= 70;
		g [3]= 50;
		g [4]= 40;
		
		for (int i =1; i<g.length; i++){
		
		System.out.println("Enter Your id num .....");
		Scanner j = new Scanner (System.in);
		String u = j.next();
		
		if ( g[i] == 80 ){
			System.out.println("Your Result is Grade A "+"\n");
		
		}
		else if ( g[i] == 70 ){
			System.out.println("Your Result is Grade B "+"\n");
		}
		else if ( g[i] == 50 ){
			System.out.println("Your Result is Grade C "+"\n");
		}
		else if ( g[i] == 40 ){
			System.out.println("Your Result is Grade D "+"\n");
		}
		
			System.out.println("hello");
	} //loop
		
	} //main
	
	
} // class

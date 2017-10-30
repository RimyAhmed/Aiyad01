package Aiyad_GitHub;

import java.util.Scanner;

public class Aiyad_GitHub_01 {  // https://github.com/AiyadAhmed/Aiyad01.git

	public static void main (String args[]){
		
		System.out.println("My first GIT project");
		System.out.println("Welcome to my IT World"+"\n");
		
		int g []= new int [5];
		
		g [1]= 80;
		g [2]= 70;
		g [3]= 50;
		g [4]= 40;
		
	
		
	for (int i =1; i<g.length; i++){
		
		System.out.println("Enter Your id num .....");
		Scanner j = new Scanner (System.in);
		String u = j.nextLine();
		
		if ( g[i] == 80 ){
			System.out.println("Your Result is Grade A "+"\n");
		}
		if ( g[i] == 70 ){
			System.out.println("Your Result is Grade B "+"\n");
		}
		if ( g[i] == 50 ){
			System.out.println("Your Result is Grade C "+"\n");
		}
		if ( g[i] == 40 ){
			System.out.println("Your Result is Grade D "+"\n");
		}
	} //loop
		
	} //main
	
	
} // class

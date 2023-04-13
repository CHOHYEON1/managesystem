package managesystem;

import java.util.Scanner;



public class manage1 {

	public static void main(String[] args) {

		int num = 0;
		Scanner input = new Scanner(System.in);
		Musicmanager musicmanager = new Musicmanager(input);
		
		while(num !=5) {
			System.out.println("**Music Library Managemant System**");
			System.out.println("1. add music");
			System.out.println("2. delete music");
			System.out.println("3. edit music imformation");
			System.out.println("4. view music imformations");	
			System.out.println("5. exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			
			switch(num) {
				case 1: 
					musicmanager.addmusic();
					break;
				case 2: 
					musicmanager.deletemusic();
					break;
				case 3: 
					musicmanager.editmusic();
					break;
				case 4: 
					musicmanager.viewmusics();
					break;
				
			}
		}
	}
	
	
	
}
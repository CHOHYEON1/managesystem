package managesystem;

import java.util.Scanner;

public class manage1 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6) {
			System.out.println("**Music Library Managemant System**");
			System.out.println("1. add music");
			System.out.println("2. delete music");
			System.out.println("3. edit music imformation");
			System.out.println("4. view music imformation");	
			System.out.println("5. show a menu");
			System.out.println("6. exit");
			System.out.println("Select one number between 1-6");
			num = input.nextInt();
			
			switch(num) {
				case 1: 
					addmusic();
					break;
				case 2: 
					deletemusic();
					break;
				case 3: 
					editmusic();
					break;
				case 4: 
					viewmusic();
					break;
				
			}
		}
	}
	
	
	public static void addmusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Music name: ");
		String musicname = input.next();
		System.out.print("Singer: ");
		String Singer = input.next();
		System.out.print("Release year: ");
		int Releaseyear = input.nextInt();
		System.out.print("Genre: ");
		String Genre = input.next();
		
	}
	
	
	
	public static void deletemusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Music name: ");
		String musicname = input.next();
	}
	
	
	public static void editmusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Music name: ");
		String musicname = input.next();
	}
	
	public static void viewmusic() {
		Scanner input = new Scanner(System.in);
		System.out.print("Music name: ");
		String musicname = input.next();
	}

}
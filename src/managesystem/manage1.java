package managesystem;

import java.util.Scanner;

public class manage1 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6) {
			System.out.println("1. add music");
			System.out.println("2. delete music");
			System.out.println("3. edit music imformation");
			System.out.println("4. view music imformation");	
			System.out.println("5. show a menu");
			System.out.println("6. exit");
			num = input.nextInt();
			switch(num) {
				case 1: 
					System.out.print("Music name: ");
					String musicname = input.next();
					System.out.print("Singer: ");
					String Singer = input.next();
					System.out.print("Release year: ");
					int Releaseyear = input.nextInt();
					System.out.print("Genre: ");
					String Genre = input.next();
					break;
				case 2: 
				case 3: 
				case 4: 
					System.out.print("music name: ");
					String musicname2 = input.next();
				
			}
		}
	}

}
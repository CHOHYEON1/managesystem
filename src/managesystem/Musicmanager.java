package managesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Musicmanager {
	
	ArrayList<Music> musics = new ArrayList<Music>();
	Scanner input;
	
	Musicmanager(Scanner input){
		this.input = input;
	}
	
	public void addmusic() {
		Music music = new Music();
		System.out.print("Music name: ");
		music.musicname = input.next();
		System.out.print("Singer: ");
		music.singer = input.next();
		System.out.print("Release year: ");
		music.releaseyear = input.nextInt();
		System.out.print("Genre: ");
		music.genre = input.next();
		musics.add(music);
		
	}
	
	
	
	public void deletemusic() {
		System.out.print("Music name: ");
		String musicname = input.next();
		int index = -1;
		for(int i=0;i<musics.size();i++) {
			if(musics.get(i).musicname.equals(musicname)) {
				index = i;
				break;				
			}
		}
		if(index>= 0) {
			musics.remove(index);
			System.out.println("the music" + musicname+" is deleted");			
		}
		else {
			System.out.println("the student has not been registered");
			return;
		}
	
		
	}
	
	
	public void editmusic() {
		System.out.print("Music name: ");
		String musicname = input.next();
		for(int i=0;i<musics.size();i++) {
			Music music = musics.get(i);
			if(music.musicname.equals(musicname)) {
				int num = -1;
				while(num!=5) {
					System.out.println("**Music Info Edit Menu**");
					System.out.println("1. Edit name");
					System.out.println("2. Edit Singer");
					System.out.println("3. Edit Release year");
					System.out.println("4. Edit Genre");	
					System.out.println("5. exit");
					System.out.println("Select one number between 1-6");
				    num = input.nextInt();
					switch(num) {
						case 1:
							System.out.print("Music name: ");
							music.musicname = input.next();
						case 2:
							System.out.print("Singer: ");
							music.singer = input.next();
						case 3:
							System.out.print("Release year: ");
							music.releaseyear = input.nextInt();
						case 4:
							System.out.print("Genre: ");
							music.genre = input.next();
							
					
					}//switch
				}//while
				break;
			}//if
		}//for
	}
	
	public void viewmusics() {
//		System.out.print("Music name: ");
//		String musicname = input.next();
		for(int i=0;i<musics.size();i++) {
			musics.get(i).printInfo();
		}

	}


}

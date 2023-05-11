package managesystem;

import java.util.ArrayList;
import java.util.Scanner;

import music.Japenmusic;
import music.Koreamusic;
import music.Music;
import music.Musicinput;
import music.Musickind;
import music.USAmusic;

public class Musicmanager {
	
	ArrayList<Musicinput> musics=new ArrayList<Musicinput>();
	Scanner input;
	   
	Musicmanager(Scanner input){
		this.input=input;
	}
	   
	public void addmusic() {
		int kind = 0;
		Musicinput musicinput;
		while(kind != 1&& kind!=2 && kind !=3) {
			System.out.println("1 for KoreaMusic.");
			System.out.println("2 for JapenMusic.");
			System.out.println("3 for USAMusic.");
			System.out.print("Select num 1, 2 or 3 for Music Kind:");
			kind = input.nextInt();
			if(kind == 1) {
				musicinput=new Koreamusic(Musickind.Koreamusic);
				musicinput.getUserInput(input);
			    musics.add(musicinput);
				break;
			}
			else if (kind == 2) {
				musicinput=new Japenmusic(Musickind.Japenmusic);
				musicinput.getUserInput(input);
			    musics.add(musicinput);
				break;
			}
			else if (kind == 3) {
				musicinput=new USAmusic(Musickind.USAmusic);
				musicinput.getUserInput(input);
			    musics.add(musicinput);
				break;
			}
			else {
				System.out.print("Select num 1, 2 or 3 for Music Kind:");
			}
		}
	}
	   
	public void deletemusic() {
		System.out.print("Music Name:");
	    String MusicName=input.next();
	    int index=-1;
	    for(int i=0;i<musics.size();i++) {
	    	if(musics.get(i).getMusicName().equals(MusicName)) {
	    		index=i;
	            break;
	        }
	    }
	    if(index>=0) {
	    	musics.remove(index);
	        System.out.println("the music"+MusicName+"is deleted");
	    }
	    else {
	        System.out.println("the music has not been registered");
	    }
	}
	   
	public void editmusic() {
		System.out.print("Music Name:");
	    String musicname=input.next();
	    for(int i=0;i<musics.size();i++) {
	    	Musicinput musicinput=musics.get(i);
	        if(musicinput.getMusicName().equals(musicname)) {
	        	int num=-1;
	            while(num!=5) {
	            	System.out.println("*** Music Info Edit Meun ***");
	            	System.out.println("1.Edit Name");
	            	System.out.println("2.Edit Singer");
	            	System.out.println("3.Edit ReleaseYear");
	            	System.out.println("4.Edit Genre");
	            	System.out.println("5.Exit");
	            	System.out.println("Select one number between 1~5");
	            	num=input.nextInt();
	            	switch(num) {
	            	case 1:
	            		System.out.println("Music Name:");
	            		String MusicName=input.next();
	            		musicinput.setMusicName(MusicName);
	            		break;
	            	case 2:
	            		System.out.println("Music Singer:");
	            		String Singer=input.next();
	            		musicinput.setSinger(Singer);
	            		break;
	            	case 3:
	            		System.out.println("Music ReleaseYear:");
	            		int ReleaseYear=input.nextInt();
	            		musicinput.setReleaseYear(ReleaseYear);
	            		break;
	            	case 4:
	            		System.out.println("Music Genre:");
	            		String Genre=input.next();
	            		musicinput.setGenre(Genre);
	            		break;
	            	}//switch
	            }//while
	            break;
	        }//if
	    }//for
	}
	public void viewmusics() {
		System.out.println("# of registered musics: " + musics.size());
		for(int i=0;i<musics.size();i++) {
			musics.get(i).printInfo();
	    }
	}
}
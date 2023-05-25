package managesystem; 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;
import music.Japenmusic;
import music.Koreamusic;
import music.Music;
import music.Musicinput;
import music.Musickind;
import music.USAmusic;
 
public class Musicmanager implements Serializable {

	private static final long serialVersionUID = 425665109987684127L;
	ArrayList<Musicinput> musics=new ArrayList<Musicinput>();
	transient Scanner input;
	Musicmanager(Scanner input){
		this.input=input;
	}
      
	public void addmusic() {
		int kind = 0;
		Musicinput musicinput;
		while(kind<1||kind >3) {
			try {
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
					System.out.println("Select num 1, 2 or 3 for Music Kind:");
				}	
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1~3!");
				if(input.hasNext()) {
					input.next();
				}
				kind=-1;
			}
		}
	}
      
	public void deletemusic() {
		System.out.print("Music Name:");
		String musicname=input.next();
		int index=findIndex(musicname);
		removeFromMusics(index,musicname);
	}
   
	public int findIndex(String musicname) {
		int index=-1;
		for(int i=0;i<musics.size();i++) {
			if(musics.get(i).getMusicName().equals(musicname)) {
				index=i;
				break;
			}
		}
		return index;
	}
   
	public int removeFromMusics(int index,String musicname) {
		if(index>=0) {
			musics.remove(index);
			System.out.println("the music"+musicname+"is deleted");
			return 1;
		}
		else {
			System.out.println("the music has not been registered");
			return -1;
		}
	}
   
	public void editmusic() {
		System.out.print("Music Name:");
		String musicname=input.next();
		for(int i=0;i<musics.size();i++) {
			Musicinput music=musics.get(i);
			if(music.getMusicName().equals(musicname)) {
				int num=-1;
				while(num!=5) {
					showEditMenu();
					num=input.nextInt();
					switch(num) {
					case 1:
						music.setMusicName(input);
						break;
					case 2:
						music.setMusicName(input);
						break;
					case 3:
						music.setMusicReleaseYear(input);
						break;
					case 4:
						music.setMusicGenre(input);
						break;
					default:
						continue;
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
   
	public void showEditMenu() {
		System.out.println("*** Music Info Edit Meun ***");
		System.out.println("1.Edit Name");
		System.out.println("2.Edit Singer");
		System.out.println("3.Edit ReleaseYear");
		System.out.println("4.Edit Genre");
		System.out.println("5.Exit");
		System.out.println("Select one number between  1~5");
	}

	}
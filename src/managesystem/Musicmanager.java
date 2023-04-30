package managesystem;

import java.util.ArrayList;
import java.util.Scanner;

import music.Japenmusic;
import music.Music;

public class Musicmanager {
	
	   ArrayList<Music> musics=new ArrayList<Music>();
	   Scanner input;
	   
	   Musicmanager(Scanner input){
	      this.input=input;
	   }
	   
	   public void addmusic() {
		  int kind = 0;
		  Music music;
		  while(kind != 1&& kind!=2 && kind !=3) {
			  System.out.print("1 for KoreaMusic, ");
			  System.out.print("2 for JapenMusic");
			  System.out.print("Select num for Kind:");
			  kind = input.nextInt();
			  if(kind == 1) {
				  music=new Music();
				  music.getUserInput(input);
			      musics.add(music);
				  break;
			  }
			  else if (kind == 2) {
				  music=new Japenmusic();
				  music.getUserInput(input);
			      musics.add(music);
				  break;
			  
			  }
			  else {
				  System.out.print("Select num for Kind:");
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
	         Music music=musics.get(i);
	         if(music.getMusicName().equals(musicname)) {
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
	            music.setMusicName(MusicName);
	            break;
	         case 2:
	        	 System.out.println("Music Singer:");
		         String Singer=input.next();
		         music.setSinger(Singer);
	             break;
	         case 3:
	            System.out.println("Music ReleaseYear:");
	            int ReleaseYear=input.nextInt();
	            music.setReleaseYear(ReleaseYear);
	            break;
	         case 4:
	            System.out.println("Music Genre:");
	            String Genre=input.next();
	            music.setGenre(Genre);
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
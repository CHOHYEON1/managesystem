package managesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Musicmanager {
	
	 ArrayList<Music> musics=new ArrayList<Music>();
	   Scanner input;
	   
	   Musicmanager(Scanner input){
	      this.input=input;
	   }
	   
	   public void addmusic() {
	      Music music=new Music();
	      System.out.print("Music Name:");
	      music.MusicName=input.next();
	      System.out.print("Singer:");
	      music.Singer=input.next();
	      System.out.print("Release Year:");
	      music.ReleaseYear=input.nextInt();
	      System.out.print("Genre:");
	      music.Genre=input.next();
	      musics.add(music);
	   }
	   
	   public void deletemusic() {
	      System.out.print("Music Name:");
	      String MusicName=input.next();
	      int index=-1;
	      for(int i=0;i<musics.size();i++) {
	         if(musics.get(i).MusicName.equals(MusicName)) {
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
	         if(music.MusicName.equals(musicname)) {
	            int num=-1;
	            while(num!=5) {
	         System.out.println("*** Music Info Edit Meun ***");
	         System.out.println("1.Edit Name");
	         System.out.println("2.Edit ReleaseYear");
	         System.out.println("3.Edit Singer");
	         System.out.println("4.Edit Genre");
	         System.out.println("5.Exit");
	         System.out.println("Select one number between 1~5");
	         num=input.nextInt();
	         switch(num) {
	         case 1:
	            System.out.println("Music Name:");
	            music.MusicName=input.next();
	            break;
	         case 2:
	            System.out.println("Music ReleaseYear:");
	            music.ReleaseYear=input.nextInt();
	            break;
	         case 3:
	            System.out.println("Music Singer:");
	            music.Singer=input.next();
	            break;
	         case 4:
	            System.out.println("Music Genre:");
	            music.Genre=input.next();
	            break;
	            }//switch
	         }//while
	            break;
	            }//if
	         }//for
	      }
	   public void viewmusics() {
	      for(int i=0;i<musics.size();i++) {
	         musics.get(i).printInfo();
	      }
	      }
	}
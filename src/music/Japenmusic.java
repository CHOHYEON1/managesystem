package music;

import java.util.Scanner;

public class Japenmusic extends Music{
	public void getUserInput(Scanner input) {
		   System.out.print("Music Name:");
		      String musicname=input.next();
		      this.setMusicName(musicname);
		      
		      System.out.print("Singer:");
		      String singer=input.next();
		      this.setSinger(singer);
		      
		      char answer = 'x';
		      while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		      {
			      System.out.print("Do you have Release Year? (Y/N)");
			      answer = input.next().charAt(0);
			      if(answer == 'y' || answer == 'Y') {
				      System.out.print("Release Year:");
				      int releaseYear=input.nextInt();
				      this.setReleaseYear(releaseYear);
				      break;
			      }
			      else if(answer == 'n' || answer == 'N') {
			    	  this.setReleaseYear(0000);
			    	  break;
			      }
			      else {
			      }
		      }
		      
		      System.out.print("Genre:");
		      String genre=input.next();
		      this.setGenre(genre);
	   }
}

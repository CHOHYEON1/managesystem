package music;

import java.util.Scanner;

public class Koreamusic extends Music implements Musicinput{
	
	public Koreamusic(Musickind kind){
        super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Music Name:");
		String musicname=input.next();
		this.setMusicName(musicname);
		
		System.out.print("Singer:");
		String singer=input.next();
		this.setSinger(singer);
		      
		System.out.print("Release Year:");
		int releaseYear=input.nextInt();
		this.setReleaseYear(releaseYear);
		      
		System.out.print("Genre:");
		String genre=input.next();
		this.setGenre(genre);
	}
	
	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		case Koreamusic:
			skind="Kpop.";
			break;
		case Japenmusic:
			skind="Jpop.";
			break;
		case USAmusic:
			skind="USApop.";
			break;
		default:
		}
		System.out.print(" *kind: "+skind);
		System.out.print(" *Music name: "+musicName);
	    System.out.print(" *Music singer: "+singer);
	    System.out.print(" *Music releaseyear: "+releaseYear);
	    System.out.print(" *Music genre: "+genre+"\n");
	}
}

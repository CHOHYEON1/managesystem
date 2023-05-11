package music;

import java.util.Scanner;

public class Japenmusic extends Music implements Musicinput{
	
    public Japenmusic(Musickind kind){
        super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Music Name:");
		String musicname=input.next();
		this.setMusicName(musicname);
		      
		System.out.print("Singer:");
		String singer=input.next();
		this.setSinger(singer);
		      
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
			System.out.print("Do you have Release Year? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Release Year:");
				int releaseYear=input.nextInt();
				this.setReleaseYear(releaseYear);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setReleaseYear(000);
			    break;
			}
			else {
			
			}
    }
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

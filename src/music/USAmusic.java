package music;
 
import java.util.Scanner;

public class USAmusic extends Music implements Musicinput {
	
	protected int singerAge;
	
	public USAmusic(Musickind kind){
        super(kind);
	}
	
	public void setsingerAge(int singerAge) {
		this.singerAge = singerAge;
	}
	
	public int getsingerAge() {
		return singerAge;
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Music Name:");
		String musicname=input.next();
		this.setMusicName(musicname);
		      
		System.out.print("Singer:");
		String singer=input.next();
		this.setSinger(singer);
		      
		char answers = 'z';
		while(answers != 'y' && answers != 'Y' && answers != 'n' && answers != 'N'){
			System.out.print("Do you have Release Year? (Y/N)");
			answers = input.next().charAt(0);
			if(answers == 'y' || answers == 'Y') {
				System.out.print("Release Year:");
				int releaseYear=input.nextInt();
				this.setReleaseYear(releaseYear);
				break;
			}
			else if(answers == 'n' || answers == 'N') {
			    this.setReleaseYear(000);
			    break;
			}
			else {
			
			}
	    }
		   
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
			System.out.print("Do you know singerAge? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("singerAge:");
				int singerAge=input.nextInt();
				this.setsingerAge(singerAge);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setsingerAge(000);
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
	    System.out.print(" *Music genre: "+genre);
	    System.out.print(" *Music singerAge: "+singerAge+"\n");
    }
}

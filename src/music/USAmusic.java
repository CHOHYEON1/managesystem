package music;
 
import java.util.Scanner;

public class USAmusic extends Foreignmusic  {
	
	protected int singerAge;
   
   public USAmusic(Musickind kind){
        super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setMusicName(input);
		setMusicSinger(input);
		setMusicReleaseYearwithYN(input);      
		setSingerAgewithYN(input);   
		setMusicGenre(input);
	}
		
	public void setSingerAgewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
			System.out.print("Do you know singerAge? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				this.setsingerAge(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setAge(00);
				break;
			}
			else {
				
			}
		}
	}
		
    public void printInfo() {
		String skind=getKindString();
	    System.out.print(" *kind: "+skind);
		System.out.print(" *Music name: "+musicName);
	    System.out.print(" *Music singer: "+singer);
	    System.out.print(" *Music releaseyear: "+releaseYear);
	    System.out.print(" *Music genre: "+genre);
	    System.out.print(" *Music singerAge: "+singerAge+"\n");
    }
}


package music; 

import java.util.Scanner;

public abstract class Foreignmusic extends Music {
   
	public Foreignmusic(Musickind kind){
		super(kind);
	}

	public abstract void getUserInput(Scanner input);

	public void printInfo() {
		String skind=getKindString();
		System.out.print(" *kind: "+skind);
		System.out.print(" *Music name: "+musicName);
		System.out.print(" *Music singer: "+singer);
		System.out.print(" *Music releaseyear: "+releaseYear);
		System.out.print(" *Music genre: "+genre);
		System.out.print(" *Music singerage: "+singerAge+"\n");
	}
	public void setMusicReleaseYearwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
			System.out.print("Do you have Release Year? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setMusicReleaseYear(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setReleaseYear(0000);
				break;
			}
			else {
         
			}
		}
	}
}


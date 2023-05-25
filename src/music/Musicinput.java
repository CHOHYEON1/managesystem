package music;  
 
import java.util.Scanner;

import exception.Singerformatexception; 

public interface Musicinput {
	
	public String getMusicName();
	
	public void setMusicName(String musicName);
	
	public void setSinger(String singer) throws Singerformatexception;
	
	public void setReleaseYear(int releaseYear);
	
	public void setGenre(String genre);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setMusicName(Scanner input);
	
	public void setMusicSinger(Scanner input);
	
	public void setMusicReleaseYear(Scanner input);
	
	public void setMusicGenre(Scanner input);
}



package music;
 
import java.util.Scanner; 

public interface Musicinput {
	
	public String getMusicName();
	
	public void setMusicName(String musicName);
	
	public void setSinger(String singer);
	
	public void setReleaseYear(int releaseYear);
	
	public void setGenre(String genre);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
}

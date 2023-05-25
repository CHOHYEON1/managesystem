package music; 
 
import java.util.Scanner; 

public class Koreamusic extends Music {
   
   public Koreamusic(Musickind kind){
        super(kind);

   }
   
   public void getUserInput(Scanner input) {
       setMusicName(input);
       setMusicSinger(input);
       setMusicReleaseYear(input);      
       setMusicGenre(input);
   }
   
   public void printInfo() {
       String skind=getKindString();
       System.out.print(" *kind: "+skind);
       System.out.print(" *Music name: "+musicName);
       System.out.print(" *Music singer: "+singer);
       System.out.print(" *Music releaseyear: "+releaseYear);
       System.out.print(" *Music genre: "+genre+"\n");
   }
}


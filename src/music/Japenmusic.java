package music;  

import java.util.Scanner; 

public class Japenmusic extends Foreignmusic{
   
    public Japenmusic(Musickind kind){
        super(kind);
   }
   
   public void getUserInput(Scanner input) {
      setMusicName(input);
      setMusicSinger(input);
      setMusicReleaseYearwithYN(input); 
      setMusicGenre(input);
    }
   
   
}
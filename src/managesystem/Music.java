package managesystem;


public class Music{

	   String MusicName;
	   String Singer;
	   int ReleaseYear;
	   String Genre;
	   
	   
	   public Music(){
	      
	   }
	   
	   public Music(String name,int releaseyear) {
	      this.MusicName=name;
	      this.ReleaseYear=releaseyear;
	   }
	   
	   public Music(String name,int releaseyear,String singer,String genre) {
	      this.MusicName=name;
	      this.ReleaseYear=releaseyear;
	      this.Singer=singer;
	      this.Genre=genre;
	   }
	   public void printInfo() {
	      System.out.print(" *Music name: "+MusicName);
	      System.out.print(" *Music releaseyear: "+ReleaseYear);
	      System.out.print(" *Music singer: "+Singer);
	      System.out.print(" *Music genre: "+Genre+"\n");
	   }
	}
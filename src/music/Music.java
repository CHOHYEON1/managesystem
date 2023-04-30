package music;

import java.util.Scanner;

public class Music{
	   
	   protected Musickind kind = Musickind.Koreamusic; 
	   protected String MusicName;
	   protected String Singer;
	   protected int ReleaseYear;
	   protected String Genre;
	   
	   
	   public Music(){
	      
	   }
	   
	   public Music(String name,int releaseyear) {
	      this.MusicName=name;
	      this.ReleaseYear=releaseyear;
	   }
	   
	   public Music(String name,String singer,int releaseyear,String genre) {
	      this.MusicName=name;
	      this.ReleaseYear=releaseyear;
	      this.Singer=singer;
	      this.Genre=genre;
	   }
	   
	   public Musickind getKind() {
			return kind;
		}

		public void setKind(Musickind kind) {
			this.kind = kind;
		}

		public String getMusicName() {
			return MusicName;
		}

		public void setMusicName(String musicName) {
			MusicName = musicName;
		}

		public String getSinger() {
			return Singer;
		}

		public void setSinger(String singer) {
			Singer = singer;
		}

		public int getReleaseYear() {
			return ReleaseYear;
		}

		public void setReleaseYear(int releaseYear) {
			ReleaseYear = releaseYear;
		}

		public String getGenre() {
			return Genre;
		}

		public void setGenre(String genre) {
			Genre = genre;
		}
	   
	   public void printInfo() {
	      System.out.print(" *Music name: "+MusicName);
	      System.out.print(" *Music singer: "+Singer);
	      System.out.print(" *Music releaseyear: "+ReleaseYear);
	      System.out.print(" *Music genre: "+Genre+"\n");
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
	}
package music;

import java.util.Scanner;

public class Music{
	   
	protected Musickind kind = Musickind.Koreamusic; 
	protected String musicName;
	protected String singer;
	protected int releaseYear;
	protected String genre;
	   
	   
	public Music(){
		
	}
	   
	public Music(Musickind kind){
		this.kind=kind;
	}
	   
	public Music(String name,int releaseyear) {
	      this.musicName=name;
	      this.releaseYear=releaseyear;
	}
	   
	public Music(String name,String singer,int releaseyear,String genre) {
		this.musicName=name;
	    this.releaseYear=releaseyear;
	    this.singer=singer;
	    this.genre=genre;
	}
	   
	public Music(Musickind kind,String name,String singer,int releaseyear,String genre) {
		this.kind=kind;
		this.musicName=name;
		this.releaseYear=releaseyear;
		this.singer=singer;
		this.genre=genre;
	}
	   
	public Musickind getKind() {
		return kind;
	}

	public void setKind(Musickind kind) {
		this.kind = kind;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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
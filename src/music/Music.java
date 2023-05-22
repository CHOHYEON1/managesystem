package music;

import java.util.Scanner;

import exception.Singerformatexception; 

public abstract class Music implements Musicinput{
	   
	protected Musickind kind = Musickind.Koreamusic; 
	protected String musicName;
	protected String singer;
	protected int releaseYear;
	protected String genre;
	protected int singerAge;
	   
	   
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

	public void setSinger(String singer) throws Singerformatexception{
		if(!singer.contains("a")) {
			throw new Singerformatexception();
		}this.singer = singer;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear){
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	public void setAge(int singerAge) {
		this.singerAge = singerAge;
	}
	
	public int getAge() {
		return singerAge;
	}
	   
	public abstract void printInfo();
	
	public void setMusicName(Scanner input) {
		System.out.println("Music Name:");
		String MusicName=input.next();
		this.setMusicName(MusicName);
	}
	
	public void setMusicSinger(Scanner input) {
		String singer="";
		while(!singer.contains("a")) {
			System.out.println("Music Singer:");
			singer=input.next();
			try {
				this.setSinger(singer);
			} catch (Singerformatexception e) {
				System.out.println("Incorrect singer format.singer name must contains 'a'");
			}
		}
		
	}
	
	public void setMusicReleaseYear(Scanner input) {
		System.out.println("Music ReleaseYear:");
		int	releaseYear=input.nextInt();
		this.setReleaseYear(releaseYear);
	}
	
	public void setMusicGenre(Scanner input) {
		System.out.println("Music Genre:");
		String Genre=input.next();
		this.setGenre(Genre);
	}
	
	public void setsingerAge(Scanner input) {
		System.out.println("Music singerAge:");
		int singerAge=input.nextInt();
		this.setAge(singerAge);
	}
	
	public String getKindString() {
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
		return skind;
	}
}
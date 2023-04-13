package managesystem;


public class Music{
	
	String musicname;
	String singer;
	int releaseyear;
	String genre;
	
	public Music() {}
	
	public Music(String musicname,String singer) {
		this.musicname = musicname;
		this.singer = singer;

	}
	
	public Music(String musicname,String singer,int releaseyear,String genre) {
		this.musicname = musicname;
		this.singer = singer;
		this.releaseyear = releaseyear;
		this.genre = genre;
	}
	
	public void printInfo() {
		System.out.print("Music name: " + musicname);
		System.out.print(" /Singer: " + singer);
		System.out.print(" /Releaseyear: " + releaseyear);
		System.out.println(" /Genre: " + genre);
	}
}
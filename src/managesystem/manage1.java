package managesystem;
 
import java.util.Scanner;

public class manage1 {

	public static void main (String args[]) {
	    int num=0;
	    Scanner input=new Scanner(System.in);
	    Musicmanager musicmanager=new Musicmanager(input);
	    while(num!=5) {
	    	System.out.println("**** Music Management System ****");
	        System.out.println("1.Add Music");
	        System.out.println("2.Delete Music");
	        System.out.println("3.Edit Music");
	        System.out.println("4.View Musics");
	        System.out.println("5.Exit Music");
	        System.out.println("Select one number between 1~6");
	        num=input.nextInt();
	        switch(num) {
	        case 1:
	            musicmanager.addmusic();
	            break;
	        case 2:
	            musicmanager.deletemusic();
	            break;
	        case 3:
	            musicmanager.editmusic();
	            break;
	        case 4:
	            musicmanager.viewmusics();
	            break;
	        }//switch
	    }//while
	}
}
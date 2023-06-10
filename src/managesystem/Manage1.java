package managesystem; 
 
import exception.Singerformatexception;
import gui.WindowFrame;
import log.EventLogger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manage1 {
	static EventLogger logger=new EventLogger("log.txt");

  	public static void main (String args[]) {
	   
  		Scanner input=new Scanner(System.in);
  		Musicmanager musicmanager=getObject("musicmanager.ser");
  		if(musicmanager==null) {
  			musicmanager=new Musicmanager(input);
  		}
       
  		WindowFrame frame=new WindowFrame(musicmanager);
  		selectMenu(input,musicmanager);
  		putObject(musicmanager,"musicmanager.ser");
  	}	
   
  	public static void selectMenu(Scanner input,Musicmanager musicmanager) {
  		int num=-1;
  		while(num!=5) {
  			try{
  				showMenu();
  				num=input.nextInt();
                switch(num) {
                case 1:
                	musicmanager.addmusic();
                	logger.log("add music");
                	break;
                case 2:
                	musicmanager.deletemusic();
                	logger.log("delete music");
                	break;
                case 3:
                	musicmanager.editmusic();
                	logger.log("edit music");
                	break;
                case 4:
                	musicmanager.viewmusics();
                	logger.log("view music");
                	break;
                default:
                	continue;
                }//switch
  			}
  			catch(InputMismatchException e) {
  				System.out.println("Please put an integer between 1~5 !");
  				if(input.hasNext()) {
  					input.next();
               	}
  				num=-1;
  			}//catch
  		}//while
  	}
  	public static void showMenu() {
  		System.out.println("**** Music Management System ****");
  		System.out.println("1.Add Music");
        System.out.println("2.Delete Music");
        System.out.println("3.Edit Music");
        System.out.println("4.View Musics");
        System.out.println("5.Exit Music");
        System.out.println("Select one number between 1~5");
  	}

  	public static Musicmanager getObject(String filename) {
  		Musicmanager musicmanager=null;
	   
  		try {
  			FileInputStream file = new FileInputStream(filename);
  			ObjectInputStream in =new ObjectInputStream(file);
  			musicmanager=(Musicmanager)in.readObject();
  			in.close();
			file.close();
		
  		} catch (FileNotFoundException e) {
  			return musicmanager;
  		} catch (IOException e) {
  			e.printStackTrace();
  		} catch (ClassNotFoundException e) {
  			e.printStackTrace();
  		}
	   
  		return musicmanager;
  	}
   
  	public static void putObject(Musicmanager musicmanager,String filename) {
  		try {
  			FileOutputStream file = new FileOutputStream(filename);
  			ObjectOutputStream out =new ObjectOutputStream(file);
  			out.writeObject(musicmanager);
  			out.close();
  			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
  		}
}
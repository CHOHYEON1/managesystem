package managesystem; //asdasa
 
import exception.Singerformatexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manage1 {


   public static void main (String args[]) {
       Scanner input=new Scanner(System.in);
       Musicmanager musicmanager=new Musicmanager(input);
       selectMenu(input,musicmanager);
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

}
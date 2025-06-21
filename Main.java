import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       Random r = new Random();
       System.out.println(   "Welcome to the ROCK PAPER SCISSORS Game!! [Java]");
       int user = 0;
       int comp = 0;
       String[] option = {"r","p","s"};
       System.out.print("How many rounds do you wanna play?\n>>> ");
       int rounds = x.nextInt();


       while (rounds > 0) {

           System.out.println("Please Chose\n" +

                   "     R - Rock,\n" +
                   "     P - Paper, \n" +
                   "     S - Scissor\n" +
                   "     or Q for Quit");
           System.out.print(">>> ");
           String user_in = x.next().toLowerCase();

           if (user_in.equals("q")) {
               break;
           }

           for (int i = 0; i < option.length; i++) {

               if (user_in.equals(option[i])) {

               }
               else{
                   continue;
               }
           }

           int ran = r.nextInt(2);
           String comp_pick = option[ran];
           System.out.println("Computer chose: "+comp_pick.toUpperCase());
           rounds -=1;

           if (user_in.equals(comp_pick)) {
               System.out.println("Draw!!");
           }
           if (user_in.equals("r") && comp_pick.equals("p")) {
               System.out.println("You won!");
               user += 1;
           }
           else if (user_in.equals("p") && comp_pick.equals("r")) {
               System.out.println("You won!");
               user += 1;
           }
           else if (user_in.equals("s") && comp_pick.equals("p")) {
               System.out.println("You won!");
               user += 1;
           }
           else{
               System.out.println("You lost!\n Computer won!");
               comp += 1;

           }
           System.out.println("Total Rounds Left: "+rounds);
       }

       System.out.println("---------------xx--xx---------------\n Game Over!!");
       System.out.println("You won: "+user+" times");
       System.out.println("Computer won: "+comp+" times");
       if (user == comp){
           System.out.println("Draw Match!");
       } else if ( user > comp) {
           System.out.println("You Win! Computer sucked! Hahaha");
       }
       else{
           System.out.println("You Lost! Computer Smashed you! Hahaha");
       }


    }
}
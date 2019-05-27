import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner scanner = new Scanner(System.in);
        Tournament tournament = new Tournament();
        start(scanner, tournament);
    }

    public static void start(Scanner scanner, Tournament tournament){
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while(true){
            System.out.print("  Participant name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                System.out.println();
                System.out.println("The tournament begins!");
                System.out.println();
                break;
            }else{
                tournament.add(new Jumper(name));
            }
        }
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = scanner.nextLine();

            if(command.equals("jump")){
                System.out.println();
                tournament.beginRound();
            }else{
                System.out.println("Thanks!");
                System.out.println();
                System.out.println("Tournament results:");
                tournament.printTournamentResults();
                break;
            }
        }
    }




}

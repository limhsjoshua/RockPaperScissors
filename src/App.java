import java.util.Random;  //importing random library
import java.util.Scanner;  //importing scanner library

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Rock, Paper, or Scissors!");
        System.out.print("User's move: ");
        String userInput = scanner.nextLine(); //creating variable userInput and assigning it the value of the user's input. nextLine() is a method of the Scanner class that reads strings.
        

        
        Random rand = new Random(); //creating/intialising random object
        int randomInteger = rand.nextInt(3); //generating random integer
        //System.out.println(randomInteger); //printing random integer


        String[] handSigns = {"Rock", "Paper", "Scissors"}; //creating array of hand signs (arrays in Java use curly brackets). String[] is declared first because this is the data type within the handSigns array: strings

        String computer = handSigns[randomInteger]; //creating variable computer and assigning it the value of the random integer (0, 1, or 2)
        System.out.println("Computer's move: " + computer); //printing computer

        String winner = ""; //creating variable winner and assigning it the value of an empty string
        
        //comparison by value in Java =/= Javascript. In Javascript when you use ==, it compares the value. But in Java == compares the reference. Instead, in Java, we use .equals() to compare the value.
        if ((userInput.equals("Paper") && computer.equals("Rock"))||(userInput.equals("Rock") && computer.equals("Scissors"))||
        (userInput.equals("Scissors") && computer.equals("Paper"))) {
            winner = "Player";
        } else if ((userInput.equals("Rock") && computer.equals("Paper"))||(userInput.equals("Scissors") && computer.equals("Rock"))||
        (userInput.equals("Paper") && computer.equals("Scissors"))){
            winner = "Computer";
        } else {
            winner = "No one wins!";
        }

        System.out.println("The winner is: " + winner); //printing winner

    }
}

// return random number between 0 to 2 ('scissor' 'paper' 'stone')
//take in user input
// bunch of if else statements to determine winner (scissor beats paper, paper beats stone, stone beats scissor)

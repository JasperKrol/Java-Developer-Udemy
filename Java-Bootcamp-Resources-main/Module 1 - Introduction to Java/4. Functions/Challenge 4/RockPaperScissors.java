import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String playerReady = scan.nextLine();

        //Task 1: See if the user wants to play.

        if (playerReady.equalsIgnoreCase("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock – paper – scissors, shoot!");
            String yourChoice = scan.next();
            String computerChoice = computerChoice();
            String result = result(yourChoice,computerChoice);
            printResult(yourChoice, computerChoice, result);

        } else {
            System.out.println("Darn, some other time...");
        }


        scan.close();
    }

    //Task 3  – Write a function where the computer picks a random choice.

    public static String computerChoice() {
        double randomNumber = Math.random() * 2;
        int integer = (int) randomNumber;
        String computerChoice = "";

        if (integer == 0) {
            return computerChoice = "Rock";
        } else if (integer == 1) {
            return computerChoice = "Paper";
        } else if (integer == 2) {
            return computerChoice = "Scissors";
        }
        return computerChoice;
    }


    //Task 4  – Write a function that compares the choices and returns the result.
    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) {
            result = "You win!";
        } else if (yourChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("paper")) {
            result = "You lose!";
        } else if (yourChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) {
            result = "You win!";
        } else if (yourChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper")) {
            result = "You win!";
        }   else if (yourChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("rock")) {
            result = "You lose!";
        }  else if (yourChoice.equalsIgnoreCase(computerChoice)) {
            result = "It's a tie!";
        }
        return result;
    }

    //Task 5  – Write a function that prints your choice, the computer's, and the result.

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose:\t" + yourChoice);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println(result);
    }

}

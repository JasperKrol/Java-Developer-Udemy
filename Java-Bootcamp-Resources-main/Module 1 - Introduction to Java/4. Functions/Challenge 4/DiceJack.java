import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        int diceRoll1 = rollDice();
        int diceRoll2 = rollDice();
        int diceRoll3 = rollDice();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three numbers between 1 and 6 for dice roll");

        int guess1 = scanner.nextInt();
        int guess2 = scanner.nextInt();
        int guess3 = scanner.nextInt();

        if (guess1 < 1 || guess2 < 1 || guess3 < 3) {
            System.out.println("cannot be less than 1");
            System.exit(0);
        }

        if (guess1 > 6 || guess2 > 6 || guess3 > 6) {
            System.out.println("cannot be more than 6");
            System.exit(0);
        }

        int sumOfNumbers = guess1 + guess2 + guess3;
        int sumDiceRoll = diceRoll1 + diceRoll2 + diceRoll3;

        if (checkWin(sumOfNumbers,sumDiceRoll)) {
            System.out.println("you win");
        } else {
            System.out.println("you won");
        }

        scanner.close();

    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }

    public static boolean checkWin(int sumOfNumbers, int sumDiceRoll) {
        return (sumDiceRoll < sumOfNumbers && sumOfNumbers - sumDiceRoll < 3);
    }
}

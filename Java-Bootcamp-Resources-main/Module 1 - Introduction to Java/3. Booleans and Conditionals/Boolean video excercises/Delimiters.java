import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int number = scanner.nextInt();

        scanner.nextLine();
        System.out.println("write a sentence");
        String sentence = scanner.nextLine();

        // next int pakt op en de volgende regel pakt de enter/spatie zodat de volgende hem gewoon oppakt.
    }
}

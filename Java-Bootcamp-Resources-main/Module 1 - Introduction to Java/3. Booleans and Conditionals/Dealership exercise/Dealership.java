import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the dealership");
        System.out.println("Press A to buy a car");
        System.out.println("Press B to sell a car");

        String option = scanner.nextLine();

        switch (option){
            case "a":
                System.out.println("what is your budget");
                int budget = scanner.nextInt();
                if (budget >= 10000) {
                    System.out.println("a Nissan is available");
                    scanner.nextLine();
                    System.out.println("\ndo you have insurance, yes or no");
                    String insurance = scanner.nextLine();
                    System.out.println("\ndrivers licence? yes or no");
                    String driversLicense = scanner.nextLine();
                    System.out.println("\ncredit score?");
                    int creditScore = scanner.nextInt();
                    if (insurance.equalsIgnoreCase("yes") && driversLicense.equalsIgnoreCase("yes") && creditScore > 660) {
                        System.out.println("Sold");
                    } else {
                        System.out.println("You are not granted");
                    }
                } else {
                    System.out.println("no cars available under 10k");
                }
                break;
            case "b":
                System.out.println("what is the value of your car");
                int value = scanner.nextInt();
                System.out.println("selling price?");
                int sellingPrice = scanner.nextInt();
                if (value > sellingPrice && sellingPrice < 30000){
                    System.out.println("bought your car");
                } else {
                    System.out.println("sorry not interested.");
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        scanner.close();

    }
}

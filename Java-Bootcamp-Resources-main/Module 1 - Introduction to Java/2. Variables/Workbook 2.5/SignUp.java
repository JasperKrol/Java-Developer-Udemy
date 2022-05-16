import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("your name pls");
        String name = scan.nextLine();
        //Ask for their last name.
        System.out.println("last name pls");
        String lastname = scan.nextLine();
        //Ask: how old are you?
        System.out.println("age");
        int age = scan.nextInt();
        //Ask them to make a username.
        System.out.println("choose username");
        String username = scan.nextLine();
        //Ask what city they live in.
        System.out.println("city u live");
        String city = scan.nextLine();

        //Ask what country that's from.
        System.out.println("country u live in");
        String country = scan.nextLine();


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:
        System.out.println("Thank you for joining JavaGram!");

        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " +name);
        System.out.println("\tLast Name: " + lastname);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        //close scanner. It's good practice :D !
        scan.close();
        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //



    }
}
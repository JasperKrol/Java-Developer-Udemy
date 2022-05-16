public class Scanner {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("\nwelcome blablalba");
        System.out.println("\nwhat is your name?");
        String name = scanner.nextLine();
        System.out.println("\nyour name = " + name);
        System.out.println("\nhow much do you spend on bidoe FF");
        double costs = scanner.nextDouble();
        System.out.println("\nkosten" + costs);

        // belangrijk als je klaar bent met de input van de scanner
        scanner.close();

        // mogelijke oplossing voor . of , in je scanner
//        import java.util.Locale;
        //
        //        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
    }


}

public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");


        if (wallet >= toyCar){
            wallet -= toyCar;
            System.out.println("you can buy the car, and have " + wallet + " left");
        } else {
            System.out.println("not enought money, you have " + wallet + ". Thats $" + (toyCar - wallet) + " short");
        }
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.

        
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");


        if (wallet >= nike){
            wallet -= nike;
            System.out.println("you can buy the car, and have " + wallet + " left");
        } else {
            System.out.println("not enought money, you have " + wallet + ". Thats $" + (nike - wallet) + " short");
        }
        //if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.

    }
}
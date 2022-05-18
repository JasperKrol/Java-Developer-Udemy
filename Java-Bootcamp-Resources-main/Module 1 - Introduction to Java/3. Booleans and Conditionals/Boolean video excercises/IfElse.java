public class IfElse {
    public static void main(String[] args) {

        double grade = 5;

        if (grade >= 8) {
            System.out.println("you passed with an A");
        } else if (grade >= 7){
            System.out.println("you passed with an B");
        } else if (grade >= 6){
            System.out.println("you passed with an C");
        } else if (grade >= 9){
            System.out.println("you passed with an A");
        } else {
            System.out.println("failed");
        }

    }
}

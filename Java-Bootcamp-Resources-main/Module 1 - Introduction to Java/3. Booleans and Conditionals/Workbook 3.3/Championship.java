public class Championship {
    public static void main(String[] args) {

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        int margin = gryffindor - ravenclaw;


        if (margin >= 300) {
            System.out.println("Gryffindor are the champions");
        } else if (margin >= 0) {
            System.out.println("Gryffindor is in second place");
        } else if (margin >= -100) {
            System.out.println("Gryffindor is in third place");
        } else {
            System.out.println("Gryffindor is in fourth place");
        }
    }
}
public class LogicalOperators {
    public static void main(String[] args) {

        // || or && and

        double gradeA = 6.5;
        double gradeB = 8;
        String javaCurriculum = "java";

        if (gradeA > 7 || gradeB > 6.5 || javaCurriculum.equals("java")){
            System.out.println("je mag beginnen");
        } else {
            System.out.println("helaas volgend jaar nieuwe kansen");
        }

        int credits = 56;
        double GPA = 3.2;

        if (credits >= 40 && GPA >= 2.0){
            System.out.println("geslaagd");
        } else {
            System.out.println("gezakt");
        }
    }
}

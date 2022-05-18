public class WorkSchedule {
    public static void main(String[] args) {
        int day = 3;
        boolean holiday = true;
        String text = "";

        if (day == 6 || day == 7) {
            text = "it's the weekend, no work!";
            System.out.println(text);
        } else if (holiday) {
            text = "woohoo, no work!";
            System.out.println(text);
        } else {
            System.out.println("Wake up at 7:00 :( ");
        }
    }

}

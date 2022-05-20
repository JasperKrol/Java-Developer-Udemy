public class Parameters {
    public static void main(String[] args) {
        measureRectangle(4.5,2.2);

    }

    public static void measureRectangle(double length, double width) {
        double area = length * width;
        System.out.println("area = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zack, 27");

        Person person2 = person;
        System.out.println(person2 == person);
        
    } 
}

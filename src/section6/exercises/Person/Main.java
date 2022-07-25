package section6.exercises.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("Mietek");
        person.setLastName("Żul");
        person.setAge(55);

        System.out.println(person.isTeen());
        System.out.println(person.getFullName());
    }
}

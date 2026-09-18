package software.ulpgc.kata1;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ana", LocalDate.of(2000, 5, 12));

        System.out.println("Su nombre es: " + person.getName());
        System.out.println("La edad de esta persona es de: " + person.getAge() + " años");
    }
}
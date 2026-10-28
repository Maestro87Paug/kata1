package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(
                "Ana",
                LocalDate.of(2000, 5, 12)
        );

        System.out.println("Nombre: " + person.getName());
        System.out.println("Nacimiento: " + person.getBirthDate());
        System.out.println("Edad aproximada: " + person.getAge());
    }
}
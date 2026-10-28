package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    private static final double DAYS_PER_YEAR = 365.25;

    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        if (birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException(
                    "La fecha de nacimiento no puede ser futura"
            );
        }

        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int calculateAge() {
        long days = LocalDate.now().toEpochDay()
                - birthDate.toEpochDay();

        return (int) (days / DAYS_PER_YEAR);
    }
}
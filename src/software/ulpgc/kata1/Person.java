package software.ulpgc.kata1;
import java.time.LocalDate;


public class Person {
    private final LocalDate birthDate;
    private final String name;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public static final double DAYS_PER_YEAR = 365.25;

    public int getAge() {
        long days = LocalDate.now().toEpochDay() - getBirthDate().toEpochDay();
        return (int) (days/ DAYS_PER_YEAR);
    }
}

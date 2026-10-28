package software.ulpgc.kata1;

import java.time.LocalDate;

public class Student {
    private final String name;
    private final int enrollmentYear;

    public Student(String name, int enrollmentYear) {
        if (enrollmentYear > LocalDate.now().getYear()) {
            throw new IllegalArgumentException(
                    "El año de matrícula no puede ser futuro"
            );
        }

        this.name = name;
        this.enrollmentYear = enrollmentYear;
    }

    public String getName() {
        return name;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public int calculateYearsEnrolled() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - enrollmentYear;
    }
}
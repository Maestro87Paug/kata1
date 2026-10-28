package software.ulpgc.kata1;

import java.time.LocalDate;

public class Student {
    private String name;
    private int enrollmentYear;

    public Student(String name, int enrollmentYear) {
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

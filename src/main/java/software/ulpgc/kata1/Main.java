package software.ulpgc.kata1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Carlos", 2022);

        System.out.println("Estudiante: " + student.getName());
        System.out.println(
                "Año de matrícula: " + student.getEnrollmentYear()
        );
        System.out.println(
                "Años matriculado: "
                        + student.calculateYearsEnrolled()
        );
    }
}
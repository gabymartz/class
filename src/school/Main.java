package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Crear Estudiante");
            System.out.println("2. Crear Profesor");
            System.out.println("3. Imprimir Estudiante(s)");
            System.out.println("4. Imprimir Profesor(es)");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    createStudent();
                    break;
                case "2":
                    createTeacher();
                    break;
                case "3":
                    printStudents();
                    break;
                case "4":
                    printTeachers();
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void createStudent() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese el apellido del estudiante: ");
        String lastname = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el número de semestres del estudiante: ");
        int noOfSemester = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el código del estudiante: ");
        String studentCode = scanner.nextLine();
        Student student = new Student(age, lastname, name, noOfSemester, studentCode);
        students.add(student);
        System.out.println("Estudiante creado exitosamente.");
    }

    private static void createTeacher() {
        System.out.print("Ingrese el nombre del profesor: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese el apellido del profesor: ");
        String lastname = scanner.nextLine();
        System.out.print("Ingrese la edad del profesor: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese los años de experiencia del profesor: ");
        int yearsOfExperience = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el código del profesor: ");
        String teacherCode = scanner.nextLine();
        Teacher teacher = new Teacher(age, lastname, name, yearsOfExperience, teacherCode);
        teachers.add(teacher);
        System.out.println("Profesor creado exitosamente.");
    }

    private static void printStudents() {
        if (students.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de Estudiantes:");
            for (Student student : students) {
                student.printProperties();
            }
        }
    }

    private static void printTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            System.out.println("\nLista de Profesores:");
            for (Teacher teacher : teachers) {
                teacher.printProperties();
            }
        }
    }
}


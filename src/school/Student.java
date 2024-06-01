package school;

public class Student extends Person {
    private int noOfSemester;
    private String studentCode;

    public Student(int age, String lastname, String name, int noOfSemester, String studentCode) {
        super(age, lastname, name);
        this.noOfSemester = noOfSemester;
        this.studentCode = studentCode;
    }

    public int getNoOfSemester() {
        return noOfSemester;
    }

    public String getStudentCode() {
        return studentCode;
    }

    @Override
    public void printProperties() {
        super.printProperties();
        System.out.println("Semestres: " + noOfSemester + ", Código de estudiante: " + studentCode);
    }
}

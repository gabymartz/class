package school;

public class Teacher extends Person {
    private int yearsOfExperience;
    private String teacherCode;

    public Teacher(int age, String lastname, String name, int yearsOfExperience, String teacherCode) {
        super(age, lastname, name);
        this.yearsOfExperience = yearsOfExperience;
        this.teacherCode = teacherCode;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    @Override
    public void printProperties() {
        super.printProperties();
        System.out.println("Años de experiencia: " + yearsOfExperience + ", Código de profesor: " + teacherCode);
    }
}

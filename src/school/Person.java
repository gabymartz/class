package school;

public class Person {
    private int age;
    private String lastname;
    private String name;

    public Person(int age, String lastname, String name) {
        this.age = age;
        this.lastname = lastname;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public void printProperties() {
        System.out.println("Nombre: " + name + ", Apellido: " + lastname + ", Edad: " + age);
    }
}

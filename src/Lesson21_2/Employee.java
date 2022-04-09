package Lesson21_2;

public class Employee {
    private String lastName;
    private int department;

    public Employee(String lastName, int department) {
        this.lastName = lastName;
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }
}

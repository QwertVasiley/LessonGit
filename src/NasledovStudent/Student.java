package NasledovStudent;

public class Student {
    String firstName,lastName,groupe;
    double avgMark;

    public Student() {
    }

    public Student(String firstName, String lastName, String groupe, double avgMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupe = groupe;
        this.avgMark = avgMark;
    }
}

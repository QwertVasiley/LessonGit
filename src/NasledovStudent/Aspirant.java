package NasledovStudent;

public class Aspirant extends Student{
    String work;

    public Aspirant(String firstName, String lastName, String groupe, double avgMark, String work) {
        super(firstName, lastName, groupe, avgMark);
        this.work = work;
    }
}

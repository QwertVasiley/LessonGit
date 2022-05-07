package Lesson23_2;

public class Reader {
    private String name;
    private int age;
    private String lastName;
    private String adress;

    public Reader (String name, int age, String lastName, String adress){
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}

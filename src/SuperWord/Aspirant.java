package SuperWord;

public class Aspirant extends Students{
    private String sex;
    private String color;

    Aspirant(){
    }

    public Aspirant(String firstName, String lastName, String groupe, String sex, String color) {
        super(firstName, lastName, groupe);
        this.sex = sex;
        this.color = color;
    }

    public String getSex() {
        return sex;
    }
    void sayAsp(){
        super.StudentSay();
    }
}

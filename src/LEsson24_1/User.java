package LEsson24_1;

public class User {
    private String name;
    private Sex sex;

    public User (String name, Sex sex){
        this.name = name;
        this.sex = sex;
    }
    public void hello(){
        if(this.sex.equals(Sex.MAN))
            System.out.println("Hello MAN");
        if (this.sex.equals(Sex.WOMAN))
            System.out.println("Hello Girl");
    }
}

package Lesson24;

public class User {
    private String name;
    private StsteEnum ststeEnum;

    public User(String name, StsteEnum ststeEnum) {
        this.name = name;
        this.ststeEnum = ststeEnum;
    }

    public StsteEnum getStsteEnum() {
        return ststeEnum;
    }
}

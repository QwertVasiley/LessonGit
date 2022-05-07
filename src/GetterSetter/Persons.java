package GetterSetter;

public class Persons {
    private String name;
    private int age;
    private boolean presence;

    public Persons(String name, int age, boolean presence) {
        this.name = name;
        this.age = age;
        this.presence = presence;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPresence() { //для boolean приставка "IS"
        return presence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", presence=" + presence +
                '}';
    }
}

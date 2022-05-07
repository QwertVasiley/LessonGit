package GetterSetter;

public class MaimGetterSetter {
    public static void main(String[] args) {
        Persons persons = new Persons("Volodya", 20, true);
        System.out.println(persons);

        persons.setAge(14); //установил age 14

        System.out.println(persons.getAge()); //вывел AGE

        System.out.println("Измененный "+ persons);

    }
}

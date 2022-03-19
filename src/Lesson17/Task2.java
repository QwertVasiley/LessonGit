package Lesson17;

public class Task2 {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.show();
//        Person dimon = new Person(31, "Dimon");
//        dimon.show();
        Person[] persArray = {new Person(15, "Dimon"), new Person(15, "Dimon"), new Person(),
                new Person(15, "Dimon"),new Person(15, "Dimon")};
        System.out.println(countEquals(persArray));
    }

    public static int countEquals(Person[] persArray) { //считает не верно
        int counter = 0;
           for (int i = 0; i < persArray.length; i++) {
            for (int j = i + 1; j < persArray.length; j++) {
                if (persArray[i].equals(persArray[j])) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

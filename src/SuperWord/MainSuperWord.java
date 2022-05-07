package SuperWord;

public class MainSuperWord {
    public static void main(String[] args) {
        Aspirant aspirant = new Aspirant("Pupkin","Egor","N70","M","Blue");
        Students students = new Students("Kozlov","Igor","D21");

        System.out.println(aspirant.groupe); //kolor PRIVATE и поэтому не возвращается
        System.out.println(aspirant.getSex()); //вот тут getter добавил

        System.out.println(students.firstName+ " "+ students.lastName + " " + students.groupe);
        aspirant.StudentSay();
        aspirant.sayAsp();
    }
}

package SuperWord;

public class Students {
    String firstName;
    String lastName;
    String groupe;

    Students (){
    }
    public Students(String firstName, String lastName, String groupe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupe = groupe;
    }

    public void StudentSay(){
        System.out.println("Я самый лучший студент в мире!!!");
    }
}

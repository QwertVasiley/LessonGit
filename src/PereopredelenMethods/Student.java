package PereopredelenMethods;

public class Student {
     String name;
     String groupe;
     double avgMark;

    public Student(String name, String groupe, double avgMark) {
        this.name = name;
        this.groupe = groupe;
        this.avgMark = avgMark;
    }

    public double getSchoalship() {
        System.out.println("Считаем бабки");
        return avgMark == 5 ? 100 : 80; //если avgMArk равно 5 то возващаем 100, иначе 80
    }
}

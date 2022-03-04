package Lesson12_ClassWork;

public class Lesson12_2 {
    public static void main(String[] args) {
        int a=6;
        int d=9;
        sum(a, d);
        String text = "hjdkah"; //этот текст заменится на Hi people
      display (text , 15);
    }
    static void sum (int x,int y ){
        int z = x+y;
        System.out.println(z);
    }
    static void display (String name, int age) {
        System.out.println("Hi people");
        System.out.println(age);
    }
}

package PereopredelenMethods;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "N76", 4);
        Aspirant aspirant = new Aspirant("Dasha", "G31", 5);
        Aspirant aspirant1 = new Aspirant("Sveta","LN89", 3.0);

        Student[] stud = {student, aspirant , aspirant1};

        for (Student st: stud){
            System.out.println(st.getSchoalship());
        }
    }
}

package Lesson12_ClassWork;

public class Lesson12_1 {
    public static void main(String[] args) {
        //МЕтоды
        //Метод Main - точка входа
        //public - доступность
        //ctatic - доступность везде и всегда
        //void - тип возвращаемого элемента
        //main - название метода
        //[] -
        //args -
        //все методы вызываются из Main

        welcome();
        hi();

    }
        public static void welcome() { //public можно убрать
            System.out.println("Welcome to java");

    }
    public static void hi() {
        System.out.println("Hi people ");
    }
}

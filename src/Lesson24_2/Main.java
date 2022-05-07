package Lesson24_2;  //ольга

public class Main {
    public static void main(String[] args) { //исключения
        //Checked - проверяются на этапе компиляции
        //Unchecked - выявляются в ходе работы программы

        try {

        }catch (Exception e){
            System.exit(1); //выйдет на этом этапе из программы

            e.printStackTrace();//программа завершится
        }finally {

        }
    }
}

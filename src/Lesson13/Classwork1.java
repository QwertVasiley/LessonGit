package Lesson13;

import java.util.Arrays;

public class Classwork1 {
    public static void main(String[] args) {

        String str1 = "Java"; // создание с помощью литералов
        String str2 = new String("text2");
        String str3 = new String(new char[]{'h', 'n', 'd', 's'});
        // срока не изменяема, что бы изменить - нужно
        // создать новую строку с изменением
        System.out.println(str1.length());
        char[] charArray = str1.toCharArray();
        System.out.println(Arrays.toString(charArray));

        String s = "";
        System.out.println(s.length()); //выведет число 1

        System.out.println(s.isEmpty()); //поверка на пустоту, отсутствие, если пусто - то TRUE

        String s1 = null;
        if (s1 != null && !s1.isEmpty()) {
            System.out.println(s1.length());
        }
        //concatenation

        String str5 = "Java";
        String str4 = " Hello";
        String str7 = str5 + str4;
        System.out.println(str7);

        String str8 = str1 + 2002;
        System.out.println("Str 8 = " + str8);

        //метод JOIN добавляет разделитель между словами
        String str9 = String.join(", ", str1, str2, str4);
        System.out.println(str9);

        //метод compareTo
        //сравнивает две строки на кол-во символов
        // выводит отритцателное или положительное или ноль


        // метод index
        // находит индекс ПЕРВОГО вхождения
        // второй символ такой же не будет искать

        System.out.println(str5.indexOf('v'));


        // метод replace()
        //заменяет

        //метод trim()
        //обрезает пробелы в строке, первые и последние

        //метод substring()
        // уберет символы в строке до указанного индекса
        //или оставляет только указанный диапазон

        //toUpperCаse меняет регистр
        //toLowerCase меняет регистр

        //split()  позволяет разбивать строку
        // по какуому-то разделителю и складываем в массив





    }
}


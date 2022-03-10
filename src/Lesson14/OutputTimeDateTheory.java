package Lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OutputTimeDateTheory {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        System.out.println("Сейчас : " + date); //выводит текущую дату и время
        Calendar calendar = Calendar.getInstance(); // позволяет изменять дату
//        calendar.add(Calendar.WEEK_OF_MONTH, 2); //прибавили к текущей дате и времени 2 недели
//        System.out.println(calendar.getTime()); // вывели прибавленное значение
//        calendar.add(Calendar.DAY_OF_WEEK_IN_MONTH, 5); //прибавили 5 недель
//        System.out.println(calendar.getTime());
//        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT); //сокращенная дата
//        System.out.println(dateFormat.format(calendar.getTime())); //выводим дату, уже сокращенную
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm"); //вывод в формате Год, Месяц, число
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        Date newDate = simpleDateFormat.parse("1980/07/15 15:20");  //вывело заданную дату
        System.out.println(newDate);
    }
}
package Lesson14;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class OutputDateTime {
    //вывести текущую дату, день недели и время.
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy E HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

    }
}

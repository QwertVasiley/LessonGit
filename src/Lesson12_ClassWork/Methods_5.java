package Lesson12_ClassWork;

public class Methods_5 {
    // По времени пределяем время суток
    // Если время указано не верно, сообщаем об этом
    public static void main(String[] args) {
        String daytime = daytime(-1);
        System.out.println(daytime);
        String daytime1 = daytime(7);
        System.out.println(daytime1);
        System.out.println(daytime(13));
        System.out.println(daytime(18));
        System.out.println(daytime(2));
    }

    static String daytime(int hour) {
        if (hour > 24 || hour < 0) {
            return "Invalid data";
        } else if (hour > 21 || hour < 6) {
            return "Good night";
        } else if (hour >= 15) {
            return "Good evening";
        } else if (hour >= 11) {
            return "Good after noon";
        } else {
            return "Good morning";
        }
    }
}
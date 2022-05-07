package MnogopotokHome;

public class SearchLetter extends Thread {
    String[] array;

    @Override
    public void run() {
        char tmp = array[0].charAt(0);
        for (int i = 1; i < array.length; i++) {
            if (tmp > array[i].charAt(0)) {
                tmp = array[i].charAt(0);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (tmp == array[i].charAt(0))
                System.out.println("Начинается строка с буквы, которая ближе всех к началу алфавита - " + (i + 1));
        }
    }
}

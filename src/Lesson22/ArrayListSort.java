package Lesson22;

import java.util.ArrayList;

public class ArrayListSort {
    // есть лист в нем несколько строк
    // отсортировать строки по кол-ву символов в строке
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("Я узнал, что у меня Есть огромная семья");
        text.add("И тропинка, и лесок");
        text.add("В поле каждый колосок");

        for (int i = 0; i < text.size()-1; i++) {
            for (int j = i+1; j < text.size(); j++) {
                if (text.get(i).length()>text.get(j).length()){
                    String temp;
                    temp = text.get(i);
                    text.set(i, text.get(j));
                    text.set(j, temp);
                }
            }
        }
        System.out.println(text);
    }
}

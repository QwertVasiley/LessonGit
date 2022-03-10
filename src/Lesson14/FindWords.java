package Lesson14;

import java.util.Arrays;

public class FindWords {
    public static void main(String[] args) {
        //Есть массив слов. Нужно отфильтровать его так,
        // чтобы в выходном массиве оказались слова, которые начинаются
        // с буквы “W”/”w”. Было: {"width", "ellipse", "Wrong", "hyperbola", стало: [width, Wrong]
        String[] textArray = {"width", "ellipse", "Wrong", "hyperbola"};
        String [] newTextArray = new String[findWw (textArray)];
        newTextArray = addToArray(textArray,newTextArray);
        System.out.println(Arrays.toString(newTextArray));

    }

    static int findWw(String textArray[]) { //считаем кол-во слов с W w
        int tmp = 0;
        for (int i = 0; i < textArray.length; i++) {
            if ((textArray[i].indexOf('w') == 0) || (textArray[i].indexOf('W') == 0)) {
                tmp++;
            }
        }
        return tmp;
    }
    static String [] addToArray (String[] arr1, String []arr2){ //создаем новый массив с W w
        int tmp=0;
        for (int i = 0; i < arr1.length; i++) {
            if ((arr1[i].indexOf('w') == 0) || (arr1[i].indexOf('W') == 0)) {
                arr2[tmp]= arr1[i];
               tmp++;
            }
        }
        return arr2;
    }
}


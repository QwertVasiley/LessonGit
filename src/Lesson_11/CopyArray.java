package Lesson_11;

import java.util.Arrays;

public class CopyArray {
    //скопировать один массив в другой ( в коментарии: так делать не правильно)
    public static void main(String[] args) {
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};

//        int [] arrayNew;
//        arrayNew = array;
//        System.out.println(Arrays.toString(arrayNew));
//    }
//}

        //Верный способ
        int[] array2;
        array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}

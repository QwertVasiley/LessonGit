package Exam2;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {

// 1)	Реализовать следующую программу:
// Пользователю предоставляется возможность на выбор заполнить целочисленный массив или массив слов
// Если выбран массив чисел, то есть 2 варианта заполнения:
// а) самостоятельно, б) рандомными числами
//  Выполнить над массивом следующие действия:
//•	Поиск максимального (минимального (можете 2 реализовать если успеете)) элемента
//•	Вернуть первый индекс введенного им элемента, иначе -1
//•	Сортировка
//  Если был выбран массив слов, то
//•	Отсортировать массив слов по алфавиту (лексикографически)
//•	Пользователю предоставляется возможность ввести букву. Вместо этой буквы теперь будет рандомное число (String.valueOf(randomNumber))

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose array to work with: \n 1 - numbers \n 2 - strings ");
        int chooseArray = arraySelection(scanner);
        System.out.println(chooseArray);

    }
    static int arraySelection (Scanner scanner){ //выбор массива текстового или числового

        int number = scanner.nextInt();
        return number;
    }
}

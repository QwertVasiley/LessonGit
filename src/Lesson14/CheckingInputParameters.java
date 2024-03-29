package Lesson14;

public class CheckingInputParameters {
    public static void main(String[] args) {
        //проверка на ввод E-mail
        String email = "No@mail.da";
        boolean result = email.matches("(\\w*)(\\@)(\\w*)(\\.)(\\w*)");  // \\w - алфовитно-цифровые значения
        if (result) {
            System.out.println("Good");
        } else {
            System.out.println("Bead");
        }
    }
}
//    Конструкция Regex	Что считается совпадением
//        .	    Любой символ
//        ?	    Ноль (0) или одно (1)повторение предшествующего
//        *	    Ноль (0) или более повторений предшествующего
//        +	    Одно (1) или более повторений предшествующего
//        []	Диапазон символов или цифр
//        ^	    Отрицание последующего (то есть, "не что-то")
//        \d	Любая цифра (иначе, [0-9])
//        \D	Любой нецифровой символ (иначе, [^0-9])
//        \s	Любой символ-разделитель (иначе, [\n\t\f\r])
//        \S	Любой символ, отличный от разделителей (иначе, [^\n\t\f\r])
//        \w	Любая буква или цифра (иначе, [A-Za-Z_0-9])
//        \W	Любой знак, отличный от буквы или цифры (иначе, [^\w])

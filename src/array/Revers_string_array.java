package array;

public class Revers_string_array {
    public static void main(String[] args) {

        //Есть массив слов. Нужно инвертировать его порядок.


        String[] family = {"Mother",
                "Father",
                "Sister",
                "Brother"};

        for (int i = family.length-1 ; i >=0; i--) {
            System.out.println(family[i]);
        }
    }
}

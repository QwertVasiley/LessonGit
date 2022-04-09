package Homework20;

import java.util.TreeSet;

public class TreeSetReverse {  // Есть TreeSet чисел, нужно отсортировать его в обратном порядке
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(-15);
        numbers.add(27);
        numbers.add(94);
        numbers.add(-21);
        numbers.add(46);
        numbers.add(71);
        System.out.println("TrreSet numbers" + numbers);
        TreeSet<Integer> numbersRevers = (TreeSet<Integer>) numbers.descendingSet(); // descendingSet сортирует в обратную сторону
        System.out.println("Revers TreeSet " + numbersRevers);
    }
}

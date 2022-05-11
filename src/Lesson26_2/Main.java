package Lesson26_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer [] arr = {1,6,8};
        SelfList <Integer>selfList = new SelfList<>(arr);
        selfList.add(4);
        selfList.add(15);
        System.out.println(Arrays.toString(selfList.getList()));

    }
}

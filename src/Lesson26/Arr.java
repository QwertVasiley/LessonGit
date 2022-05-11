package Lesson26;

import java.util.Arrays;

public class Arr<T> {
    private T[] array;

    public Arr (T [] array){
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "Arr{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

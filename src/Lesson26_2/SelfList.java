package Lesson26_2;

public class SelfList <T> {
    private T [] list;
    private int size = 5; //сразу казали размер List
    private int actualSize; //актуальное количество объектов добавленных

    public SelfList(T[] list) {
        this.list = list;
        this.size = list.length;
    }

    public T[] getList() {
        return list;
    }

    public void add (T el){
        T[] srr;
        srr = list.clone();  //конирует уэе существующий

        this.list = (T[]) new Object[srr.length];
        for (int i = 0; i < srr.length; i++) {
            this.list[i] = srr[i];
        }

        this.list[list.length-1] = el;
    }
}

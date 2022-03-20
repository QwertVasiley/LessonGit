package Animal;

public class Zoo {
    private int count;
    private Animal[] animalsArray;

    public Zoo() {
        this.count = 0;
        this.animalsArray = new Animal[10];//до 10 животных
    }

    public void addAnimal(Animal animal) {
        animalsArray[count] = animal;
        count++;
    }

    public void sound() {
        System.out.println("Кол-во животных: " + count);
        for (int i = 0; i < count; i++) {
            animalsArray[i].sound();
            System.out.print(animalsArray[i].getName());
            System.out.println();
        }
    }
}

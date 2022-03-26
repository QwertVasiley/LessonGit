package AbstrackClass;

public class Cat extends Animal{
    private String name;

    public void  imya  (String name){
        System.out.println(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Moor moor");
    }
}

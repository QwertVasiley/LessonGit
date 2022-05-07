package Konstruktor;

public class Vegetable {

    String apple;
    String tomato;
    String carrots;
    String spinach;

    public Vegetable (String apple,String tomato, String carrots, String spinach){
        this(carrots, spinach);
        this.tomato = tomato;
        this.apple = apple;

    }
    public Vegetable (String carrots, String spinach){
      this();  //должен вызвать конструктор без параметров, всегда пишется первой строчкой!
        this.carrots = carrots;
        this.spinach = spinach;
    }
    public Vegetable(){
        System.out.println("Это конструктор без параметров");
    }

}

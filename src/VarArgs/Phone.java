package VarArgs;

import java.util.Arrays;

public class Phone {
    int number;
    String model;

    Phone(){
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    void sendMessage (int number, String... txt){ //множество аргументов String
        System.out.print(number+ " ");
        System.out.println(Arrays.toString(txt));
    }
}

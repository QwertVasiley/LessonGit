package Task11;

public class Main {
    public static void main(String[] args) {
        Computer hp = new Hp();
        callMethods(hp);
        Asus asus = new Asus();
        callMethods(asus);
    }

    public static void callMethods(Computer computer) {
        computer.turnOff();
        computer.turnOn();
        computer.turnReset();
    }
}
